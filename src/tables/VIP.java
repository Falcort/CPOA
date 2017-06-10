package tables;

import java.time.LocalDate;

public class VIP
{

    private int numVIP;
    private String firstName;
    private String lastName;
    private String civilite;
    private LocalDate bornDate;
    private String whereBorn;
    private String codeStatus;
    private String codeRole;
    private String nationality;

    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public VIP(int numVIP, String firstName, String lastName, String civilite, LocalDate bornDate, String whereBorn, String codeStatus, String codeRole, String nationality)
    {
        this.numVIP = numVIP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.civilite = civilite;
        this.bornDate = bornDate;
        this.whereBorn = whereBorn;
        this.codeStatus = codeStatus;
        this.codeRole = codeRole;
        this.nationality = nationality;
    }

    public VIP()
    {

    }

    public int getNumVIP()
    {
        return numVIP;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCivilite()
    {
        return civilite;
    }

    public LocalDate getBornDate()
    {
        return bornDate;
    }

    public String getWhereBorn()
    {
        return whereBorn;
    }

    public String getCodeStatus()
    {
        return codeStatus;
    }

    public void setNumVIP(int numVIP)
    {
        this.numVIP = numVIP;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setCivilite(String civilite)
    {
        this.civilite = civilite;
    }

    public void setBornDate(LocalDate bornDate)
    {
        this.bornDate = bornDate;
    }

    public void setWhereBorn(String whereBorn)
    {
        this.whereBorn = whereBorn;
    }

    public void setCodeStatus(String codeStatus)
    {
        this.codeStatus = codeStatus;
    }

    public void setCodeRole(String codeRole)
    {
        this.codeRole = codeRole;
    }

    public String getCodeRole()
    {
        return codeRole;
    }
}
