package ihm;

import application.CustomFilter;
import database.DaoImage;
import java.sql.SQLException;
import java.time.LocalDate;
import modele.ModeleJTableVIP;
import metier.VIP;
import ihm.InsertVIP;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.ModeleJTableCasting;
import modele.ModeleJTableMovie;
import modele.ModeleJTableRealisation;
import modele.ModeleJTableWedding;
import metier.Casting;
import metier.Movie;
import metier.Realisation;
import metier.Wedding;

public class MainMenu extends javax.swing.JFrame
{

    private ModeleJTableVIP modeleVIP;
    private ModeleJTableMovie modeleMovie;
    private ModeleJTableWedding modeleWedding;
    private ModeleJTableCasting modeleCasting;
    private ModeleJTableRealisation modeleRealisation;

    /**
     * Creates new form MainMenuTest
     */
    public MainMenu()
    {
        this.modeleVIP = new ModeleJTableVIP();
        this.modeleMovie = new ModeleJTableMovie();
        this.modeleWedding = new ModeleJTableWedding();
        this.modeleCasting = new ModeleJTableCasting();
        this.modeleRealisation = new ModeleJTableRealisation();

        initComponents();

        try
        {
            modeleVIP.loadVIP();
            modeleMovie.loadMovie();
            modeleWedding.loadWedding();
            modeleCasting.loadCasting();
            modeleRealisation.loadRealisation();

        } catch (SQLException ex)
        {
            System.out.println("Loading error : " + ex.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jFileChooser1 = new javax.swing.JFileChooser();
        VIP = new javax.swing.JTabbedPane();
        Onglet1 = new javax.swing.JPanel();
        Actions1 = new javax.swing.JPanel();
        btnDeleteVIP = new javax.swing.JButton();
        btnAddVIP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Onglet2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Actions2 = new javax.swing.JPanel();
        btnDeleteMovie = new javax.swing.JButton();
        btnAddMovie = new javax.swing.JButton();
        btnAddActor = new javax.swing.JButton();
        btnAddDirector = new javax.swing.JButton();
        Onglet3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Actions3 = new javax.swing.JPanel();
        btnUpdateWedding = new javax.swing.JButton();
        btnAddWedding = new javax.swing.JButton();
        Onglet4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jFileChooser1.setFileFilter(new CustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Very Important Person");
        setResizable(false);

        VIP.setToolTipText("Manage VIP");

        Actions1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        btnDeleteVIP.setText("Delete VIP");
        btnDeleteVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVIPActionPerformed(evt);
            }
        });

        btnAddVIP.setText("Add VIP");
        btnAddVIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Actions1Layout = new javax.swing.GroupLayout(Actions1);
        Actions1.setLayout(Actions1Layout);
        Actions1Layout.setHorizontalGroup(
            Actions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Actions1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnDeleteVIP, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Actions1Layout.setVerticalGroup(
            Actions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actions1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Actions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddVIP, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTable1.setModel(modeleVIP);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout Onglet1Layout = new javax.swing.GroupLayout(Onglet1);
        Onglet1.setLayout(Onglet1Layout);
        Onglet1Layout.setHorizontalGroup(
            Onglet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Onglet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actions1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        Onglet1Layout.setVerticalGroup(
            Onglet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Onglet1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        VIP.addTab("Manage VIP", Onglet1);

        jTable2.setModel(modeleMovie);
        jScrollPane3.setViewportView(jTable2);

        Actions2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        btnDeleteMovie.setText("Delete movie");
        btnDeleteMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMovieActionPerformed(evt);
            }
        });

        btnAddMovie.setText("Add movie");
        btnAddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovieActionPerformed(evt);
            }
        });

        btnAddActor.setText("Add actor");
        btnAddActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActorActionPerformed(evt);
            }
        });

        btnAddDirector.setText("Add director");
        btnAddDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDirectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Actions2Layout = new javax.swing.GroupLayout(Actions2);
        Actions2.setLayout(Actions2Layout);
        Actions2Layout.setHorizontalGroup(
            Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Actions2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnAddActor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(btnAddDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Actions2Layout.setVerticalGroup(
            Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actions2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddActor, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddDirector, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Onglet2Layout = new javax.swing.GroupLayout(Onglet2);
        Onglet2.setLayout(Onglet2Layout);
        Onglet2Layout.setHorizontalGroup(
            Onglet2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Onglet2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(Actions2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Onglet2Layout.setVerticalGroup(
            Onglet2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actions2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        VIP.addTab("Manage Movies", Onglet2);

        jTable3.setModel(modeleWedding);
        jScrollPane4.setViewportView(jTable3);

        Actions3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        btnUpdateWedding.setText("Update wedding");
        btnUpdateWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateWeddingActionPerformed(evt);
            }
        });

        btnAddWedding.setText("Add wedding");
        btnAddWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWeddingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Actions3Layout = new javax.swing.GroupLayout(Actions3);
        Actions3.setLayout(Actions3Layout);
        Actions3Layout.setHorizontalGroup(
            Actions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Actions3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddWedding, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnUpdateWedding, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Actions3Layout.setVerticalGroup(
            Actions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actions3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Actions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateWedding, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddWedding, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Onglet3Layout = new javax.swing.GroupLayout(Onglet3);
        Onglet3.setLayout(Onglet3Layout);
        Onglet3Layout.setHorizontalGroup(
            Onglet3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Onglet3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(Actions3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Onglet3Layout.setVerticalGroup(
            Onglet3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actions3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        VIP.addTab("Wedding / Divorce", Onglet3);

        Onglet4.setToolTipText("");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Onglet4Layout = new javax.swing.GroupLayout(Onglet4);
        Onglet4.setLayout(Onglet4Layout);
        Onglet4Layout.setHorizontalGroup(
            Onglet4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet4Layout.createSequentialGroup()
                .addGap(538, 538, 538)
                .addComponent(jButton1)
                .addContainerGap(620, Short.MAX_VALUE))
        );
        Onglet4Layout.setVerticalGroup(
            Onglet4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Onglet4Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jButton1)
                .addContainerGap(325, Short.MAX_VALUE))
        );

        VIP.addTab("Pictures", Onglet4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VIP)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VIP, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        VIP.getAccessibleContext().setAccessibleName("Manage VIP");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVIPActionPerformed
        int ligne = jTable1.getSelectedRow();
        if (ligne != -1)
        {
            try
            {
                modeleVIP.deleteVIP(ligne);
            } catch (SQLException e)
            {
                System.out.println("Suppresion error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeleteVIPActionPerformed

    private void btnAddVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVIPActionPerformed
        try
        {
            VIP newVIP = new VIP();
            InsertVIP AddVIP = new InsertVIP(this, newVIP);
            if (AddVIP.doModal() == true)
            {
                modeleVIP.insertVIP(newVIP);
            }

        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddVIPActionPerformed

    private void btnDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMovieActionPerformed
        int ligne = jTable2.getSelectedRow();
        if (ligne != -1)
        {
            try
            {
                modeleMovie.deleteMovie(ligne);
            } catch (SQLException e)
            {
                System.out.println("Suppresion error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeleteMovieActionPerformed

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        try
        {
            Movie newMovie = new Movie();
            InsertMovie AddMovie = new InsertMovie(this, newMovie);
            if (AddMovie.doModal() == true)
            {
                modeleMovie.insertMovie(newMovie);
            }
        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddMovieActionPerformed

    private void btnUpdateWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateWeddingActionPerformed
        Wedding tmp = new Wedding();
        int ligne = jTable3.getSelectedRow();
        String numVIP1 = modeleWedding.getValueAt(ligne, 0) + "";
        String DateWedding = modeleWedding.getValueAt(ligne, 2) + "";
        String numVIP2 = modeleWedding.getValueAt(ligne, 3) + "";
        String PlaceWedding = modeleWedding.getValueAt(ligne, 5) + "";
        String DateDivorce = modeleWedding.getValueAt(ligne, 6) + "";
        if (ligne != -1)
        {
            //modeleWedding.updateWedding(ligne);
            InsertWedding ModifyWedding = new InsertWedding(this, tmp, numVIP1, DateWedding, numVIP2, PlaceWedding, DateDivorce);
            if (ModifyWedding.doModal() == true)
            {
                try
                {
                    modeleWedding.updateWedding(tmp);
                } catch (SQLException ex)
                {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnUpdateWeddingActionPerformed

    private void btnAddWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWeddingActionPerformed
        try
        {
            Wedding newWedding = new Wedding();
            InsertWedding addWedding = new InsertWedding(this, newWedding);
            if (addWedding.doModal() == true)
            {
                modeleWedding.insertWedding(newWedding);
            }
        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddWeddingActionPerformed

    private void btnAddActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActorActionPerformed
        try
        {
            Casting newCasting = new Casting();
            InsertCasting AddCasting = new InsertCasting(this, newCasting);
            if (AddCasting.doModal() == true)
            {
                modeleCasting.insertCasting(newCasting);
            }
        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActorActionPerformed

    private void btnAddDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDirectorActionPerformed
        try
        {
            Realisation newRealisation = new Realisation();
            InsertRealisation AddReaslisation = new InsertRealisation(this, newRealisation);
            if (AddReaslisation.doModal() == true)
            {
                modeleRealisation.insertRealisation(newRealisation);
            }
        } catch (SQLException e)
        {
            System.out.println("Insertion error : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddDirectorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            File file = jFileChooser1.getSelectedFile();
            DaoImage.send(file.getAbsolutePath());

        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Actions1;
    private javax.swing.JPanel Actions2;
    private javax.swing.JPanel Actions3;
    private javax.swing.JPanel Onglet1;
    private javax.swing.JPanel Onglet2;
    private javax.swing.JPanel Onglet3;
    private javax.swing.JPanel Onglet4;
    private javax.swing.JTabbedPane VIP;
    private javax.swing.JButton btnAddActor;
    private javax.swing.JButton btnAddDirector;
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnAddVIP;
    private javax.swing.JButton btnAddWedding;
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnDeleteVIP;
    private javax.swing.JButton btnUpdateWedding;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
