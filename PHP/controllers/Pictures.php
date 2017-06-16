<?php
/**
 * This is the extended Home class of the website
 *
 * This file is the main page of the website
 *
 * @category   controllers
 * @package    controllers
 * @author     Thibault SOUQUET
 * @version    1.0
 * @since      2.0
 */

/**
 * Class Home
 *
 * This class is the Home page of the website <br />
 * If nothing is specified in the URL it go here
 *
 * @version 1.0
 * @author Tibault SOUQUET
 * @todo Complete this class and comment
 */
class Pictures extends Controller
{
    /**
     * The default action of the class
     *
     * This class i called by the "execute_action() in the index
     *
     * @author Thibault SOUQUET
     * @access protected
     */
    protected function index()
    {
        $viewModel = new PicturesModel();
        $this->getView($viewModel->index(), true);
    }
}
