package com.kean.ejercicio06;

import java.io.*;

public class EighthPoint {
    public static void main(String[] args) {
        String INIT_PATH = "C:/Users/Admin/Desktop/Workspace/Practice/openbootcamp/basicjava/Ejercicio01/src/com/kean/ejercicio06/testFile.txt";
        String DESTINATION_ROUTE = "C:/Users/Admin/Desktop/Workspace/Practice/openbootcamp/basicjava/Ejercicio01/src/com/kean/ejercicio06/destino.txt";

        try {
            lecturaDeArchivoOriginal(INIT_PATH);
            PrintStream output = new PrintStream(DESTINATION_ROUTE);
            //copiarArchivos(INIT_PATH, output);
            InputStream input = new FileInputStream(INIT_PATH);
            copiarArchivos(input, output);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void lecturaDeArchivoOriginal(String PATH) throws IOException{
        InputStream newInput = new FileInputStream(PATH);
        try {

            // Cuando el fichero es pequeño podemos leerlo de golpe.
            // Pero consume más recursos).
            //
            /*
            byte[] datos = input.readAllBytes();
            for (byte dato: datos){
                System.out.print((char) dato);
            }*/

            // Cuando es grande conviene poco a poco
            // Pero leerlo byte a bye (letra a letra) es más lento, hace una operación de lectura por cada  byte.
            //
            /*
            int datos = input.read();
            while(datos!=-1){
                System.out.print((char)datos);
                datos = input.read();
            }*/

            BufferedInputStream inputBuffered = new BufferedInputStream(newInput);
            int dato = inputBuffered.read();
            while(dato!=-1){
                System.out.print((char)dato);
                dato = inputBuffered.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copiarArchivos(InputStream input, PrintStream output) {
        try {
            byte []datos;
            datos = input.readAllBytes();
            try {
                output.write(datos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}