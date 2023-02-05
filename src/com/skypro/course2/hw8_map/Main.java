package com.skypro.course2.hw8_map;

import com.skypro.course2.hw8_map.drivers.DriverWithLicB;
import com.skypro.course2.hw8_map.drivers.DriverWithLicC;
import com.skypro.course2.hw8_map.drivers.DriverWithLicD;
import com.skypro.course2.hw8_map.enums.CarBodyType;
import com.skypro.course2.hw8_map.enums.LoadCapacity;
import com.skypro.course2.hw8_map.enums.SeatsCapacity;
import com.skypro.course2.hw8_map.exceptions.TransportTypeException;
import com.skypro.course2.hw8_map.service.Mechanic;
import com.skypro.course2.hw8_map.service.ServiceStation;
import com.skypro.course2.hw8_map.transport.Bus;
import com.skypro.course2.hw8_map.transport.Car;
import com.skypro.course2.hw8_map.transport.Transport;
import com.skypro.course2.hw8_map.transport.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transportList = new ArrayList<>();

        ServiceStation serviceStation = new ServiceStation();

        List<Mechanic> mechanicList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            mechanicList.add(new Mechanic("Mechanic#" + i, "Companny#" + i));

        }

        for (int i = 1; i <= 3; i++) {
            Car car = new Car(
                    "Car#" + i,
                    "CarModel#" + i,
                    2.0,
                    new DriverWithLicB("Driver#" + i + " with lic. B", true, 2030 + i),
                    CarBodyType.SUV,
                    mechanicList);

            Bus bus = new Bus(
                    "Bus#" + i,
                    "BusModel#" + i,
                    2.0,
                    new DriverWithLicC("Driver#" + i + " with lic. C", true, 2030 + i),
                    SeatsCapacity.MIDDLE,
                    mechanicList);

            Truck truck = new Truck(
                    "Truck#" + i,
                    "TruckModel#" + i,
                    2.0,
                    new DriverWithLicD("Driver#" + i + " with lic. D", true, 2030 + i),
                    LoadCapacity.N3,
                    mechanicList);

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

            // Filling transport list
            transportList.add(car);
            transportList.add(bus);
            transportList.add(truck);
        }

        // Move transport from transport list to queue in service if it is allowed to do service for a transport
        for (int i = 0; i < transportList.size(); i++) {
            System.out.println(transportList.get(i).getDriver().getName());
            System.out.println(transportList.get(i).toString());

            try {
                serviceStation.addTransportToQueue(transportList.get(i));
                for (Mechanic mechanic : mechanicList) {
                    System.out.println(mechanic);
                }
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
           System.out.println();
        }

        // Perform service and delete from queue
        for (int i = 0; i < serviceStation.getQueueInService().size();) {
            mechanicList.get(i).performMaintenance(serviceStation.getQueueInService().element());
            mechanicList.get(i).repairCar(serviceStation.getQueueInService().element());
            serviceStation.performService();
        }

        System.out.println();
        for (Mechanic m : mechanicList) {
            m.performMaintenance(transportList.get(1));
        }
        mechanicList.get(1).performMaintenance(transportList.get(1));

    }
    public static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is behind the wheel of " +
                transport.getBrand() + " and participate in the race");
    }
}
