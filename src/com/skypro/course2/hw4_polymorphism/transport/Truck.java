package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicD;
import com.skypro.course2.hw4_polymorphism.transport.Transport;
import com.skypro.course2.hw4_polymorphism.Сompeting;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;

public class Truck extends Transport<DriverWithLicD> {
    public Truck(String brand, String model, double engineVolume, DriverWithLicD driver) {
        super(brand, model, engineVolume, driver);
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
