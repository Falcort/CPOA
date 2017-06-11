/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import tables.Movie;


public class InsertMovie extends javax.swing.JDialog
{

    private final Movie movie;
    private boolean etatSortie;

    public InsertMovie(java.awt.Frame parent, Movie movie)
    {
        super(parent, true);
        initComponents();
        this.movie = movie;
        this.setLocation(parent.getLocation());
        etatSortie = false;
    }

    public boolean doModal()
    {
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
        jVisa = new javax.swing.JLabel();
        jTitleMov = new javax.swing.JLabel();
        jDateOut = new javax.swing.JLabel();
        jGenre = new javax.swing.JLabel();
        Visa = new javax.swing.JTextField();
        TitleMovie = new javax.swing.JTextField();
        DateOut = new javax.swing.JTextField();
        Genre = new javax.swing.JTextField();
        AddMovie = new javax.swing.JButton();
        DirectorMovieID = new javax.swing.JTextField();
        IDMovieDirector = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 485));
        setPreferredSize(new java.awt.Dimension(500, 486));
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Insert Movie");

        jVisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jVisa.setText("VISA");

        jTitleMov.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTitleMov.setText("Title");

        jDateOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jDateOut.setText("Release date");

        jGenre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jGenre.setText("Movie genre");

        Visa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisaActionPerformed(evt);
            }
        });

        AddMovie.setText("ADD");
        AddMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMovieActionPerformed(evt);
            }
        });

        IDMovieDirector.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDMovieDirector.setText("ID Movie director");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jGenre)
                            .addComponent(jDateOut)
                            .addComponent(jTitleMov)
                            .addComponent(jVisa)
                            .addComponent(IDMovieDirector))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DirectorMovieID)
                            .addComponent(Genre)
                            .addComponent(DateOut)
                            .addComponent(TitleMovie)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Visa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVisa)
                    .addComponent(Visa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTitleMov)
                    .addComponent(TitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateOut))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGenre))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DirectorMovieID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDMovieDirector))
                .addGap(52, 52, 52)
                .addComponent(AddMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMovieActionPerformed
        try
        {
            //Insertion of visa
            int numVisa = Integer.parseInt(Visa.getText());
            String visaHelper = Visa.getText();
            if (visaHelper.isEmpty())
            {
                throw new Exception("Field visa empty");
            }
            movie.setNumVisa(numVisa);

            //Insertion of title
            String titleMovie = TitleMovie.getText();
            if (titleMovie.isEmpty())
            {
                throw new Exception("Field title empty");
            }
            movie.setTitle(titleMovie);

            // vérification empty or not date of release
            String releaseDate = DateOut.getText();
            if (releaseDate.isEmpty())
            {
                throw new Exception("champ date release vide");
            }
            //Insertion date of release  
            String[] champsDate = releaseDate.split("/");
            try
            {
                LocalDate dateOut = LocalDate.of(
                        Integer.parseInt(champsDate[2]),
                        Integer.parseInt(champsDate[1]),
                        Integer.parseInt(champsDate[0])
                );
                LocalDate aujourdhui = LocalDate.now();
                if (dateOut.isAfter(aujourdhui))
                {
                    throw new Exception("date de sortie postérieure à date aujourd'hui");
                }
                movie.setReleaseDate(dateOut);
            } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex)
            {
                throw new Exception("format de date incorrect");
            }

            //Insertion of place of birth
            String genreMovie = Genre.getText();
            if (genreMovie.isEmpty())
            {
                throw new Exception("Fiel genre empty");
            }
            movie.setGenre(genreMovie);

            etatSortie = true;
            this.dispose();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_AddMovieActionPerformed

    private void VisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VisaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddMovie;
    private javax.swing.JTextField DateOut;
    private javax.swing.JTextField DirectorMovieID;
    private javax.swing.JTextField Genre;
    private javax.swing.JLabel IDMovieDirector;
    private javax.swing.JTextField TitleMovie;
    private javax.swing.JTextField Visa;
    private javax.swing.JLabel jDateOut;
    private javax.swing.JLabel jGenre;
    private javax.swing.JLabel jTitleMov;
    private javax.swing.JLabel jVisa;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
