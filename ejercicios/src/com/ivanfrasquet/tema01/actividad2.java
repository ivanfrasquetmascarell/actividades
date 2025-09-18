package com.ivanfrasquet.tema01;

import java.io.File;

public class actividad2 {
    private File file;
    public actividad2(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String[] mostrar(){
        String[] files = file.list();
        return files;
    }
}
