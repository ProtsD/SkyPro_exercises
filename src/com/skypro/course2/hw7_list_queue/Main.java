package com.skypro.course2.hw7_list_queue;

import com.skypro.course2.hw7_list_queue.drivers.DriverWithLicB;
import com.skypro.course2.hw7_list_queue.drivers.DriverWithLicC;
import com.skypro.course2.hw7_list_queue.drivers.DriverWithLicD;
import com.skypro.course2.hw7_list_queue.enums.CarBodyType;
import com.skypro.course2.hw7_list_queue.enums.LoadCapacity;
import com.skypro.course2.hw7_list_queue.enums.SeatsCapacity;
import com.skypro.course2.hw7_list_queue.exceptions.TransportTypeException;
import com.skypro.course2.hw7_list_queue.transport.Bus;
import com.skypro.course2.hw7_list_queue.transport.Car;
import com.skypro.course2.hw7_list_queue.transport.Transport;
import com.skypro.course2.hw7_list_queue.transport.Truck;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            Car car = new Car(
                    "Car #" + i,
                    "car model " + i,
                    2.0,
                    new DriverWithLicB("Driver #" + i + " with lic. B", true, 2030 + i),
                    CarBodyType.SUV);

            Bus bus = new Bus(
                    "Bus #" + i,
                    "bus model " + i,
                    2.0,
                    new DriverWithLicC("Driver #" + i + " with lic. C", true, 2030 + i),
                    SeatsCapacity.MIDDLE);

            Truck truck = new Truck(
                    "Truck #" + i,
                    "truck model " + i,
                    2.0,
                    new DriverWithLicD("Driver #" + i + " with lic. D", true, 2030 + i),
                    LoadCapacity.N3);

            printInfo(car);
            car.printType();
            car.makeDiagnostic();
            System.out.println();

            printInfo(bus);
            bus.printType();
            try {
                bus.makeDiagnostic();
            } catch (TransportTypeException e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println();
            }


            printInfo(truck);
            truck.printType();
            truck.makeDiagnostic();
            System.out.println();

            truck.pitStop();
            truck.printMaxSpeed();
            truck.printTheBestTime();
            System.out.println();

        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is behind the wheel of " +
                transport.getBrand() + " and participate in the race");
    }
}
