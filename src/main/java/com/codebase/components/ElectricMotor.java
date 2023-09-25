package com.codebase.components;

public class ElectricMotor{
    private String engineType;
    private double charge;


    public ElectricMotor(double charge) {
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }
}
