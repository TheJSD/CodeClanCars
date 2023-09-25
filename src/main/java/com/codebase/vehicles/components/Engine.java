package com.codebase.vehicles.components;

public abstract class Engine {

    private double  capacity;

   public Engine(double capacity) {

        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }
}
