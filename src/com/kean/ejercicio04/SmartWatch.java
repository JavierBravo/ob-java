package com.kean.ejercicio04;

public class SmartWatch extends SmartDevice{
    private boolean isSubmersible;

    public SmartWatch(){super();}

    public SmartWatch(String company, double height, double weight, String model, int year, boolean isSubmersible){
        super(company, height, weight, model, year);
        this.isSubmersible = isSubmersible;
    }


    public boolean isSubmersible() {
        return isSubmersible;
    }

    public void setSubmersible(boolean submersible) {
        isSubmersible = submersible;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "isSubmersible=" + isSubmersible +
                "} " + super.toString();
    }
}
