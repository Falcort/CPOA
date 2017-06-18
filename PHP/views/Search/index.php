<?php if($viewModel[0] != null) : ?>
    <h1>VIP :</h1>
    <?php foreach ($viewModel[0] as $VIP) : ?>
        <div class="card horizontal scrollspy pin-top" id="<?php echo $VIP['numVIP']; ?>">
            <?php if($VIP['wayPhoto'] != "0") : ?>
                <div class="card-image">
                    <img src="<?php echo $VIP['wayPhoto']; ?>">
                </div>
            <?php endif; ?>
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
<?php endif; ?>

<?php if($viewModel[1] != null) : ?>
    <h1>Movies :</h1>
    <?php foreach ($viewModel[1] as $movie) : ?>
        <div class="card horizontal scrollspy pin-top" id="<?php echo $movie['numVisa']; ?>">
            <div class="card-stacked">
                <div class="card-content">
                    <h5><?php echo($movie['title']); ?></h5>
                    <div class="col s4">
                        <p><b>Visa</b> : <?php echo $movie['numVisa']; ?></p>
                    </div>
                    <div class="col s4">
                        <p><b>release Date</b> : <?php echo $movie['releaseDate']; ?></p>
                    </div>
                    <div class="col s4">
                        <p><b>Genre</b> : <?php echo $movie['genreWording']; ?></p>
                    </div>
                </div>
                <div class="card-action">
                    <a href="/Movies/detailed/<?php echo $movie['numVisa']; ?>">View details</a>
                </div>
            </div>
        </div>
    <?php endforeach; ?>
<?php endif; ?>