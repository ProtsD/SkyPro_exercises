package com.skypro.course2.hw3_inheritance;

import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Pattern;

public abstract class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int productionYear;
    private final String productionCountry;

    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     String color,
                     int productionYear,
                     String productionCountry,
                     int maxSpeed) {

        this.brand = validateStringPar(brand, "--");
        this.model = validateStringPar(model, "--");
        this.color = validateStringPar(color, "white");
        this.productionYear = (int) validateDoublePar(productionYear, 2000);
        this.productionCountry = validateStringPar(productionCountry, "--");
        this.maxSpeed = (int) validateDoublePar(maxSpeed, 90);
    }

    public String validateStringPar(String string, String substitution) {
        return (string == null || string.isBlank() || string.isEmpty()) ? substitution : string;
    }

    public double validateDoublePar(double value, double substitution) {
        return (value <= 0.0) ? substitution : value;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateStringPar(color, "white");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (int) validateDoublePar(maxSpeed, 90);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + color + ", " + productionYear + ", " + productionCountry;
    }
}
