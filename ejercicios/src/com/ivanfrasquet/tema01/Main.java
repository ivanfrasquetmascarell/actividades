package com.ivanfrasquet.tema01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("tema01");

        Actividad1 a1 = new Actividad1(file);
        System.out.println();
        System.out.println("actividad 1");
        System.out.println();
        System.out.println(a1.existe());
        System.out.println(a1.directorio());

        actividad2 a2 = new actividad2(file);
        System.out.println();
        System.out.println("actividad 2");
        System.out.println();
        for (int i=0; i<a2.mostrar().length; i++) {
            System.out.println(a2.mostrar()[i]);
        }

        actividad3 a3 = new actividad3(file);
        System.out.println();
        System.out.println("actividad 3");
        System.out.println();
        System.out.println(a3.Name());
        System.out.println(a3.Path());
        System.out.println(a3.Read());
        System.out.println(a3.Write());

        actividad4 a4 = new actividad4(file);

        System.out.println();
        System.out.println("actividad 4");
        System.out.println();
        System.out.println(a4.Name());
        System.out.println(a4.Path());
        System.out.println(a4.Hide());
        System.out.println(a4.Read());
        System.out.println(a4.Write());
        System.out.println(a4.LastModified());
        a4.setTime();
        System.out.println(a4.LastModified());
        System.out.println(a4.size());

        GestionArchivos a5 = new GestionArchivos(file);

        System.out.println();
        System.out.println("actividad 5");
        System.out.println();
        System.out.println("Ruta del directorio:");
        String directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        String archivo = br.readLine();
        System.out.println(a5.creararchivo(directorio, archivo));
        a5.listarDirectorio(directorio);
        a5.verInfo(directorio, archivo);
        System.out.println();
        System.out.println("actividad 6");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
        a5.leerArchivo(directorio, archivo);

        System.out.println();
        System.out.println("actividad 7");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
        a5.leerhexadecimal(directorio, archivo);

        actividad8 a8 = new actividad8(file);

        System.out.println();
        System.out.println("actividad 8");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
        a8.leerArchivo(args[0], args[1]);

        Actividad9 a9 = new Actividad9(file);

        System.out.println();
        System.out.println("actividad 9");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
       String archivo2;
        System.out.println("Nombre del archivo2:");
        archivo2 = br.readLine();

        System.out.println(a9.compararArchivo(directorio, archivo, archivo2));

        Actividad10 a10 = new Actividad10(file);

        System.out.println();
        System.out.println("actividad 10");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
        System.out.println("Nombre del archivo2:");
        archivo2 = br.readLine();
        String archivo3;
        System.out.println("Nombre del archivo3:");
        archivo3 = br.readLine();

        a10.concat(directorio, archivo, archivo2, archivo3);

        Actividad11 a11 = new Actividad11(file);

        System.out.println();
        System.out.println("actividad 11");
        System.out.println();
        System.out.println("Ruta del directorio:");
        directorio = br.readLine();
        System.out.println("Nombre del archivo:");
        archivo = br.readLine();
        System.out.println("Nombre del archivo2:");
        archivo2 = br.readLine();
        System.out.println("Nombre del archivo3:");
        archivo3 = br.readLine();

        a11.concatlines(directorio, archivo, archivo2, archivo3);
    }
}