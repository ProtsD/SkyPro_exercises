package com.skypro.course2.hw3_inheritance;

public class Main {
    public static void main(String[] args) {
    /////////////////// Exercise 1 ///////////////////
        Car lada = new Car(
                "Lada",
                "Granta",
                "yellow",
                2015,
                "Russia",
                190,
                1.7,
                "Manual",
                "Sedan",
                "А111АА777",
                4,
                new Car.Key(true,true));

        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                "black",
                2020,
                "Germany",
                189,
                3.0,
                "Automatic",
                "Sedan",
                "Р111РР777",
                4,
                new Car.Key(true,true));

        Car bMW = new Car(
                "BMW",
                "Z8",
                "black",
                2021,
                "Germany",
                166,
                3.0,
                "Manual",
                "Sedan",
                "Х111ХХ777",
                6,
                new Car.Key(true,true));

        Car kia = new Car(
                "Kia",
                "Sportage 4th generation",
                "red",
                2018,
                "South Korea",
                155,
                2.4,
                "Manual",
                "Sedan",
                "Х222ХХ777",
                4,
                new Car.Key(true,true));

        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                "orange",
                2016,
                "South Korea",
                145,
                1.6,
                "Manual",
                "Sedan",
                "Х333ХХ777",
                4,
                new Car.Key(true,true));

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bMW);
        System.out.println(kia);
        System.out.println(hyundai);


        Car hyundai2 = new Car(
                "",
                "",
                "",
                0,
                "",
                0,
                0,
                "",
                "",
                "",
                -1,
                new Car.Key(true,true));

        Car hyundai3 = new Car(
                null,
                null,
                null,
                -1,
                null,
                -1,
                -1,
                null,
                null,
                null,
                -1,
                new Car.Key(true,true));

        System.out.println(hyundai2);
        System.out.println(hyundai3);

        /////////////////// Exercise 2 ///////////////////
        Bus Bus1 = new Bus(
                "Hyundai",
                "Universe",
                "orange",
                2002,
                "South Korea",
                120);
        System.out.println(Bus1);

        Bus Bus2 = new Bus(
                "Volvo",
                "B10M",
                "green",
                2005,
                "Sweden",
                110);
        System.out.println(Bus2);

        Bus Bus3 = new Bus(
                null,
                null,
                null,
                -1,
                null,
                -1);
        System.out.println(Bus3);
    }
}
