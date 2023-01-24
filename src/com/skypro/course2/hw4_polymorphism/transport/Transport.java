package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.Driver;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private final double engineVolume;

    private T driver;

    public Transport(String brand,
                     String model,
                     double engineVolume
    ) {

        this.brand = validateStringPar(brand, "--");
        this.model = validateStringPar(model, "--");
        this.engineVolume = validateDoublePar(engineVolume, 1.0);
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

    public double getColor() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();

    @Override
    public String toString() {
        return brand + " " + model + ", " + engineVolume;
    }
}
