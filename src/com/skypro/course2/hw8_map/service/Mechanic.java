package com.skypro.course2.hw8_map.service;

import com.skypro.course2.Validation;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String employerName;

    public Mechanic(String name, String employerName) {
        this.name = Validation.validateStringPar(name,"Default");
        this.employerName = Validation.validateStringPar(employerName,"Default");
    }

    public<T> void performMaintenance(T transport) {
        System.out.println(this + " is doing maintenance on " + transport);
    }
    public<T> void repairCar(T transport) {
        System.out.println(this + " is repairing " + transport);
    }

    @Override
    public String toString() {
        return name + " (company: " + employerName + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(employerName, mechanic.employerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employerName);
    }
}
