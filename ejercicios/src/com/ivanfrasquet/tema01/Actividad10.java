package com.ivanfrasquet.tema01;

import java.io.*;


public class Actividad10 {
    private File file;

    public Actividad10(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public void concat(String directorio, String archivo, String archivo2, String archivo3) throws IOException {
        file = new File(directorio + "/" + archivo);
        File file2 = new File(directorio + "/" + archivo2);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea;
        String lineatotal = "";
        while ((linea = br.readLine()) != null) {
            lineatotal = lineatotal + linea + " ";
        }
        String linea2;
        String lineatotal2 = "";
        while ((linea2 = br2.readLine()) != null) {
            lineatotal2 = lineatotal2 + linea2 + " ";
        }
        File file3 = new File(directorio + "/" + archivo3);
        FileWriter fw = new FileWriter(file3);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(lineatotal + lineatotal2);
        bw.close();
        fw.close();

    }

}
