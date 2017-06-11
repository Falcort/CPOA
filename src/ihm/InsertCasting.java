package ihm;

import javax.swing.JOptionPane;
import tables.Casting;

public class InsertCasting extends javax.swing.JDialog {

    private final Casting casting;
    private boolean etatSortie;

    public InsertCasting(java.awt.Frame parent, Casting casting) {
        super(parent, true);
        initComponents();
        this.casting = casting;
        this.setLocation(parent.getLocation());
        etatSortie = false;
    }

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        numVISACasting = new javax.swing.JTextField();
        jVisa = new javax.swing.JLabel();
        numVIPCasting = new javax.swing.JTextField();
        jVisa1 = new javax.swing.JLabel();
        AddMovie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Insert Movie Actor");

        numVISACasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numVISACastingActionPerformed(evt);
            }
        });

        jVisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jVisa.setText("film VISA");

        numVIPCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numVIPCastingActionPerformed(evt);
            }
        });

        jVisa1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jVisa1.setText("ID actor ");

        AddMovie.setText("ADD");
        AddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVisa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numVIPCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numVISACasting, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVisa)
                    .addComponent(numVISACasting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVisa1)
                    .addComponent(numVIPCasting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numVISACastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numVISACastingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numVISACastingActionPerformed

    private void numVIPCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numVIPCastingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numVIPCastingActionPerformed

    private void AddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieActionPerformed
        try {
            //Insertion of Visa
            String numVISAHelper = numVISACasting.getText();
            if (numVISAHelper.isEmpty()) {
                throw new Exception("Field numVISA is empty");
            } else {
                int numVISA = Integer.parseInt(numVISACasting.getText());
                casting.setNumVISACasting(numVISA);
            }

            //Insertion of VIP Casting
            String numVIPHelper = numVIPCasting.getText();
            if (numVIPHelper.isEmpty()) {
                throw new Exception("Field numVIP is empty");
            } else {
                int numVIP = Integer.parseInt(numVIPCasting.getText());
                casting.setNumVIPCasting(numVIP);
            }

            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_AddMovieActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMovie;
    private javax.swing.JLabel jVisa;
    private javax.swing.JLabel jVisa1;
    private javax.swing.JTextField numVIPCasting;
    private javax.swing.JTextField numVISACasting;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
