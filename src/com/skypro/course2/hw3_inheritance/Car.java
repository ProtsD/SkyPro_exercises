package com.skypro.course2.hw3_inheritance;

import java.time.LocalDate;
import java.time.Month;
import java.util.regex.Pattern;

public class Car extends Transport{
    private double engineVolume;
    private String transmissionType;
    private final String carBodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean summerOrWinterTireType;

    private Key key;

    public Car(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, double engineVolume, String transmissionType, String carBodyType, String registrationNumber, int seatsNumber, boolean summerOrWinterTireType, Key key) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmissionType = transmissionType;
        this.carBodyType = carBodyType;
        this.registrationNumber = registrationNumber;
        this.seatsNumber = seatsNumber;
        this.summerOrWinterTireType = summerOrWinterTireType;
        this.key = key;
    }

    public Car(String brand,
               String model,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed,

               double engineVolume,
               String transmissionType,
               String carBodyType,
               String registrationNumber,
               int seatsNumber,
               Key key
               ) {

        super(brand, model, color, productionYear, productionCountry, maxSpeed);

        this.engineVolume = validateDoublePar(engineVolume, 1.5);
        this.transmissionType = validateStringPar(transmissionType, "--");
        this.carBodyType = validateStringPar(carBodyType, "--");
        this.registrationNumber = validateCarNumber(registrationNumber);
        this.seatsNumber = (int) validateDoublePar(seatsNumber, 2);
        changeTires();
        this.key = key;

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

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = validateEngineVolume(engineVolume);
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
        return super.toString() + ", " + engineVolume
                + ", " + transmissionType + ", " + carBodyType + ", " + registrationNumber + ", " + seatsNumber
                + ", " + ((summerOrWinterTireType) ? "Summer tires" : "Winter tires") + key;
    }
}
