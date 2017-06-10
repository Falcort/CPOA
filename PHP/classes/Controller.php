<?php
/**
 * The base of controllers
 *
 * This file is contains the base structure of the controllers
 *
 * @category   classes
 * @package    classes
 * @subpackage controllers
 * @author     Thibault SOUQUET
 * @version    1.0
 * @since      2.0
 * @todo Understand the file
 */

/**
 * Class Controller
 *
 * This is the base of the controller, all the pages are extended of this class
 *
 *
 * @version 1.0
 * @author Tibault SOUQUET
 * @todo Complete this class and comment
 */
abstract class Controller
{
    /**
     * @var string The ?controller=
     * @access protected
     */
    protected $request;

    /**
     * @var string The ?action=
     * @access protected
     */
    protected $action;

    /**
     * Controller constructor.
     *
     * This constructor is basic <br />
     * it only affect the parameters to global vars
     *
     * @param string $action the ?action=
     * @param string $request the ?controller=
     * @access public
     * @author Thibault SOUQUET
     */
    public function __construct($action, $request)
    {
        $this->request = $request;
        $this->action = $action;
    }

    /**
     * Execute action
     *
     * This is executed by the index to call the base function of the controller <br />
     * this create the HTML content of the page
     *
     * @return mixed Execute the action() of the controller
     * @access public
     * @author Thibault SOUQUET
     */
    public function executeAction()
    {
        return $this->{$this->action}();
    }

    /**
     * Get view
     *
     * I don't know
     *
     * @param $view_model
     * @param $full_view
     * @author Thibault SOUQUET
     * @access public
     * @todo Understand
     */
    protected function getView($viewModel, $full_view)
    {
        $view = 'views/' . get_class($this) . '/' . $this->action . '.php';
        if($full_view)
        {
            require('views/main.php');
        }
        else
        {
            require($view);
        }
    }
}
