package com.kean.ejercicio03;

public class ControlStructures {
    public static void main(String[] args) {
        /*String[] nombres = new String[4];
        nombres[0] = "Javier";
        nombres[1] = "Andrés";
        nombres[2] = "Bravo";
        nombres[3] = "Luna";*/

        String[] nombres = {"Javier", "Andrés", "Bravo", "Luna"};
        String nombresConcatenados = "";
        for(int i=0; i<nombres.length; i++){
            nombresConcatenados = nombresConcatenados + nombres[i];
            if(i<nombres.length-1){
                nombresConcatenados = nombresConcatenados + " | ";
            }
            //System.out.println((i+1)+")" + nombres[i] +".");
        }
        System.out.println(nombresConcatenados);
    }
}
