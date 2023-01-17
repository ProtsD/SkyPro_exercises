package com.skypro.cource2.hw2_encapsulation;

import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmissionType;
    private final String carBodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean summerOrWinterTireType;

    private Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmissionType,
               String carBodyType,
               String registrationNumber,
               int seatsNumber,
               Key key) {

        this.brand = validateStringPar(brand, "--");
        this.model = validateStringPar(model, "--");
        this.engineVolume = validateDoublePar(engineVolume, 1.5);
        this.color = validateStringPar(color, "white");
        this.productionYear = (int) validateDoublePar(productionYear, 2000);
        this.productionCountry = validateStringPar(productionCountry, "--");

        this.transmissionType = validateStringPar(transmissionType, "--");
        this.carBodyType = validateStringPar(carBodyType, "--");
        this.registrationNumber = validateCarNumber(registrationNumber);
        this.seatsNumber = (int) validateDoublePar(seatsNumber, 2);
        changeTires();
        this.key = key;

    }

    public String validateStringPar(String string, String substitution) {
        return (string == null || string.isBlank() || string.isEmpty()) ? substitution : string;
    }

    public double validateDoublePar(double value, double substitution) {
        return (value <= 0.0) ? substitution : value;
    }

    public double validateEngineVolume(double engineVolume) {
        return (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public String validateCarNumber(String string) {
        if (string != null && Pattern.matches("[А-Я][0-9]{3}[А-Я]{2}[0-9]{3}", string)) return string;
        System.out.println("Reg. number is not correct");
        return "--";
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteStart, boolean withoutKeyAccess) {
            this.remoteStart = remoteStart;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        @Override
        public String toString() {
            return ", " + ((remoteStart) ? "Remote start" : "Without remote start") +
                    ", " + ((withoutKeyAccess) ? "With key" : "Without key");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = validateStringPar(transmissionType, "--");
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validateCarNumber(registrationNumber);
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isSummerOrWinterTireType() {
        return summerOrWinterTireType;
    }

    public void setSummerOrWinterTireType(boolean summerOrWinterTireType) {
        this.summerOrWinterTireType = summerOrWinterTireType;
    }

    public void changeTires() {
        LocalDate currentDate = LocalDate.now();
        Month currentMonth = currentDate.getMonth();
        summerOrWinterTireType = (currentMonth.getValue() >= 5 && currentMonth.getValue() <= 9) ? true : false;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + engineVolume + ", " + color + ", " + productionYear + ", " + productionCountry
                + ", " + transmissionType + ", " + carBodyType + ", " + registrationNumber + ", " + seatsNumber
                + ", " + ((summerOrWinterTireType) ? "Summer tires" : "Winter tires") + key;
    }
}
