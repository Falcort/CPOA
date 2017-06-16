<div class="col s12 m9 l10">
    <?php foreach ($viewModel as $VIP) : ?>
        <div class="card horizontal scrollspy pin-top" id="<?php echo $VIP['numVIP']; ?>">
            <!--<div class="card-image">
              <img src="http://lorempixel.com/100/190/nature/6">
            </div>-->
            <div class="card-stacked">
                <div class="card-content">
                    <h5><?php echo($VIP['lastNameVIP'] . " " . $VIP['firstNameVIP']); ?></h5>
                    <div class="col s6">
                        <p><b>Birthdate</b> : <?php echo $VIP['bornDate']; ?></p>
                        <p><b>Birth place</b> : <?php echo $VIP['bornPlace']; ?></p>
                    </div>
                    <div class="col s6">
                        <p><b>Role</b> : <?php echo $VIP['codeRole']; ?></p>
                        <p><b>Nationality</b> : <?php echo $VIP['nationality']; ?></p>
                    </div>
                </div>
                <div class="card-action">
                    <a href="/VIP/detailed/<?php echo $VIP['numVIP']; ?>">View profile</a>
                </div>
            </div>
        </div>
    <?php endforeach; ?>
</div>

<div class="col hide-on-small-only m3 l2">
    <ul class="section table-of-contents scrollNav">
        <?php foreach ($viewModel as $VIP) : ?>
            <li>
                <a href="#<?php echo $VIP['numVIP']; ?>"><?php echo($VIP['lastNameVIP'] . " " . $VIP['firstNameVIP']); ?></a>
            </li>
        <?php endforeach; ?>
    </ul>
</div>

<script>
    $(document).ready(function () {
        $('.scrollspy').scrollSpy();
        $('.scrollNav').pushpin({
            offset: 150
        });
    });
</script>
