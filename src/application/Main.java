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
        
          
        



        // Etablissement de la connexion à la base MariaDB avec affichage de la fenetre d'identification 
        boolean etat = false;
        do {
           
            PasswordAuthentication login = loginWindow.identifier();
            try {
                laSourceDeDonnees = SourceMariaDB.getSource(login);
                laConnexion = laSourceDeDonnees.getConnection();
                etat = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "login incorrect : " + ex.getMessage(),
                        "avertissement", JOptionPane.WARNING_MESSAGE);
            }
        } while (etat == false); // tant que la saisie n'est pas correcte
    
    
    }
}
