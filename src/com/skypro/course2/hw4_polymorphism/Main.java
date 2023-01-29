package com.skypro.course2.hw4_polymorphism;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicB;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicD;
import com.skypro.course2.hw4_polymorphism.transport.Bus;
import com.skypro.course2.hw4_polymorphism.transport.Car;
import com.skypro.course2.hw4_polymorphism.transport.Transport;
import com.skypro.course2.hw4_polymorphism.transport.Truck;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            Car car = new Car(
                    "Car #" + i,
                    "car model " + i,
                    2.0,
                    new DriverWithLicB("Driver #" + i + " with lic. B", true, 2030 + i));

            Bus bus = new Bus(
                    "Bus #" + i,
                    "bus model " + i,
                    2.0,
                    new DriverWithLicC("Driver #" + i + " with lic. C", true, 2030 + i));

            Truck truck = new Truck(
                    "Truck #" + i,
                    "truck model " + i,
                    2.0,
                    new DriverWithLicD("Driver #" + i + " with lic. D", true, 2030 + i));

            printInfo(car);
            printInfo(bus);
            printInfo(truck);

            truck.pitStop();
            truck.printMaxSpeed();
            truck.printTheBestTime();
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is behind the wheel of " +
                transport.getBrand() + " and participate in the race");
    }
}
