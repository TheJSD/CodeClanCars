package com.codebase;

import com.codebase.vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private double balance;
    private ArrayList<Vehicle> stock;

    public Dealership(double balance) {
        this.balance = balance;
        this.stock = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }
    public int getNumberOfVehiclesInStock(){
        return stock.size();
    }
    public void addCar(Vehicle vehicle){
        this.stock.add(vehicle);
    }
}
