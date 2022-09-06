package com.kean.ejercicio02;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        double precio;
        precio = PrecioIngresado();
        System.out.println("Precio con IVA: $" + String.format("%.2f",CalculoDeIVA(precio)));
    }
    static double PrecioIngresado(){
        double precio;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar precio: $");
        precio = scanner.nextDouble();
        return precio;
    }
    static double CalculoDeIVA(double precio){
        return precio + (precio*0.21);
    }
}
