<?php
/**
 * The default class of the website
 *
 * This file contains the Bootstrap class <br />
 *
 * @category   classes
 * @package    classes
 * @author     Thibault SOUQUET
 * @version    1.0
 * @since      2.0
 * @todo Understand the file
 */

/**
 * Class Bootstrap
 *
 * This in the base class of the website <br />
 *
 *
 * @version 1.0
 * @author Tibault SOUQUET
 * @todo Complete this class and comment
 */
class Materialize
{
    /**
     * @var string The content of the URL ?content=XXX
     * @access private
     */
    private $controller;

    /**
     * @var string The content of the URL ?action=XXX
     * @access private
     */
    private $action;

    /**
     * @var mixed The array containing the URL information
     * @access private
     */
    private $request;

    /**
     * Bootstrap constructor.
     *
     * This constructor get the URL information <br />
     * it will make them into @var <br />
     * So then, we can create a controller
     *
     * @param mixed $request The URL information
     * @author Thibault SOUQUET
     * @version 1.0
     * @access public
     */
    public function __construct($request)
    {
        $this->request = $request;
        if($this->request['controller'] == "")
        {
            $this->controller = 'home';
        }
        else
        {
            $this->controller = $this->request['controller'];
        }

        if($this->request['action'] == "")
        {
            $this->action = 'index';
        }
        else
        {
            $this->action = $this->request['action'];
        }
    }

    /**
     * Create controller
     *
     * This class take the @vars <br />
     * And with them create the good class to make the corresponding page of the website
     *
     * @return mixed -1 if error, else the controller
     * @author Thibault SOUQUET
     * @version 1.0
     * @access public
     */
    public function createController()
    {
        if(class_exists($this->controller))
        {
            $parents = class_parents($this->controller);
            if(in_array("Controller", $parents))
            {
                if(method_exists($this->controller, $this->action))
                {
                    return new $this->controller($this->action, $this->request);
                }
                else
                {
                    echo '<h1>Method does not exist</h1>';
                    return -1;
                }
            }
            else
            {
                echo '<h1>Base controller not found</h1>';
                return -1;
            }
        }
        else
        {
            echo '<h1>The controller class does not exist</h1>';
            return -1;
        }
    }
}
