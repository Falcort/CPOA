<?php
/**
 * The database class of the webiste
 *
 * This file contain the main class for the database
 *
 * @package classes
 * @category classes
 * @subpackage database
 * @since 1.0
 *
 */

/**
 * Class model
 *
 * All the functions insides ares Overriding of existing PDO functions<br />
 * You will have a lot of basic function, and more detailed ones
 *
 * @acces public
 * @author Thibault SOUQUET
 * @version 2.5
 * @todo All THE TRY CATCH
 */
abstract class Model
{
    /**
     * @var mixed The Database handler
     */
    private $dbh;

    /**
     * @var mixed The current statement
     */
    private $stmt;


    public function __construct()
    {
        $dsn = DB_TYPE . ':host=' . DB_HOST . '; dbname=' . DB_NAME;
        $options = array(
            PDO::ATTR_PERSISTENT => true,
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
        );
        try {
            $this->dbh = new PDO($dsn, DB_USER, DB_PASSWORD, $options);
        } catch (PDOException $e) {
            if (DEBUG) {
                die('Error : ' . $e->getMessage());
            } else {
                $this->logDB($e, 'LANG');
            }
        }
    }

    /**
     * Log function
     *
     * This funnction is here to log error of the debug is false<br />
     * It will log the error with de the date and time<br />
     * This log file wontrains a maximun of 5000000 lines<br />
     * If this file is too large it will create an other one<br />
     * The file is "log/database_log.log"
     *
     * @param mixed $error the error object return by PDO
     * @param string $message the error message displayed by PDO
     * @access  private
     * @author  Eric DUFOUR
     * @author  Thibault SOUQUET
     * @version 1.2
     */
    private function logDB($error, $message)
    {
        if (isset($_SESSION['id_user'])) {
            $login = $_SESSION['login'];
        } else {
            $login = "";
        }

        $date = strftime("%Y-%m-%d %H:%M:%S");
        $who = getenv('REMOTE_ADDR');
        $page = $_SERVER['PHP_SELF'] . " " . $_SERVER['QUERY_STRING'];
        $hostname = @gethostbyaddr($_SERVER['REMOTE_ADDR']);
        $trac = getenv('HTTP_USER_AGENT');
        $refer = getenv('HTTP_REFERER');

        if (!strstr($page, '404')) {
            $log_file = PATH_FILES . PATH_LOGS . 'database_log.log';

            if (file_exists($log_file)) {
                $fp = fopen("$log_file", 'r+');
                $fsz = filesize("$log_file");

                if ($fsz >= 5000000) {
                    fclose($fp);
                    $date1 = str_replace('-', '', $date);
                    $date2 = str_replace(':', '', $date1);
                    $date3 = str_replace(' ', '_', $date2);
                    $oldf = str_replace('.log', '', $log_file) . "_" . $date3 . ".log";
                    rename($log_file, $oldf);

                    $fp = fopen("$log_file", "x+");
                    $fsz = filesize("$log_file");
                } else {
                    $fp = fopen("$log_file", 'x+');
                    $fsz = filesize("$log_file");
                }
                fseek($fp, $fsz);
                fputs($fp, "$date # $who # $login # $hostname # $trac # $refer # $page\n");
                fputs($fp, "$message # $error \n\n");
                fclose($fp);
            }
        }
    }

    /**
     * Last insert ID
     *
     * I suppose it return true if the last query was a success ?
     *
     * @return mixed return the object query
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     * @todo Well understand
     */
    public function lastInsertId()
    {
        return $this->dbh->lastInsertId();
    }

    /**
     * Increase the BruteForce var
     *
     * This function is called when the user fail to connect <br />
     * this increase by 1 his current CheckBrute number
     *
     * @param int $id ID of the account
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     * @todo Implement error message
     */
    public function checkBruteIncrease($id)
    {
        $this->query("SELECT time FROM php_logins_attempts WHERE id_user = :id");
        $this->bind(':id', $id);
        $row = $this->single();
        $time = $row['time'];
        $time++;

        $this->begin();
        $this->query("UPDATE php_logins_attempts SET time=:time,date=SYSDATE() WHERE id_user = :id");
        $this->bind(':time', $time);
        $this->bind(':id', $id);
        $this->execute();

        $this->commit();
    }

