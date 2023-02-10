package com.skypro.course2.hw9_set_iterator.drivers;

public class DriverWithLicD extends Driver {
    public DriverWithLicD(String name, boolean hasDriverLic, int yearsOfExperience) {
        super(name, hasDriverLic, yearsOfExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver with licence D " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver with licence D " + getName() + " has stopped");
    }

    @Override
    public void fuelTankRefill() {
        System.out.println("Driver with licence D " + getName() + " is refilling fuel tank");
    }
}
