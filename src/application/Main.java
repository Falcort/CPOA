/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import database.SourceMariaDB;
import ihm.Login;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Thinkpad-Falcort
 */
public class Main
{
    public static void main(String[] args)
    {
        DataSource database;
        Connection connection = null;
   
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            System.out.print(e.getMessage());
        }
        boolean connected = false;
        
        boolean etat = false;
        do
        {
            Login loginWindow = new Login(null);
            PasswordAuthentication login = loginWindow.identifier();
            
            String password = String.valueOf(login.getPassword());
            if(password.equals("") || (login.getUserName().equals("")))
            {
                showMessageDialog(null, "Champs vides !", "Erreur", JOptionPane.ERROR_MESSAGE);
                etat = false;
            }
            else
            {
                try
                {
                    database = SourceMariaDB.getSource(login);
                    connection = database.getConnection();
                    etat = true;
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(), "avertissement", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        while (etat == false);
        showMessageDialog(null, "Vous ete conectez", "Succes", JOptionPane.INFORMATION_MESSAGE);
    }
}
