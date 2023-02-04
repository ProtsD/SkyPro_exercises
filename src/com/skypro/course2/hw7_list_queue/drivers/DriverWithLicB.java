package com.skypro.course2.hw7_list_queue.drivers;

public class DriverWithLicB extends Driver {
    public DriverWithLicB(String name, boolean hasDriverLic, int yearsOfExperience) {
        super(name, hasDriverLic, yearsOfExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver with licence B " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver with licence B " + getName() + " has stopped");
    }

    @Override
    public void fuelTankRefill() {
        System.out.println("Driver with licence B " + getName() + " is refilling fuel tank");
    }
}
