package com.skypro.course2.hw7_list_queue.transport;

import com.skypro.course2.hw7_list_queue.drivers.Driver;
import com.skypro.course2.hw7_list_queue.exceptions.TransportTypeException;
import com.skypro.course2.hw7_list_queue.Сompeting;

public abstract class Transport<T extends Driver>implements Сompeting {
    private final String brand;
    private final String model;
    private final double engineVolume;

    private T driver;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver) {

        this.brand = validateStringPar(brand, "--");
        this.model = validateStringPar(model, "--");
        this.engineVolume = validateDoublePar(engineVolume, 1.0);
        setDriver(driver);
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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void printType();

    public abstract void makeDiagnostic () throws TransportTypeException;
    @Override
    public String toString() {
        return brand + " " + model + ", " + engineVolume;
    }
}
