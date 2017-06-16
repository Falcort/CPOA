package database;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.regex.Pattern;
import metier.Photo;

public class DaoPhoto {


    private final Connection connexion;

    public DaoPhoto(Connection connexion) {
        this.connexion = connexion;
    }

    public void recupererPhoto(List<Photo> Photos) throws SQLException {
        String requete = "select * from PHOTO";
        Statement stmt = connexion.createStatement();
        ResultSet rset = stmt.executeQuery(requete);
        while (rset.next()) {
            int numPhoto = rset.getInt(1);
            String placePhoto = rset.getString(2);
            int yearPhoto = rset.getInt(3);
            String wayPhoto = rset.getString(4);
            Photo photo = new Photo(numPhoto, placePhoto, yearPhoto, wayPhoto);
            Photos.add(photo);
        }
        rset.close();
        stmt.close();
    }

    public void insererPhoto(Photo photo) throws SQLException {
        String query = "INSERT INTO PHOTO(idPhoto, placePhoto, yearPhoto, wayPhoto) VALUES (?,?,?,?)";
        PreparedStatement pstmt = connexion.prepareStatement(query);
        pstmt.setInt(1, photo.getIdPhoto());
        pstmt.setString(2, photo.getPlacePhoto());
        pstmt.setInt(3, photo.getYearPhoto());
        pstmt.setString(4, photo.getWayPhoto());
        pstmt.executeUpdate();
        pstmt.close();
    }


    
    
    
    public static String send(String fileName) {
        System.out.println(fileName);
        String SFTPHOST = "falcort.fr";
        int SFTPPORT = 2228;
        String SFTPUSER = "etienne";
        String SFTPPASS = "12345";
        String SFTPWORKINGDIR = "/var/www/html/assets/images/VIP/";

        Session session = null;
        Channel channel = null;
        ChannelSftp channelSftp = null;
        System.out.println("preparing the host information for sftp.");
        try {
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            System.out.println("Host connected.");
            channel = session.openChannel("sftp");
            channel.connect();
            System.out.println("sftp channel opened and connected.");
            channelSftp = (ChannelSftp) channel;
            channelSftp.cd(SFTPWORKINGDIR);
            File f = new File(fileName);
            channelSftp.put(new FileInputStream(f), f.getName());
            System.out.println("File transfered successfully to host.");
        } catch (Exception ex) {
            System.out.println("Exception found while tranfer the response.\nMessage : " + ex.getMessage());
        } finally {

            channelSftp.exit();
            System.out.println("sftp Channel exited.");
            channel.disconnect();
            System.out.println("Channel disconnected.");
            session.disconnect();
            System.out.println("Host Session disconnected.");
        }
        
        String nomFichier = "";
        String parts[] = fileName.split(Pattern.quote("\\"));
        for (int i = 0; i < parts.length; i++) {
            nomFichier = parts[i];
        }
        return nomFichier;
    }
}
