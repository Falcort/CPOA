<section id="PicturesD">
    <div class="container">
        <div class="row" style="margin-top: 25px;">
            <img src="<?php echo $viewModel[0]['wayPhoto']; ?>" style="max-height: 50%;" class="col s6">
            <div class="col s6">
                <h1>Details</h1>
                <p>When : <?php echo $viewModel[0]['yearPhoto']; ?></p>
                <p>Where : <?php echo $viewModel[0]['placePhoto']; ?></p>
                <table class="striped">
                    <tr>
                        <th>VIP(s)</th>
                        <th>Actions</th>
                    </tr>
                    <?php foreach($viewModel[1] as $VIP) :; ?>
                        <tr>
                            <td><?php echo($VIP['firstNameVIP'] ." " . $VIP['lastNameVIP']); ?></td>
                            <td><a href="/VIP/detailed/<?php echo $VIP['numVIP']; ?>" class="waves-effect waves-light btn">View profile</a></td>
                        </tr>
                    <?php endforeach; ?>
                </table>
            </div>
        </div>
    </div>
</section>