package com.skypro.course1.hw8_arrays1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///////////////////////// Exercise 1 /////////////////////////
        /*
        Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
            с помощью ключевого слова или сразу заполненный элементами.
        */
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        char[] thirdArray = {'a', 'b', 'c'};

        ///////////////////////// Exercise 2 /////////////////////////
        /*
        Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента,
        через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        */
        System.out.println("Exercise 2");
        System.out.println("firstArray:");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i == firstArray.length - 1) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("\nsecondArray:");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i == secondArray.length - 1) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("\nthirdArray:");
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i == thirdArray.length - 1) {
                continue;
            }
            System.out.print(", ");
        }

        ///////////////////////// Exercise 3 /////////////////////////
        /*
        Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента
        массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива
        располагаются на одной строчке, а элементы другого массива – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        Если во втором задании в консоль у вас вывелся результат
        1, 2, 3
        1.57, 7.654, 9.986
        произвольные элементы третьего массива

        То в третьем задании результат должен быть
        3, 2, 1
        9.986, 7.654, 1.57
        произвольные элементы третьего массива в обратном порядке
        */
        System.out.println("\n\nExercise 3");
        System.out.println("firstArray:");
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i == 0) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("\nsecondArray:");
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i == 0) {
                continue;
            }
            System.out.print(", ");
        }
        System.out.println("\nthirdArray:");
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i == 0) {
                continue;
            }
            System.out.print(", ");
        }

        ///////////////////////// Exercise 4 /////////////////////////
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать
        циклы. Распечатайте результат преобразования в консоль.
        */
        System.out.println("\n\nExercise 4");
        System.out.println("firstArray:");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                ++firstArray[i];
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}