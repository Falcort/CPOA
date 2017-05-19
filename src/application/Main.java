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
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.print(e.getMessage());
        }
        
        boolean connected = false;
        
         boolean etat = false;
        do {
            Login loginWindow = new Login(null);
            PasswordAuthentication login = loginWindow.identifier();
            /*try {
                database = SourceMariaDB.getSource(login);
                connection = database.getConnection();
                etat = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(),
                        "avertissement", JOptionPane.WARNING_MESSAGE);
            }*/
            String password = login.getPassword().hashCode() + "";
            System.out.println("password " + password);
            System.out.println("login " + login.getUserName());
            if(password.equals("96639997") || (login.getUserName().equals("")))
            {
                showMessageDialog(null, "Champs vides !");
                etat = false;
            }
            else
            {
                 showMessageDialog(null, "Ok !");
                 etat = true;
            }
        } while (etat == false); // tant que la saisie n'est pas correcte
    
    }
}
