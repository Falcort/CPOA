<?php

class SearchModel extends Model
{

    public function index()
    {
        if(isset($_POST['Search']))
        {
            $this->query("SELECT count(*), VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, VIP.civilityVIP, VIP.bornDate, VIP.bornPlace, VIP.codeStatus, VIP.codeRole, VIP.nationality, wayPhoto FROM VIP, PHOTO, TAG WHERE (firstNameVIP LIKE :search) OR (lastNameVip LIKE :search) AND TAG.idPhoto = PHOTO.idPhoto AND TAG.numVIP = VIP.numVIP GROUP BY VIP.numVIP UNION SELECT count(*), VIP.numVIP, VIP.lastNameVIP, VIP.firstNameVIP, VIP.civilityVIP, VIP.bornDate, VIP.bornPlace, VIP.codeStatus, VIP.codeRole, VIP.nationality, IFNULL(0,wayPhoto) FROM VIP, PHOTO, TAG WHERE (firstNameVIP LIKE :search) OR (lastNameVip LIKE :search) AND VIP.numVIP NOT IN (SELECT numVIP FROM TAG) GROUP BY VIP.numVIP");
            $this->bind(':search', "%".$_POST['Search']."%");
            $ResultVIP = $this->resultSet();

            $this->query("SELECT * FROM MOVIE, GENRE WHERE (title LIKE :search) AND GENRE.genreID = MOVIE.genre");
            $this->bind(':search', "%".$_POST['Search']."%");
            $ResultMovie = $this->resultSet();
            return array($ResultVIP, $ResultMovie);
        }
    }
}
