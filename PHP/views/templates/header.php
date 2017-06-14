<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="assets/css/materialize.css">
        <link rel="stylesheet" href="assets/css/font-awesome.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="application/javascript" src="assets/js/jquery.js"></script>
        <script type="application/javascript" src="assets/js/materialize.js"></script>
        <title>Animalus</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <nav>
            <div class="nav-wrapper">
                <a href="index" class="brand-logo">
                    <img src="assets/images/logo.gif" style="max-height: 60px;" />
                </a>
                <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="fa fa-bars" aria-hidden="true"></i></a>

                <ul class="right hide-on-med-and-down">
                  <form>
        <div class="input-field">
          <input id="search" type="search" required>
          <label class="label-icon" for="search"><i class="material-icons">search</i></label>
          <i class="material-icons">close</i>
        </div>
      </form>
                    <li><a href="search"><i class="material-icons left">search</i></a></li>
                    <li><a href="VIP"><i class="material-icons left">perm_identity</i>   VIP</a></li>
                    <li><a href="Movies"><i class="material-icons left">theaters</i>   Movies</a></li>
                </ul>

                <ul class="side-nav" id="mobile-demo">
                  <li><a href="search"><i class="material-icons left">search</i></a></li>
                  <li><a href="VIP"><i class="material-icons left">perm_identity</i>   VIP</a></li>
                  <li><a href="Movies"><i class="material-icons left">theaters</i>   Movies</a></li>
                </ul>
            </div>
        </nav>
        <script>
            $(document).ready(function () {
                $(".button-collapse").sideNav();
            });
        </script>
