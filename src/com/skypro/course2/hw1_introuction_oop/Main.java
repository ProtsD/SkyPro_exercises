package com.skypro.course2.hw1_introuction_oop;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "yellow",
                2015,
                "Russia");

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0, "black",
                2020,
                "Germany");

        Car bMW = new Car(
                "BMW",
                "Z8",
                3.0,
                "black",
                2021,
                "Germany");

        Car kia = new Car(
                "Kia",
                "Sportage 4th generation",
                2.4,
                "red",
                2018,
                "South Korea");

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "orange",
                2016,
                "South Korea");

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);

        Car hyundai2 = new Car(
                "",
                "",
                0,
                "",
                0,
                "");

        Car hyundai3 = new Car(
                null,
                null,
                -1,
                null,
                -1,
                null);

        System.out.println(hyundai2);
        System.out.println(hyundai3);
    }
}
