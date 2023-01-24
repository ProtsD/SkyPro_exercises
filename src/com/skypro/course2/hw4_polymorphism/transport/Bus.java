package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.Сompeting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Bus <T extends DriverWithLicC> extends Transport implements Сompeting {
    T driver;
    public Bus(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    @Override
    public void start() {
        System.out.println("Bus is driving");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopped");
    }

    @Override
    public String toString() {
        return super.toString() + ", ";
    }

    @Override
    public void pitStop() {
        System.out.println("Bus is at pit-stop");
    }

    @Override
    public void printTheBestTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The best time is " + dtf.format(now));
    }

    @Override
    public void printMaxSpeed() {
        System.out.println("Max speed is " + generateRandomValue(100, 150));
    }

    private int generateRandomValue(int minValue, int maxValue) {
        int diff = maxValue - minValue;
        Random random = new Random();
        return random.nextInt(diff + 1) + minValue;
    }

    public void printInfo() {
        System.out.println("Driver " + driver.getName() + " is behind the wheel and participate in the race");
    }
}
