<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr">
<head>
    <link rel="stylesheet" href="<?php echo PATH_ROOT . PATH_ASSERTS . PATH_CSS . 'materialize.css'; ?>">
    <link rel="stylesheet" href="<?php echo PATH_ROOT . PATH_ASSERTS . PATH_CSS . 'style.css'; ?>">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script type="application/javascript"
            src="<?php echo PATH_ROOT . PATH_ASSERTS . PATH_JS . 'jquery.js'; ?>"></script>
    <script type="application/javascript"
            src="<?php echo PATH_ROOT . PATH_ASSERTS . PATH_JS . 'materialize.js'; ?>"></script>
    <title>VIP</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" charset="UTF-8">
</head>
<body>
<nav class="light-blue">
    <div class="nav-wrapper">
        <a href="/" class="brand-logo">
            <img src="<?php echo PATH_ROOT . PATH_ASSERTS . PATH_IMAGES . 'logo.png'; ?>"
                 style="max-height: 60px; margin-left: 10px;"/>
        </a>
        <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>

        <ul class="right hide-on-med-and-down">
            <li class="search" style=" height: 60px; margin: 2px 0; ">
                <form action="/Search" method="POST" style="color: black; background: white; padding-left: 5px; border-radius: 5px;">
                    <i class="material-icons left">search</i>
                    <input id="search" type="search" name="Search" class="z-depth-2" placeholder="Search" style="width: initial; margin-bottom: 0;">
                </form>
            </li>
            <li><a href="/VIP"><i class="material-icons left">perm_identity</i> VIP</a></li>
            <li><a href="/Pictures"><i class="material-icons left">perm_media</i> Pictures</a></li>
            <li><a href="/Movies"><i class="material-icons left">theaters</i> Movies</a></li>
        </ul>

        <ul class="side-nav" id="mobile-demo">
            <li class="search" style=" height: 60px; margin: 2px 0; ">
                <form action="/Search" method="POST" style="color: black; background: white; padding-left: 5px; border-radius: 5px;">
                    <i class="material-icons left">search</i>
                    <input id="search" type="search" name="Search" class="z-depth-2" placeholder="Search" style="width: initial; margin-bottom: 0;">
                </form>
            </li>
            <li><a href="/VIP"><i class="material-icons left">perm_identity</i> VIP</a></li>
            <li><a href="/Pictures"><i class="material-icons left">perm_media</i> Pictures</a></li>
            <li><a href="/Movies"><i class="material-icons left">theaters</i> Movies</a></li>
        </ul>
    </div>
</nav>
<script>
    $(document).ready(function () {
        $(".button-collapse").sideNav();
    });
</script>

<main>
    <div class="container">
        <?php require($view); ?>
    </div>
</main>

<footer class="page-footer">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">VIP</h5>
                <p class="grey-text text-lighten-4">Website of our CPOA project</p>
            </div>
            <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>
                    <li><a href="/VIP" class="grey-text text-lighten-3">VIP</a></li>
                    <li><a href="/Pictures" class="grey-text text-lighten-3">Pictures</a></li>
                    <li><a href="/Movies" class="grey-text text-lighten-3">Movies</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            © 2017 Copyright FONTEIX, MARTINEZ & SOUQUET
        </div>
    </div>
</footer>

</body>
</html>
