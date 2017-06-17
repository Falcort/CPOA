<sections id="Pictures">
    <div class="container">
        <div class="center-align">
            <h1>VIPs Pictures</h1>
            <div class="row center-align valign-wrapper">
                <?php
                for ($i = 0;
                $i < count($viewModel);
                $i++)
                {
                if ($i % 3 == 0)
                { ?>
            </div>
            <div class="row center-align valign-wrapper">
                <?php } ?>

                <a href="/Pictures/detailed/<?php echo $viewModel[$i]['idPhoto']; ?>" class="col s12">
                    <button type="submit" style="border: none; background: none;">
                        <img class="responsive-img tooltipped" src="<?php echo $viewModel[$i]['wayPhoto']; ?>"
                             data-position="right"
                             data-delay="50"
                             data-tooltip="<?php echo($viewModel[$i]['yearPhoto'] . " - " . $viewModel[$i]['placePhoto'] . " : " . $viewModel[$i]['lastNameVIP'] . " " . $viewModel[$i]['firstNameVIP']); ?>">
                    </button>
                </a>
                <?php } ?>
            </div>
        </div>
    </div>
</sections>