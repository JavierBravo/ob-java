package com.kean.ejercicio06;

import java.util.Scanner;

public class SeventhPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para poder dividirlo por 0: ");
        int numero = scanner.nextInt();
        dividePorCero(numero, 0);
    }

    public static void dividePorCero(int numero, int divisor) throws ArithmeticException{
        try {
            System.out.print("Intentemos dividir "+numero+ "/0:");
            int resultado = numero/divisor;
            System.out.println(resultado);
        }
        catch (ArithmeticException e){
            System.out.println();
            System.out.println("Hubo un excepción: " + e.getMessage() + "[" + e.getClass() +"]");
        }
        finally {
            System.out.println("Demo de código.");
        }
    }
}
