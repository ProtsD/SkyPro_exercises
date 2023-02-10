package com.skypro.course2.hw9_set_iterator;

import com.skypro.course2.hw9_set_iterator.drivers.Driver;
import com.skypro.course2.hw9_set_iterator.drivers.DriverWithLicB;
import com.skypro.course2.hw9_set_iterator.drivers.DriverWithLicC;
import com.skypro.course2.hw9_set_iterator.drivers.DriverWithLicD;
import com.skypro.course2.hw9_set_iterator.enums.CarBodyType;
import com.skypro.course2.hw9_set_iterator.enums.LoadCapacity;
import com.skypro.course2.hw9_set_iterator.enums.SeatsCapacity;
import com.skypro.course2.hw9_set_iterator.exceptions.TransportTypeException;
import com.skypro.course2.hw9_set_iterator.service.Mechanic;
import com.skypro.course2.hw9_set_iterator.service.ServiceStation;
import com.skypro.course2.hw9_set_iterator.transport.Bus;
import com.skypro.course2.hw9_set_iterator.transport.Car;
import com.skypro.course2.hw9_set_iterator.transport.Transport;
import com.skypro.course2.hw9_set_iterator.transport.Truck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Transport<? extends Driver>> transportList = new ArrayList<>();

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
        for (int i = 0; i < serviceStation.getQueueInService().size(); ) {
            mechanicList.get(i).performMaintenance(serviceStation.getQueueInService().element());
            mechanicList.get(i).repairCar(serviceStation.getQueueInService().element());
            serviceStation.performService();
        }

        System.out.println();
        for (Mechanic m : mechanicList) {
            m.performMaintenance(transportList.get(1));
        }

        //////////////////////////// hw8_map ////////////////////////////
        for (int i = 0; i < mechanicList.size(); i++) {
            System.out.println(mechanicList.get(i));
        }
        System.out.println();

        Map<Transport, Mechanic> serviceLog = new HashMap<>();
        for (int i = 0; i < transportList.size(); i++) {
            int j = i;
            if (mechanicList.size() - 1 < i) j = i % mechanicList.size();
            System.out.println("i =" + i + ", j=" + j);
            serviceLog.put(transportList.get(i), transportList.get(i).getMechanicList().get(j));
        }

        for (Map.Entry<Transport, Mechanic> log : serviceLog.entrySet()) {
            System.out.println(log.getKey() + " maintained by " + log.getValue());
        }
        //////////////////////////// hw9_set_iterator ////////////////////////////

        Set<Driver> driverList = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            driverList.add(new DriverWithLicB("Driver#" + i + " with lic. B", true, 2030 + i));
        }
        System.out.println("////////////////***** hw9_set_iterator *****////////////////");
        driverList.add(new DriverWithLicB("Driver#" + 2 + " with lic. B", true, 2030 + 2));
        Iterator<Driver> driverIterator = driverList.iterator();
        while (driverIterator.hasNext()) {
            System.out.println(driverIterator.next());
        }
    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Driver " + transport.getDriver().getName() + " is behind the wheel of " +
                transport.getBrand() + " and participate in the race");
    }
}
