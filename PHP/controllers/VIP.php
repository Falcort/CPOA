<?php
/**
 * This is the extended Star Citizen class of the website
 *
 * This file is the list of all Star Citizen ships
 *
 * @category   controllers
 * @package    controllers
 * @author     Thibault SOUQUET
 * @version    1.0
 * @since      2.0
 */

/**
 * Class StarCitizen
 *
 * This class is the Home page of the Star Citizen section <br />
 *
 * @version 1.0
 * @author Tibault SOUQUET
 */
class VIP extends Controller
{
    /**
     * The default action of the class
     *
     * This class i called by the "executeAction() in the index
     *
     * @author Thibault SOUQUET
     * @access protected
     */
    protected function index()
    {
        $viewModel = new VIPModel();
        $this->getView($viewModel->index(), true);
    }

    protected function detailed()
    {
        $viewModel = new VIPModel();
        $this->getView($viewModel->detailed(), true);
    }
}
