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
class Search extends Controller
{

    protected function index()
    {
        $viewModel = new SearchModel();
        $this->getView($viewModel->index(), true);
    }
}
