package com.kean.ejercicio04;

public class SmartPhone extends SmartDevice{
    private int frontalCameraPx;
    private int rearCameraPx;

    @Override
    public String toString() {
        return "SmartPhone{" +
                "frontalCameraPx=" + frontalCameraPx +
                ", rearCameraPx=" + rearCameraPx +
                "} " + super.toString();
    }

    public SmartPhone() {}

    public SmartPhone(String company, double height, double weight, String model, int year, int frontalCameraPx, int rearCameraPx) {
        super(company, height, weight, model, year);
        this.frontalCameraPx = frontalCameraPx;
        this.rearCameraPx = rearCameraPx;
    }

    public int getFrontalCameraPx() {
        return frontalCameraPx;
    }

    public void setFrontalCameraPx(int frontalCameraPx) {
        this.frontalCameraPx = frontalCameraPx;
    }

    public int getRearCameraPx() {
        return rearCameraPx;
    }

    public void setRearCameraPx(int rearCameraPx) {
        this.rearCameraPx = rearCameraPx;
    }
}
