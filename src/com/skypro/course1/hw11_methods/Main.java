package com.skypro.course1.hw11_methods;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void printSeparator() {
        System.out.println("+++++++++++");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static boolean checkIfLeapYear(int year) {                                           // Method for Exercise 1
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printOSVersion(int releaseYear, int clientOS) {                          // Method for Exercise 2
        int oldRelease = 2015;
        if (clientOS == 1) {                                 // 0 — iOS или 1 — Android
            if (releaseYear >= oldRelease) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (releaseYear >= oldRelease) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int calcDeliveryDays(int distance) {                                          // Method for Exercise 3
//        distance = 101;
        int shortDistance = 20;
        int rangeDistance = 40;
        int deliveryDays = 1 + (distance - shortDistance) / rangeDistance;
        if (distance <= shortDistance) {
            return 1;
        } else if ((distance - shortDistance) % rangeDistance == 0) {
            return deliveryDays;
        } else {
            return deliveryDays + 1;
        }
    }

    public static int[] generateRandomArray() {                                           // Method for Extra Exercise 6
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double calcAverageExpense(int[] numbers) {                              // Method for Extra Exercise 6

        int expensesTotal = 0;
        for (int i = 0; i < numbers.length; i++) {
            expensesTotal += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        return (double) expensesTotal / numbers.length;
    }


    public static void main(String[] args) {
        int[] issueByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issueByMonth.length; i++) {
            printIssues(issueByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issueByMonth);
        printIssues(total);

        ///////////////// Exercise 1 /////////////////
        /*
        Реализуйте метод, который получает в качестве параметра год, а затем проверяет, является ли он високосным, и выводит
        результат в консоль.
        *Эту проверку вы уже реализовывали в задании по условным операторам. HomeWork_5 Exercise 3*
        Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
        Результат программы выведите в консоль. Если год високосный, то должно быть выведено
        “*номер года —* високосный год”. Если год не високосный, то, соответственно: “*номер года —* не **високосный год”.
        */
        int year = 2001;
        System.out.println("\nExercise 1");
        if (checkIfLeapYear(year)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }

        ///////////////// Exercise 2 /////////////////
        /*
        Вспомним задание 2 (HomeWork_5 Exercise 2) по условным операторам, где нам необходимо было предложить пользователю облегченную версию
        приложения. Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
        ( 0 — iOS или 1 — Android) и год выпуска устройства.
        Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        Текущий год можно получить таким способом: int currentYear = LocalDate.now().getYear();
        Или самим задать значение вручную, введя в переменную числовое значение.
        В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения
        (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
        */
        int clientOS = 0;                           // 0 — iOS или 1 — Android
        int releaseYear = LocalDate.now().getYear();
        System.out.println("\nExercise 2");
        printOSVersion(releaseYear, clientOS);

        ///////////////// Exercise 3 /////////////////
        /*
        Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты отбанка (omeWork_5 Exercise 4).
        Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
        итоговое количество дней доставки.
        */
        int deliveryDistance = 101;
        System.out.println("\nExercise 3");
        System.out.println("Потребуется дней: " + calcDeliveryDays(deliveryDistance));

        ///////////////// Extra Exercise 6 /////////////////
        /*
        Снова вспоминаем домашнее задание по массивам. В нем была задача, которая требовала высчитать среднюю выплату
        за день.
        Был дан сгенерированный массив из 30 значений от 100 до 200 тысяч, для его генерации допускается использовать
        метод из прошлого домашнего задания.
        • Нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        • Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
        :exclamation: Важно помнить: подсчет среднего значения может иметь остаток (то есть быть не целым,
        а дробным числом).
        Нужно сгенерировать массив, подать его в наш метод, а внутри метода подсчитать сумму элементов и вычислить
        среднее значение, которое нужно вернуть из метода в виде результата.
        Сложность в том, что метод нужно не просто написать, но еще и декомпозировать.
        То есть для работы этого метода нужно будет создать еще методы (1 или более), которые его будут обслуживать и
        вычислять промежуточные результаты. Среднее значение нужно вычислять в дробном виде, так как результат должен
        быть точным.
        */
        System.out.println("\nExtra Exercise 6");
        System.out.printf("Средняя сумма трат в день в течении месяц составила %.2f рублей",
                                                                        calcAverageExpense(generateRandomArray()));
    }


}