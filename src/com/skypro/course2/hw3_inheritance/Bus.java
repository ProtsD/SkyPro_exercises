package com.skypro.course2.hw3_inheritance;

public class Bus extends Transport{
    public Bus(String brand,
               String model,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
    }
}
