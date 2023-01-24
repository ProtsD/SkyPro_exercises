package com.skypro.course2.hw4_polymorphism.transport;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicD;
import com.skypro.course2.hw4_polymorphism.transport.Transport;
import com.skypro.course2.hw4_polymorphism.Сompeting;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Random;

public class Truck<T extends DriverWithLicD> extends Transport implements Сompeting {
    T driver;
    public Truck(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume);
        this.driver = driver;
    }

    @Override
    public void start() {
        System.out.println("Truck is driving");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped");
    }

    @Override
    public String toString() {
        return super.toString() + ", ";
    }

    @Override
    public void pitStop() {
        System.out.println("Truck is at pit-stop");
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
