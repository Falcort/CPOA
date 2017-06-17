<?php

class SearchModel extends Model
{

    public function index()
    {
        if(isset($_POST['Search']))
        {
            $this->query("SELECT * FROM VIP WHERE (firstNameVIP LIKE :search) OR (lastNameVip LIKE :search)");
            $this->bind(':search', "%".$_POST['Search']."%");
            $ResultVIP = $this->resultSet();

            $this->query("SELECT * FROM MOVIE, GENRE WHERE (title LIKE :search) AND GENRE.genreID = MOVIE.genre");
            $this->bind(':search', "%".$_POST['Search']."%");
            $ResultMovie = $this->resultSet();
            return array($ResultVIP, $ResultMovie);
        }
    }
}
