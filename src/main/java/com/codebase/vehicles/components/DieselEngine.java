package com.codebase.vehicles.components;

public class DieselEngine extends Engine{
    private String engineType;

    public DieselEngine(double capacity) {
        super(capacity);
        this.engineType= "Diesel";

    }
    public String getEngineType() {
        return engineType;
    }
}
