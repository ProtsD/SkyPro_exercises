package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicB;
import com.skypro.course2.hw4_polymorphism.Сompeting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Car extends Transport<DriverWithLicB> {
    //T driver;


    public Car(String brand, String model, double engineVolume, DriverWithLicB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void start() {
        System.out.println("Car" + getBrand() + " is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car" + getBrand() + " is stopped");
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
