/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import metier.classmetier2;
import java.time.DateTimeException;
import modele.ModeleJComboBox;

public class FenetreAjout extends javax.swing.JDialog {

    private final classmetier2 emp;
    private boolean etatSortie;
    private ModeleJComboBox leModele;

    public FenetreAjout(java.awt.Frame parent, classmetier2 emp) {
        super(parent, true);  // mode modal 
        this.setLocation(parent.getLocation());
        this.emp = emp;
        etatSortie = false;
        try {
            leModele = new ModeleJComboBox();
            initComponents();
            jRole.setSelectedIndex(0);
        } catch (SQLException e) {
            System.out.println("Exception au chargement des départements : " + e.getMessage());
        }
    }

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRole1 = new javax.swing.JComboBox<>();
        txPrenom = new javax.swing.JTextField();
        txID = new javax.swing.JTextField();
        txNom = new javax.swing.JTextField();
        lbNom = new javax.swing.JLabel();
        lbPrenom = new javax.swing.JLabel();
        btValid = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbDateNaissance = new javax.swing.JLabel();
        txDateNaissance = new javax.swing.JTextField();
        lbCode = new javax.swing.JLabel();
        lbStatut = new javax.swing.JLabel();
        lbLieuNaissance = new javax.swing.JLabel();
        txLieuNaissance = new javax.swing.JTextField();
        jStatut = new javax.swing.JComboBox<>();
        jRole = new javax.swing.JComboBox<>();
        lbPays = new javax.swing.JLabel();
        txPays = new javax.swing.JTextField();
        lbCivilité = new javax.swing.JLabel();
        jCivilité = new javax.swing.JComboBox<>();

        jRole1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "R", "AR", "N" }));
        jRole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRole1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saisie d'un employé");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });

        lbNom.setText("Nom");

        lbPrenom.setText("Prenom ");

        btValid.setText("Valider");
        btValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidActionPerformed(evt);
            }
        });

        lbID.setText("ID VIP");

        lbDateNaissance.setText("Date naissance");

        lbCode.setText("Code Role VIP");

        lbStatut.setText("Statut VIP");

        lbLieuNaissance.setText("Lieu naissance");

        jStatut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "L" }));
        jStatut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatutActionPerformed(evt);
            }
        });

        jRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "R", "AR", "N" }));
        jRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRoleActionPerformed(evt);
            }
        });

        lbPays.setText("Pays résidence");

        lbCivilité.setText("Civilité");

        jCivilité.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "Mme", "Mlle" }));
        jCivilité.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCivilitéActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLieuNaissance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txLieuNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDateNaissance)
                            .addComponent(lbPays))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txDateNaissance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPays, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNom, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStatut)
                            .addComponent(lbCode)
                            .addComponent(lbCivilité))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCivilité, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jStatut, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btValid)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNom)
                    .addComponent(txNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrenom)
                    .addComponent(txPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateNaissance)
                    .addComponent(txDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLieuNaissance)
                    .addComponent(txLieuNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPays)
                    .addComponent(txPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jStatut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbStatut))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCivilité)
                    .addComponent(jCivilité, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btValid)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidActionPerformed
        // TODO add your handling code here:
        try {
            // validation saisie du numéro de l'employé
            String leNumero = txID.getText();
            if (leNumero.isEmpty()) {
                throw new Exception("champ numero vide");
            }
            emp.setNumEmp(Integer.parseInt(leNumero));
            // validation saisie du nom de l'employé
            String leNom = txNom.getText();
            if (leNom.isEmpty()) {
                throw new Exception("champ nom vide");
            }
            emp.setNomEmp(leNom);
            // validation saisie du job de l'employé
            String leJob = txPrenom.getText();
            if (leJob.isEmpty()) {
                throw new Exception("champ job vide");
            }
            emp.setJobEmp(leJob);
            // validation saisie de la date d'embauche de l'employé
            String laDate = txDateNaissance.getText();
            if (laDate.isEmpty()) {
                throw new Exception("champ date vide");
            }
            // conversion de la cahine date en LocalDate et validation de la adte
            String[] champsDate = laDate.split("/");
            try {
                LocalDate dateEmbauche = LocalDate.of(
                        Integer.parseInt(champsDate[2]),
                        Integer.parseInt(champsDate[1]),
                        Integer.parseInt(champsDate[0])
                );
                LocalDate aujourdhui = LocalDate.now();
                if (dateEmbauche.isAfter(aujourdhui)) {
                    throw new Exception("date embauche postérieure à date aujour'hui");
                }
                emp.setDateEmp(dateEmbauche);
            } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                throw new Exception("format de date incorrect");
            }
            // sélection du département
            int indexItem = jRole.getSelectedIndex();
            if (indexItem < 0) {
                throw new Exception("choisir un département");
            }
            int leDepartement = leModele.getNumDept(indexItem);
            emp.setDeptEmp(leDepartement);

            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btValidActionPerformed

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDActionPerformed

    private void jStatutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStatutActionPerformed

    private void jRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRoleActionPerformed

    private void jRole1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRole1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRole1ActionPerformed

    private void jCivilitéActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCivilitéActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCivilitéActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btValid;
    private javax.swing.JComboBox<String> jCivilité;
    private javax.swing.JComboBox<String> jRole;
    private javax.swing.JComboBox<String> jRole1;
    private javax.swing.JComboBox<String> jStatut;
    private javax.swing.JLabel lbCivilité;
    private javax.swing.JLabel lbCode;
    private javax.swing.JLabel lbDateNaissance;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLieuNaissance;
    private javax.swing.JLabel lbNom;
    private javax.swing.JLabel lbPays;
    private javax.swing.JLabel lbPrenom;
    private javax.swing.JLabel lbStatut;
    private javax.swing.JTextField txDateNaissance;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txLieuNaissance;
    private javax.swing.JTextField txNom;
    private javax.swing.JTextField txPays;
    private javax.swing.JTextField txPrenom;
    // End of variables declaration//GEN-END:variables
}
