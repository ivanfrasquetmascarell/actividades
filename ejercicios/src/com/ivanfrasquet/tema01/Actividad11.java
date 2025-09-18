package com.ivanfrasquet.tema01;

import java.io.*;


public class Actividad11 {
    private File file;

    public Actividad11(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public void concatlines(String directorio, String archivo, String archivo2, String archivo3) throws IOException {
        file = new File(directorio + "/" + archivo);
        File file2 = new File(directorio + "/" + archivo2);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea;
        String lineaarchivo3 = "";
        String linea2;

        while ((linea = br.readLine()) != null) {
            lineaarchivo3 = lineaarchivo3 + linea;
            if ((linea2 = br2.readLine()) != null) {
                lineaarchivo3 = lineaarchivo3 + " " + linea2 + "\n";
            }
        }
        while ((linea2 = br2.readLine()) != null) {
            lineaarchivo3 = lineaarchivo3 + linea2 + "\n";
        }
        File file3 = new File(directorio + "/" + archivo3);
        FileWriter fw = new FileWriter(file3);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(lineaarchivo3);
        bw.close();
        fw.close();

    }

}
