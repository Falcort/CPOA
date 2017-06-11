<h1><?php echo($viewModel[0]['title']); ?></h1>
<div class="col s12 m9 l10">
  <h4 id="details" class="scrollspy">Details</h4>
  <table>
    <tr>
      <th>Visa :</th>
      <td><?php echo($viewModel[0]['numVisa']); ?> </td>
    </tr>
    <tr>
      <th>Title :</th>
      <td><?php echo($viewModel[0]['title']); ?> </td>
    </tr>
    <tr>
      <th>releaseDate :</th>
      <td><?php echo($viewModel[0]['releaseDate']); ?> </td>
    </tr>
    <tr>
      <th>Genre :</th>
      <td><?php echo($viewModel[0]['genreWording']); ?> </td>
    </tr>
  </table>
  <h4 id="realisator" class="scrollspy">Realisator</h4>
  <div class="card horizontal scrollspy pin-top" id="<?php echo $VIP['numVIP']; ?>">
    <!--<div class="card-image">
      <img src="http://lorempixel.com/100/190/nature/6">
    </div>-->
    <div class="card-stacked">
      <div class="card-content">
        <h5><?php echo($viewModel[2]['lastNameVIP']. " " . $viewModel[2]['firstNameVIP']); ?></h5>
      </div>
      <div class="card-action">
        <a href="/VIP/detailed/<?php echo $viewModel[2]['numVIP']; ?>">View profile</a>
      </div>
    </div>
  </div>
  <h4 id="casting" class="scrollspy">Casting</h4>
  <table>
    <tr>
      <th>Actor</th>
      <th>Role</th>
      <?php foreach ($viewModel[1] as $casting) : ?>
        <tr>
          <td><a href="/VIP/detailed/<?php echo $casting['numVIP']; ?>"><?php echo($casting['lastNameVIP']. " ".$casting['firstNameVIP']); ?></a></td>
          <td></td>
        </tr>
      <?php endforeach; ?>
    </tr>
  </table>
  <table>
  </table>
</div>
<div class="col hide-on-small-only m3 l2">
  <ul class="section table-of-contents scrollNav">
      <li><a href="#details">Details</a></li>
      <li><a href="#realisator">Realisator</a></li>
      <li><a href="#casting">Casting</a></li>
  </ul>
</div>

<script>
$(document).ready(function(){
   $('.scrollspy').scrollSpy();
   $('.scrollNav').pushpin({
    offset: 150
  });
 });
 </script>
