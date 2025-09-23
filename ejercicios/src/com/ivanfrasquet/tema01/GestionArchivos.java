package com.ivanfrasquet.tema01;

import java.io.*;

public class GestionArchivos {
    private File file;

    public GestionArchivos(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }

    public File getFile() {
        return file;
    }

    public void setFile(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }

    public boolean creararchivo(String directorio, String archivo) {
        File archivo1 = new File(directorio + "/" + archivo);
        try {
            return archivo1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void listarDirectorio(String directorio) {
        String tipo, lectura, escribir;
        file = new File(directorio);
        for (int i = 0; i < file.listFiles().length; i++) {
            if (file.listFiles()[i].isDirectory()) {
                tipo = "D";
            } else tipo = "F";
            if (file.listFiles()[i].canRead()) {
                lectura = "r";
            } else lectura = " ";
            if (file.listFiles()[i].canWrite()) {
                escribir = "w";
            } else escribir = " ";
            System.out.println(file.listFiles()[i].getName() + " " + tipo + " " + file.listFiles()[i].length() + " bytes " + lectura + escribir);
        }
    }

    public void verInfo(String directorio, String archivo) {
        String tipo, lectura, escribir;
        file = new File(directorio);
        if (file.isDirectory()) {
            tipo = "D";
        } else tipo = "F";
        if (file.canRead()) {
            lectura = "r";
        } else lectura = " ";
        if (file.canWrite()) {
            escribir = "w";
        } else escribir = " ";
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName() + " " + tipo + " " + file.length() + " bytes " + lectura + escribir);
    }

    public void leerArchivo(String directorio, String archivo) throws IOException {
        file = new File(directorio + "/" + archivo);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }

    public void leerhexadecimal(String directorio, String archivo) throws IOException {
        file = new File(directorio + "/" + archivo);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {
        for (int i = 0; i < linea.length(); i++) {
            char character = linea.charAt(i);

            int lineadecimal = character;
            System.out.printf("%X", lineadecimal);
                System.out.print(" ");
            }
            }
        System.out.println();
        }
    }

