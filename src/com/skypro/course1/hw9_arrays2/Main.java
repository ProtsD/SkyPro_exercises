package com.skypro.course1.hw9_arrays2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //////////////////// Exercise 1 ////////////////////
        /*
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».
        */
        int expensesTotal = 0;
        int[] expenses = generateRandomArray();
        for (int expense : expenses) {
            expensesTotal += expense;
        }
        System.out.println("Exercise 1");
        System.out.println(Arrays.toString(expenses));
        System.out.println("Сумма трат за месяц составила " + expensesTotal + " рублей");

        //////////////////// Exercise 2 ////////////////////
        /*
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        */
        int minExpense = expenses[0];
        int maxExpense = expenses[0];
        for (int i = 1; i < expenses.length - 1; i++) {
            if (minExpense > expenses[i]) {
                minExpense = expenses[i];
            }
            if (maxExpense < expenses[i]) {
                maxExpense = expenses[i];
            }
        }
        System.out.println("\nExercise 2");
        System.out.println("Минимальная сумма трат за день составила " + minExpense +
                " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");

        //////////////////// Exercise 3 ////////////////////
        /*
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        поделить на количество дней), и вывести в консоль результат в формате:
        «Средняя сумма трат за месяц составила … рублей».
        **Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
         */
        int daysInMonth = 30;
        double expenseAverage = expensesTotal / daysInMonth;
        System.out.println("\nExercise 3");
        System.out.println("Средняя сумма трат за месяц составила " + expenseAverage + " рублей");

        //////////////////// Exercise 4 ////////////////////
        /*
        В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в
        обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве
        данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        **Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        массиву циклом и распечатать его элементы в правильном порядке.
         */
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("\nExercise 4");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        //////////////////// Extra Exercise 1 ////////////////////
        /*
        Задание 5
        Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в
        консоль. Постарайтесь заполнить обе диагонали в одном цикле.
        Для печати следует использовать следующий код:
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        */
        int[][] matrix = new int[3][3];
        boolean value = false;
        System.out.println("\n\nExtra Exercise 1");

        for (int[] row : matrix) {
            for (int column : row) {
                if (value) {
                    column = 0;
                } else {
                    column = 1;
                }
                value = !value;
                System.out.print(column + " ");
            }
            System.out.println();
        }
        //////////////////// Extra Exercise 2 ////////////////////
        /*
        Задание 6
        У нас есть массив, в котором содержатся целочисленные значения от 1 до 5.
        Наш коллега что-то напутал, в итоге массив читается не с начала, а с конца.
        Нам нужно исправить ошибку и переработать код так, чтобы массив читался в правильном порядке.
        Нам дан массив чисел: {5, 4, 3, 2, 1}
        Необходимо привести его к виду: {1, 2, 3, 4, 5}
        Решите задачу с использованием дополнительного массива.
        Напечатайте массив до преобразования и после с помощью
        System.out.println(Arrays.toString(arr));
        */
        int[] Array1 = {5, 4, 3, 2, 1};
        int[] Array2 = new int[5];
        System.out.println("\nExtra Exercise 2");
        for (int i = 0; i < Array1.length; i++) {
            Array2[Array2.length - 1 - i] = Array1[i];
        }
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
        //////////////////// Extra Exercise 3 ////////////////////
        /*
        Задание 7
        Решите предыдущее задание, но без использования дополнительного массива.
        Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
        Выведите результат программы в консоль тем же способом.
        Уточнения:
        • Это задание не на сортировку.
        • Не использовать Arrays.sort() и другие способы сортировок.
        • Числа в порядке убывания даны исключительно для указания направления чтения.
        • Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
        */
        int intMemory;
        System.out.println("\nExtra Exercise 3");
        for (int i = 0, j = Array1.length - 1; i < (Array1.length) / 2; i++, j--) {
            intMemory = Array1[i];
            Array1[i] = Array1[j];
            Array1[j] = intMemory;
        }
        System.out.println(Arrays.toString(Array1));
        //////////////////// Extra Exercise 4&5 ////////////////////
        /*
        Задание 8  Очень сложно.
        Дан массив чисел {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}
        Необходимо найти два числа, сумма которых равна −2.
        Напечатать эти числа в консоль.
        Подсказка
        Может потребоваться отсортировать массив с помощью Arrays.sort(arr).

        Задание 9  Очень сложно.
        Усложняем предыдущую задачу. Найдите все пары чисел, сумма которых равна −2. Напечатайте их в консоль.
        */
        int[] Arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int sum = -2;
        Arrays.sort(Arr);
        System.out.println("\nExtra Exercise 4&5");
        System.out.println(Arrays.toString(Arr));
        for (int i = 0; i < Arr.length; i++) {
            for (int j = i; j < Arr.length; j++){
                if (Arr[i] + Arr[j] == sum){
                    System.out.println("число 1: " + Arr[i] + "\tчисло 2: " + Arr[j]);
                }
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}