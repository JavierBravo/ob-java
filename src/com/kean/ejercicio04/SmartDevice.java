package com.kean.ejercicio04;

public class SmartDevice {
    private String company;
    private double height;
    private double weight;
    private String model;
    private int year;

    public SmartDevice(){ }

    public SmartDevice(String company, double height, double weight, String model, int year){
        this.company = company;
        this.height = height;
        this.weight = weight;
        this.model = model;
        this.year = year;
    }
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "company='" + company + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}