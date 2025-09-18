package com.ivanfrasquet.tema01;

import java.io.File;

public class Actividad1 {

     private File file;

     public Actividad1(File file) {
         this.file = file;
     }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }

    public boolean existe() {
         boolean files = file.exists();
         return files;
    }

    public boolean directorio() {
        boolean files = file.isDirectory();
        return files;
    }
}
