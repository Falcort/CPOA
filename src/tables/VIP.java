/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import java.time.LocalDate;

/**
 *
 * @author Thinkpad-Falcort
 */
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
    
    public VIP(int numVIP, String firstName, String lastName, String civilite, LocalDate bornDate, String whereBorn, String codeStatus, String codeRole)
    {
        this.numVIP = numVIP;
        this.firstName = firstName;
        this.lastName = lastName;
        this.civilite = civilite;
        this.bornDate = bornDate;
        this.whereBorn = whereBorn;
        this.codeStatus = codeStatus;
        this.codeRole = codeRole;
    }
    
    public VIP(){
        
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

    public String getCodeRole()
    {
        return codeRole;
    }
}
