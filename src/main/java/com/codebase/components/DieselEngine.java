package com.codebase.components;

public class DieselEngine{
    private String engineType;
    private double fuelLevel;

    public DieselEngine(double fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.engineType= "Diesel";

    }
    public String getEngineType() {
        return engineType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
