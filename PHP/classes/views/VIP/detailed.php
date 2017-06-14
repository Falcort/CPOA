
<div class="col s12 m9 l10">
  <h1 class="center-align"><?php echo($viewModel[0]['lastNameVIP'] . " " . $viewModel[0]['firstNameVIP']);?></h1>

  <h4 id="details scrollspy" class="scrollspy">Details</h4>
    <table>
      <tr>
        <th>Name :</th>
        <td><?php echo($viewModel[0]['lastNameVIP'] . " " . $viewModel[0]['firstNameVIP']);?> </td>
      </tr>
      <tr>
        <th>Civility :</th>
        <td><?php echo($viewModel[0]['civilityVIP']); ?> </td>
      </tr>
      <tr>
        <th>Birthdate :</th>
        <td><?php echo($viewModel[0]['bornDate']); ?> </td>
      </tr>
      <tr>
        <th>Birthplace :</th>
        <td><?php echo($viewModel[0]['bornPlace']); ?> </td>
      </tr>
      <tr>
        <th>Status :</th>
        <td><?php echo($viewModel[0]['codeStatus']); ?> </td>
      </tr>
      <tr>
        <th>Role :</th>
        <td><?php echo($viewModel[0]['codeRole']); ?> </td>
      </tr>
      <tr>
        <th>Nationality :</th>
        <td><?php echo($viewModel[0]['nationality']); ?> </td>
      </tr>
    </table>
  <h4 id="weddings" class="scrollspy">Weidding(s)</h4>
  <?php print_t($viewModel[2]); ?>

  <?php if($viewModel[1] != null) : ?>
  <h4 id="movies" class="scrollspy">Movies</h4>
  <?php endif; ?>

  <table>

  <?php if($viewModel[1] != null) : ?>
    <tr>
      <th>Visa</th>
      <th>Title</th>
      <th>Release Date</th>
      <th>Gender</th>
    </tr>
  <?php endif; ?>

  <?php foreach ($viewModel[1] as $movie) : ?>
    <tr>
      <td><?php echo $movie['numVisa']; ?></td>
      <td><?php echo $movie['title']; ?></td>
      <td><?php echo $movie['releaseDate']; ?></td>
      <td><?php echo $movie['gender']; ?></td>
    </tr>
  <?php endforeach; ?>

    </table>
  <h4 id="pictures" class="scrollspy">Pictures</h4>
</div>

<div class="col hide-on-small-only m3 l2">
  <ul class="section table-of-contents scrollNav">
      <li><a href="#details">Details</a></li>
      <li><a href="#weddings">Weidding(s)</a></li>

      <?php if($viewModel[1] != null) : ?>
      <li><a href="#movies">Movies</a></li>
      <?php endif; ?>

      <li><a href="#pictures">Pictures</a></li>
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
