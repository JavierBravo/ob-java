package com.kean.ejercicio04;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartPhone = new SmartPhone("Nokia", 13.2, 322.3, "Zika", 2008, 12, 1);
        SmartDevice smartWatch = new SmartWatch("Apple", 3.4, 90.8, "Ronpe99", 2021, true);

        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}
