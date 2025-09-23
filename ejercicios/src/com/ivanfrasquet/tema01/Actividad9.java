package com.ivanfrasquet.tema01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Actividad9 {
    private File file;

    public Actividad9(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }
    public File getFile() {
        return file;
    }
    public void setFile(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }
    public boolean compararArchivo(String directorio, String archivo, String archivo2) throws IOException {
        file = new File(directorio + "/" + archivo);
        File file2 = new File(directorio + "/" + archivo2);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea;
        String lineatotal = "";
        while ((linea = br.readLine()) != null) {
            lineatotal = lineatotal + linea;
        }
        String linea2;
        String lineatotal2 = "";
        while ((linea2 = br2.readLine()) != null) {
            lineatotal2 = lineatotal2 + linea2;
        }
        return (lineatotal.equals(lineatotal2));
    }

}
