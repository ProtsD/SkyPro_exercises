package com.skypro.course2.hw7_list_queue.transport;

import com.skypro.course2.hw7_list_queue.drivers.DriverWithLicB;
import com.skypro.course2.hw7_list_queue.enums.CarBodyType;
import com.skypro.course2.hw7_list_queue.service.Mechanic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class Car extends Transport<DriverWithLicB> {
    CarBodyType carBodyType;

    public Car(String brand, String model, double engineVolume, DriverWithLicB driver, CarBodyType carBodyType, List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.carBodyType = carBodyType;
    }

    public CarBodyType getCarBodyType() {
        return carBodyType;
    }

    public void setCarBodyType(CarBodyType carBodyType) {
        this.carBodyType = carBodyType;
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
    public void printType() {
        System.out.println(carBodyType);
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

    @Override
    public void makeDiagnostic() {
        System.out.println("Car diagnostic is done.");
    }

    private int generateRandomValue(int minValue, int maxValue) {
        int diff = maxValue - minValue;
        Random random = new Random();
        return random.nextInt(diff + 1) + minValue;
    }
}
