package com.skypro.course2.hw4_polymorphism.drivers;

public class DriverWithLicC extends Driver {
    public DriverWithLicC(String name, boolean hasDriverLic, int yearsOfExperience) {
        super(name, hasDriverLic, yearsOfExperience);
    }

    @Override
    public void start() {
        System.out.println("Driver with licence C " + getName() + " starts moving");
    }

    @Override
    public void stop() {
        System.out.println("Driver with licence C " + getName() + " has stopped");
    }

    @Override
    public void fuelTankRefill() {
        System.out.println("Driver with licence C " + getName() + " is refilling fuel tank");
    }
}
