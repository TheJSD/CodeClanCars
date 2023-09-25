package com.codebase.components;

public class Tyres {
    private String brand;
    private String season;
    private String size;

    public Tyres(String brand, String season, String size) {
        this.brand = brand;
        this.season = season;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeason() {
        return season;
    }

    public String getSize() {
        return size;
    }
}
