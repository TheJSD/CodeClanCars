package com.codebase.vehicles.components;

public class ElectricEngine extends Engine implements IEngine{
    private String engineType;


    public ElectricEngine(double capacity) {
        super(capacity);
        this.engineType= "Electric";
    }

    public String getEngineType() {
        return engineType;
    }

    public double getCapacity(){
        return this.getCapacity();
    }
}
