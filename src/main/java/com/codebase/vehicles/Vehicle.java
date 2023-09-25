package com.codebase.vehicles;

import com.codebase.components.Tyres;

public abstract class Vehicle {
    private double price;
    private String colour;
    private Tyres tyres;

    public Vehicle(Double price, String colour, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.tyres = tyres;
    }
    public double getPrice() {
        return price;
    }
    public String getColour() {
        return colour;
    }
    public Tyres getTyres() {
        return tyres;
    }
}
