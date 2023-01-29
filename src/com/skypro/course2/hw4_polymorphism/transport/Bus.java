package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.Сompeting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Bus extends Transport<DriverWithLicC> {

    public Bus(String brand, String model, double engineVolume, DriverWithLicC driver) {
        super(brand, model, engineVolume, driver);
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
