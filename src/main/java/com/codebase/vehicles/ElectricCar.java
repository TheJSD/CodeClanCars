package com.codebase.vehicles;

import com.codebase.components.ElectricMotor;
import com.codebase.components.Tyres;

public class ElectricCar extends Vehicle {
    private ElectricMotor electricMotor;

    public ElectricCar(Double price, String colour, ElectricMotor electricMotor, Tyres tyres) {
        super(price, colour, tyres);
        this.electricMotor = electricMotor;
    }
    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }
}
