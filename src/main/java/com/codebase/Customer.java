package com.codebase;

import com.codebase.vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private double balance;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double balance) {
        this.balance = balance;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }
    public int getNumberOfOwnedVehicles(){
        return ownedVehicles.size();
    }
}
