package com.skypro.course2.hw7_list_queue.service;

import com.skypro.course2.Validation;

public class Mechanic<T> {
    private String name;
    private String employerName;

    public Mechanic(String name, String employerName) {
        this.name = Validation.validateStringPar(name,"Default");
        this.employerName = Validation.validateStringPar(employerName,"Default");
    }

    public void performMaintenance(T transport) {
        System.out.println(this + " is doing maintenance on " + transport);
    }
    public void repairCar(T transport) {
        System.out.println(this + " is repairing " + transport);
    }

    @Override
    public String toString() {
        return name + " (company: " + employerName + ")";
    }
}