    /**
     * Query base function
     *
     * This query only prepare the Database handler for a SQL query
     *
     * @param string $query the query in string
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function query($query)
    {
        $this->stmt = $this->dbh->prepare($query);
    }

    /**
     * Bind function
     *
     * This function bind to a query the params <br />
     * it search for the type of the value for a good entry en database <br />
     * Then it bind the value to the good param
     *
     * @param string $param
     * @param mixed $value
     * @param mixed $type
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function bind($param, $value, $type = null)
    {
        if (is_null($type)) {
            switch (true) {
                case is_int($value):
                    $type = PDO::PARAM_INT;
                    break;
                case is_bool($value):
                    $type = PDO::PARAM_BOOL;
                    break;
                case is_null($value):
                    $type = PDO::PARAM_NULL;
                    break;
                default:
                    $type = PDO::PARAM_STR;
            }
        }
        $this->stmt->bindValue($param, $value, $type);
    }

    /**
     * The execute for single line queries
     *
     * This function is design to first execute the query<br />
     * Then fetch the result (FETCH_ASSOC)<br />
     * This function is designed for single lines queries
     *
     * @return mixed return the object query
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function single()
    {
        $this->execute();
        return $this->stmt->fetch(PDO::FETCH_ASSOC);
    }

    /**
     * Execute the current query
     *
     * This function execute the current query, but with no return to the user<br />
     * Basicly this function is here for query with "UPDATE, INSERT INTO, DELETE..."
     *
     * @return mixed execute the query
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function execute()
    {
        return $this->stmt->execute();
    }

    /**
     * Begin transaction
     *
     * This function start a transaction with a database <br />
     * if there is no commit, nothing will be saved
     *
     * @return mixed Start transaction
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     * @todo Complete it and add Lang
     */
    public function begin()
    {
        try {
            return $this->dbh->beginTransaction();
        } catch (PDOException $error) {
            if (DEBUG == false) {
                $this->logDB($error, Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
                die(Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
            } else {
                die('Erreur : ' . $error->getMessage());
            }
        }
    }

    /**
     * Commit Transaction
     *
     * This function save the current transaction with the Database.
     *
     * @return mixed
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function commit()
    {
        try {
            return $this->dbh->commit();
        } catch (PDOException $error) {
            if (DEBUG == false) {
                $this->logDB($error, Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
                die(Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
            } else {
                die('Erreur : ' . $error->getMessage());
            }
        }
    }

    /**
     * Reset CheckBrute
     *
     * This function return to 0 the CheckBrute <br />
     * basically it means that the user manager to connect before 5 attempts
     *
     * @param int $id ID of the account
     * @access  public
     * @author  Thibault SOUQUET
     * @version 2.0
     * @todo Implement error message
     */
    public function CheckBruteReset($id)
    {
        if (!$this->checkBrute($id)) {
            $this->begin();
            $this->query("UPDATE php_logins_attempts SET time = 0 WHERE id_user=:id");
            $this->bind(':id', $id);
            $this->execute();
            $this->commit();
        }
        die('Error');
    }

    /**
     * Check BruteForce
     *
     * this function test if an account is BruteForce or not
     *
     * @param int $id ID of the account
     * @return bool
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function checkBrute($id)
    {
        $this->query("SELECT time FROM php_logins_attempts WHERE id_user = :id");
        $this->bind(':id', $id);
        $row = $this->single();
        $time = $row['time'];
        if ($time >= 5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Check Username
     *
     * This function test if the given username is already registered in the database or not <br />
     * True if it not in the database, and false if it is already use
     *
     * @param string $username The username to validate
     * @return bool
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function isAvailableUsername($username)
    {
        $this->query("SELECT username FROM php_users WHERE username=:username");
        $this->bind(':username', $username);
        $this->resultSet();
        $row_count = $this->rowCount();
        if ($row_count >= 1) {
            return false;
        }
        return true;
    }

    /**
     * Execute for multi-lines query
     *
     * This function is design to execute a query, and fetch it (FECTH_ASSOC)<br />
     * This is the same as "single()" function but desgined for multi-lines queries
     *
     * @return mixed the query object
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function resultSet()
    {
        $this->execute();
        return $this->stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    /**
     * Row Count
     *
     * This function return the number of rows of the executed query
     *
     * @return int The number of rows
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function rowCount()
    {
        try {
            return $this->stmt->rowCount();
        } catch (PDOException $error) {
            if (DEBUG == false) {
                $this->logDB($error, Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
                die(Functions::getLang(LANG)->{'ERREUR_QUERY_DB'});
            } else {
                die('Erreur : ' . $error->getMessage());
            }
        }
    }

    /**
     * Check Username
     *
     * This function test if the given email is already registered in the database or not <br />
     * True if it not in the database, and false if it is already use
     *
     * @param string $email The email to validate
     * @return bool
     * @access  public
     * @author  Thibault SOUQUET
     * @version 1.0
     */
    public function isAvailableEmail($email)
    {
        $this->query("SELECT email FROM php_users WHERE email=:email");
        $this->bind(':email', $email);
        $this->resultSet();
        $row_count = $this->rowCount();
        if ($row_count >= 1) {
            return false;
        }
        return true;
    }
}
