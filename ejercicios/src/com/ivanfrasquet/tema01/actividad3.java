package com.ivanfrasquet.tema01;

import java.io.File;

public class actividad3 {
    private File file;
    public actividad3(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String Name(){
        return file.getName();
    }
    public String Path(){
        return file.getAbsolutePath();
    }
    public boolean Read(){
        return file.canRead();
    }
    public boolean Write(){
        return file.canWrite();
    }
}
