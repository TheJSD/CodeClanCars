package com.codebase.vehicles.components;

public class DieselCar {
    private double price;
    private String colour;
    private DieselEngine engine;
    private Tyres tyres;

    public DieselCar(double price, String colour, DieselEngine dieselEngine, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.engine = dieselEngine;
        this.tyres = tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String getEngineType() {
        return this.engine.getEngineType();
    }

    public Tyres getTyres() {
        return tyres;
    }


}
