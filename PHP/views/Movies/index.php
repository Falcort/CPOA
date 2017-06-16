<h1>Movies</h1>

<div class="col s12 m9 l10">
    <?php foreach ($viewModel as $movie) : ?>
        <div class="card horizontal scrollspy pin-top" id="<?php echo $movie['numVisa']; ?>">
            <!--<div class="card-image">
              <img src="http://lorempixel.com/100/190/nature/6">
            </div>-->
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
</div>

<div class="col hide-on-small-only m3 l2">
    <ul class="section table-of-contents scrollNav">
        <?php foreach ($viewModel as $movie) : ?>
            <li><a href="#<?php echo $movie['numVisa']; ?>"><?php echo($movie['title']); ?></a></li>
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
