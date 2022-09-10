package com.kean.ejercicio06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class FirstToSixthPoint {
    public static void main(String[] args) {
        reverseText();
        enterArrayNames();
        enterAndShowMatrixInt();
        setAndGetVector();
        twoTypesOfArray();
        arrayOfInt();
    }

    private static void reverseText() {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Enter a text:");
        text = scanner.nextLine();

        System.out.println(reverse(text));
    }

    private static String reverse(String text) {
        StringBuilder reverse = new StringBuilder();
        for(int i = text.length()-1; i>=0; i--){
            reverse.append(text.charAt(i));
        }
        return reverse.toString();
    }

    private static void enterArrayNames(){
        String[] names = new String[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<=names.length-1; i++){
            System.out.print("Enter a name:");
            names[i] = scanner.nextLine();
        }
        //scanner.close();
        showArrayNames(names);
    }

    private static void showArrayNames(String[] names){
        for(int i=0; i<=names.length-1; i++){
            System.out.println((i+1)+")"+names[i]);
        }
    }

    private static void enterAndShowMatrixInt(){
        int[][] numbers = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        for(int i=0; i<numbers.length; i++){
            for(int j=0;j<numbers[1].length; j++){
                System.out.println("F"+(i+1)+"C"+(j+1));
                try {
                    numbers[i][j] = scanner.nextInt();
                }catch (Exception e){
                    System.out.println(e.getMessage() + " | " + e.getClass());
                    error = true;
                    break;
                }
            }
            if(error){break;}
            System.out.println();
        }
        //scanner.close();
        if(!error){showMatrixInt(numbers);}
    }

    private static void showMatrixInt(int[][] twoDimensionalArray){
        for(int i=0; i<twoDimensionalArray[0].length; i++){
            for(int j=0;j<twoDimensionalArray[1].length; j++){
                System.out.print("F"+(i+1)+"C"+(j+1)+" ");
                System.out.println(twoDimensionalArray[i][j]);
            }
            System.out.println();
        }
    }

    private static void setAndGetVector(){
        Vector<Boolean> vConditions = new Vector<>(5);
        //Vector<DataType> vector = new Vector<>(int initialCapacity, int capacityIncrement);

        /*    El problema de iniciar un vector con su capacidad por defecto(10), es que con 1000 elementos,
            el vector debería guardar sus elementos en un vectors nuevo 100 veces, el proceso consumiría más recursos haciendolo más costoso.  */

        vConditions.add(true);
        vConditions.add(false);
        vConditions.add(false);
        vConditions.add(true);
        vConditions.add(false);

        System.out.println("Vector content before remove:");
        System.out.println(vConditions);

        vConditions.remove(1);
        vConditions.remove(2);

        System.out.println("Vector content after remove:");
        System.out.println(vConditions);

    }

    private static void twoTypesOfArray(){
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Las Torres de Wilde");
        stringArrayList.add("1875");
        stringArrayList.add("Aguante el Rojo");
        stringArrayList.add("Kenshi Kean");

        LinkedList<String> stringLinkedList = new LinkedList<>(stringArrayList);

        System.out.println("Array list:");
        for (int i=0; i<stringArrayList.size(); i++)
        {
            System.out.println((i+1)+")"+stringArrayList);
        }

        System.out.println();

        System.out.println("Linked list:");
        for (int i=0; i<stringLinkedList.size(); i++)
        {
            System.out.println((i+1)+")"+stringLinkedList);
        }
    }

    private static void arrayOfInt(){
        ArrayList<Integer> arrayList = addNumbers();
        removeEvenNumbers(arrayList);
        showNumbersArrays(arrayList);
    }
    private static ArrayList<Integer> addNumbers(){
        ArrayList<Integer> newArrayList = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros.");
        for(int i=0; i<10; i++){
            System.out.print((i+1)+")");
            newArrayList.add(scanner.nextInt());
        }
        scanner.close();
        return newArrayList;
    }
    private static void removeEvenNumbers(ArrayList<Integer> arrayList){
        for(int i=arrayList.size()-1; i>=0; i--){
            if((arrayList.get(i)%2)==0){
                arrayList.remove(i);
            }
        }
    }

    private static void showNumbersArrays(ArrayList<Integer> list){
        System.out.println();
        System.out.println("Lista de numeros sin pares:");
        for(int i=0; i<list.size(); i++){
            System.out.println((i+1)+")"+list.get(i));
        }
    }
}
