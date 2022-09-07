package com.kean.ejercicio05;

import java.util.List;

public class Main {
    static CocheCRUD cocheCRUD = new CocheCRUDImpl();
    public static void main(String[] args) {

        Coche audi = new Coche("Audi", "A7", 2021);
        Coche ford = new Coche("Ford", "Focus", 2012);

        cocheCRUD.save(audi);
        cocheCRUD.save(ford);

        List<Coche> coches =  cocheCRUD.findAll();
        System.out.println(coches);

        cocheCRUD.delete(audi);
        System.out.println(coches);
    }
}
