<div class="center-align">
    <h1>VIPs Pictures</h1>

    <div class="col s12">
        <?php foreach ($viewModel as $photo) : ?>
            <form action="" type="POST">
                <button type="submit" style="border: none; background: none;"><img class="responsive-img tooltipped" src="<?php echo $photo['wayPhoto']; ?>"
                                           data-position="right"
                                           data-delay="50"
                                           data-tooltip="<?php echo($photo['yearPhoto'] . " - " . $photo['placePhoto'] . " : " . $photo['lastNameVIP'] . " " . $photo['firstNameVIP']); ?>">
                    <input hidden type="text" value="<?php echo $photo['idPhoto']; ?>">
                </button>
            </form>
        <?php endforeach; ?>
    </div>
</div>
