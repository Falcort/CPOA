/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.sql.SQLException;
import java.time.LocalDate;
import modele.ModeleJTableVIP;
import tables.VIP;
import ihm.InsertVIP;
import modele.ModeleJTableMovie;

/**
 *
 * @author Thinkpad-Falcort
 */
public class MainMenu extends javax.swing.JFrame {
    
    private ModeleJTableVIP modeleVIP;
    private ModeleJTableMovie modeleMovie;

    /**
     * Creates new form MainMenuTest
     */
    public MainMenu() {
        this.modeleVIP = new ModeleJTableVIP();
        this.modeleMovie = new ModeleJTableMovie();
        
        initComponents();
        
        try
        {
            modeleVIP.chargerLesVIP();
            modeleMovie.chargerMovie();
            
        } catch (SQLException ex) {
            System.out.println(" Erreur au chargement : " + ex.getMessage());
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
        Onglet3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Actions3 = new javax.swing.JPanel();
        btnAddDivorce = new javax.swing.JButton();
        btnAddWedding = new javax.swing.JButton();
        Onglet4 = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
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

        javax.swing.GroupLayout Actions2Layout = new javax.swing.GroupLayout(Actions2);
        Actions2.setLayout(Actions2Layout);
        Actions2Layout.setHorizontalGroup(
            Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Actions2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnDeleteMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Actions2Layout.setVerticalGroup(
            Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actions2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Actions2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnAddMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
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

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        Actions3.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        btnAddDivorce.setText("Add divorce");
        btnAddDivorce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDivorceActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAddDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Actions3Layout.setVerticalGroup(
            Actions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Actions3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Actions3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDivorce, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
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

        javax.swing.GroupLayout Onglet4Layout = new javax.swing.GroupLayout(Onglet4);
        Onglet4.setLayout(Onglet4Layout);
        Onglet4Layout.setHorizontalGroup(
            Onglet4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1078, Short.MAX_VALUE)
        );
        Onglet4Layout.setVerticalGroup(
            Onglet4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
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
        if (ligne != -1) {
            try {
                modeleVIP.deleteVIP(ligne);
            } catch (SQLException e) {
                System.out.println("Erreur à la suppression : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnDeleteVIPActionPerformed

    private void btnAddVIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVIPActionPerformed
        try {
            VIP newVIP = new VIP();
            InsertVIP AddVIP = new InsertVIP(this, newVIP);
            if (AddVIP.doModal() == true) {
                modeleVIP.insertVIP(newVIP);
            }
            
            
        } catch (SQLException e) {
            System.out.println("Erreur à l'insertion : " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddVIPActionPerformed

    private void btnDeleteMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMovieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMovieActionPerformed

    private void btnAddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMovieActionPerformed

    private void btnAddDivorceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDivorceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDivorceActionPerformed

    private void btnAddWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWeddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddWeddingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
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
    private javax.swing.JButton btnAddDivorce;
    private javax.swing.JButton btnAddMovie;
    private javax.swing.JButton btnAddVIP;
    private javax.swing.JButton btnAddWedding;
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnDeleteVIP;
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
