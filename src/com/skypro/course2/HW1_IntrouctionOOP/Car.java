package com.skypro.course2.HW1_IntrouctionOOP;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = validateStringPar(brand, "--");
        this.model = validateStringPar(model, "--");
        this.engineVolume = validateDoublePar(engineVolume, 1.5);
        this.color = validateStringPar(color, "white");
        this.productionYear = (int) validateDoublePar(productionYear, 2000);
        this.productionCountry = validateStringPar(productionCountry, "--");
    }

    public String validateStringPar(String string, String substitution) {
        return (string == null || string.isBlank() || string.isEmpty()) ? substitution : string;
    }

    public double validateDoublePar(double value, double substitution) {
        return (value <= 0.0) ? substitution : value;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + engineVolume + ", " + color + ", " + productionYear + ", " + productionCountry;
    }
}
