package com.skypro.course2.hw8_map.transport;

import com.skypro.course2.hw8_map.drivers.DriverWithLicC;
import com.skypro.course2.hw8_map.enums.SeatsCapacity;
import com.skypro.course2.hw8_map.exceptions.TransportTypeException;
import com.skypro.course2.hw8_map.service.Mechanic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class Bus extends Transport<DriverWithLicC> {

    SeatsCapacity seatsCapacity;

    public Bus(String brand, String model, double engineVolume, DriverWithLicC driver, SeatsCapacity seatsCapacity, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.seatsCapacity = seatsCapacity;
    }

    public SeatsCapacity getSeatsCapacity() {
        return seatsCapacity;
    }

    public void setSeatsCapacity(SeatsCapacity seatsCapacity) {
        this.seatsCapacity = seatsCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bus" + getBrand() + " is driving");
    }

    @Override
    public void stop() {
        System.out.println("Bus" + getBrand() + " is stopped");
    }

    @Override
    public void printType() {
        System.out.println(seatsCapacity);
    }

    @Override
    public void makeDiagnostic() throws TransportTypeException {
            throw new TransportTypeException("No need to make diagnostic for a bus: ");
    }

    @Override
    public String toString() {
        return super.toString() + ", ";
    }

    @Override
    public void pitStop() {
        System.out.println(getBrand() + " is at pit-stop");
    }

    @Override
    public void printTheBestTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The best time of " + getBrand() + " is " + dtf.format(now));
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Max speed of " + getBrand() + " is " + generateRandomValue(100, 150));
    }

    private int generateRandomValue(int minValue, int maxValue) {
        int diff = maxValue - minValue;
        Random random = new Random();
        return random.nextInt(diff + 1) + minValue;
    }
}
