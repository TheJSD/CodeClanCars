package com.codebase.vehicles;

import com.codebase.components.DieselEngine;
import com.codebase.components.Tyres;

public class DieselCar extends Vehicle {
    private DieselEngine engine;

    public DieselCar(double price, String colour, DieselEngine dieselEngine, Tyres tyres) {
        super(price, colour, tyres);
        this.engine = dieselEngine;
    }

    public String getEngineType() {
        return this.engine.getEngineType();
    }


}
