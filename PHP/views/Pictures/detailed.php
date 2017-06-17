<section id="PicturesD">
    <div class="row" style="margin-top: 25px;">
        <a href="#modal1"><img src="<?php echo $viewModel[0]['wayPhoto']; ?>" style="max-height: 50%;" class="col s6"></a>
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
    <div id="modal1" class="modal">
        <div class="modal-content">
            <div class="container">
                <div class="row">
                    <img src="<?php echo $viewModel[0]['wayPhoto']; ?>" class="col s12">
                </div>
            </div>
        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Close</a>
        </div>
    </div>
    <script>
        $(document).ready(function(){
            // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
            $('.modal').modal();
        });
    </script>
</section>