/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import database.SourceMariaDB;
import database.DaoEmp;
import ihm.Login;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author Thinkpad-Falcort
 */
public class Application
{
    public static void main(String[] args)
    {
        DataSource database;
        Connection connection;
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.print(e.getMessage());
        }
        
        boolean connected = false;
        Login loginWindow = new Login();
        /*do
        {
           Login loginWindow = new Login();
           connected = true;
        }
        while(connected == false);*/
    }
}
