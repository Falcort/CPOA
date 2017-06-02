package application;

import database.DaoMovie;
import database.DaoVIP;
import database.DaoWedding;
import database.SourceMariaDB;
import ihm.Login;
import ihm.MainMenu;
import java.net.PasswordAuthentication;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main
{
    private static DaoVIP daoVIP;

    public static DaoVIP getDaoVIP()
    {
        return daoVIP;
    }
    
    private static DaoMovie daoMovie;

    public static DaoMovie getDaoMovie()
    {
        return daoMovie;
    }
    
    private static DaoWedding daoWedding;

    public static DaoWedding getDaoWedding()
    {
        return daoWedding;
    }
    
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
        }while (etat == false);
        
        daoVIP = new DaoVIP(connection);
        daoMovie = new DaoMovie(connection);
        daoWedding = new DaoWedding(connection);
        
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new MainMenu().setVisible(true);
            }
        });

    }
}
