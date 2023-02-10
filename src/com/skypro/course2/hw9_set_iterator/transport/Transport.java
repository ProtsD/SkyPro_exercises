package com.skypro.course2.hw9_set_iterator.transport;

import com.skypro.course2.Validation;
import com.skypro.course2.hw9_set_iterator.drivers.Driver;
import com.skypro.course2.hw9_set_iterator.exceptions.TransportTypeException;
import com.skypro.course2.hw9_set_iterator.service.Mechanic;
import com.skypro.course2.hw9_set_iterator.Сompeting;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Сompeting {
    private final String brand;
    private final String model;
    private final double engineVolume;

    private T driver;
    private List<Mechanic> mechanicList;


    public Transport(String brand,
                     String model,
                     double engineVolume,
                     T driver,
                     List<Mechanic> mechanicList) {

        this.brand = Validation.validateStringPar(brand, "--");
        this.model = Validation.validateStringPar(model, "--");
        this.engineVolume = Validation.validateDoublePar(engineVolume, 1.0);
        setDriver(driver);
        this.mechanicList = mechanicList;
    }

    // region getters-setters
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

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    //endregion
    public abstract void start();

    public abstract void stop();

    public abstract void printType();

    public abstract void makeDiagnostic() throws TransportTypeException;

    @Override
    public String toString() {
        return "brand=" + brand + ", model=" + model + ", engineVolume=" + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

}
