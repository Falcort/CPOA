package application;

import java.io.File;

public class CustomFilter extends javax.swing.filechooser.FileFilter {  
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".png")|| file.getAbsolutePath().endsWith(".jpg")|| file.getAbsolutePath().endsWith(".gif")|| file.getAbsolutePath().endsWith(".jpeg");
        }
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Insert picture (*.png, *.jpg, *.png, *.gif, *.jpeg)";
        }
     
}
