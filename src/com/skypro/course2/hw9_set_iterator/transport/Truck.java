package com.skypro.course2.hw9_set_iterator.transport;

import com.skypro.course2.hw9_set_iterator.drivers.DriverWithLicD;
import com.skypro.course2.hw9_set_iterator.enums.LoadCapacity;
import com.skypro.course2.hw9_set_iterator.service.Mechanic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class Truck extends Transport<DriverWithLicD> {
    LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverWithLicD driver, LoadCapacity loadCapacity, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck" + getBrand() + " is driving");
    }

    @Override
    public void stop() {
        System.out.println("Truck" + getBrand() + " is stopped");
    }

    @Override
    public void printType() {
        System.out.println(loadCapacity);
    }

    @Override
    public void makeDiagnostic() {
        System.out.println("Truck diagnostic is done.");
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
