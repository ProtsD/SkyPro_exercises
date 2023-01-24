package com.skypro.course2.hw4_polymorphism;

import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicB;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicC;
import com.skypro.course2.hw4_polymorphism.drivers.DriverWithLicD;
import com.skypro.course2.hw4_polymorphism.transport.Bus;
import com.skypro.course2.hw4_polymorphism.transport.Car;
import com.skypro.course2.hw4_polymorphism.transport.Truck;

public class Main {
    public static void main(String[] args) {
        /////////////////// Exercise 1 ///////////////////
        Car car1 = new Car(
                "car1",
                "car model 1",
                2.0,
                new DriverWithLicB("Denis1", true, 2030));
        Car car2 = new Car(
                "car2",
                "car model 2",
                2.0,
                new DriverWithLicB("Denis2", false, 2031));
        Car car3 = new Car(
                "car3",
                "car model 3",
                2.0,
                new DriverWithLicB("Denis3", true, 2032));
        Car car4 = new Car(
                "car4",
                "car model 4",
                2.0,
                new DriverWithLicB("Denis4", true, 2033));
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
        car4.printInfo();



        Bus bus1 = new Bus(
                "bus1",
                "bus model 1",
                2.0,
        new DriverWithLicC("Dima1", true, 2030));
        Bus bus2 = new Bus(
                "bus2",
                "bus model 2",
                2.0,
                new DriverWithLicC("Dima2", true, 2031));
        Bus bus3 = new Bus(
                "bus3",
                "bus model 3",
                2.0,
                new DriverWithLicC("Dima3", true, 2032));
        Bus bus4 = new Bus(
                "bus4",
                "bus model 4",
                2.0,
                new DriverWithLicC("Dima4", true, 2033));
        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();
        bus4.printInfo();


        Truck truck1 = new Truck(
                "truck1",
                "truck model 1",
                2.0,
                new DriverWithLicD("Fedor1", true, 2030));
        Truck truck2 = new Truck(
                "truck2",
                "truck model 2",
                2.0,
                new DriverWithLicD("Fedor2", true, 2031));
        Truck truck3 = new Truck(
                "truck3",
                "truck model 3",
                2.0,
                new DriverWithLicD("Fedor3", true, 2032));
        Truck truck4 = new Truck(
                "truck4",
                "truck model 4",
                2.0,
                new DriverWithLicD("Fedor4", true, 2033));
        truck1.printInfo();
        truck2.printInfo();
        truck3.printInfo();
        truck4.printInfo();

        truck4.pitStop();
        truck4.printMaxSpeed();
        truck4.printTheBestTime();

    }
}
