package com.skypro.course1.hw2_variables1;

public class Main {
    public static void main(String[] args) {

        //*************************************** Exercise 1 ********************************************
        /*
        Ваше первое задание: присвоить переменным разные значения. Для решения этой задачи используйте тип
        переменной var. В программе IDEA в новом созданном вами проекте присвойте переменной:
         dog значение 8;
         cat значение 3.6;
         paper значение 763789;
        Выведите значения каждой переменной в консоль.
        */
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Exercise 1: initialisation");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);

        //*************************************** Exercise 2 ********************************************
        /*
        Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4. Для решения этой задачи используйте
        тип переменной var. Выведите в консоль новые значения переменных.
        */
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("\nExercise 2: addition");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);

        //*************************************** Exercise 3 ********************************************
        /*
        А теперь нужно уменьшить значение каждой переменной:
         dog уменьшить на 3,5;
         cat уменьшить на 1,6;
         paper уменьшить на 7639;
        Выведите в консоль новые значения переменных. Для решения этой задачи используйте тип переменной var.
        */
        dog = dog - (int) 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("\nExercise 3: subtraction");
        System.out.println("dog:\t" + dog + "\ncat:\t" + cat + "\npaper:\t" + paper);

        //*************************************** Exercise 4 ********************************************
        /*
        Инициализируйте (=присвойте значение) переменную friend значением 19.
        Увеличьте значение переменной на 2, после чего поделите значение на 7.
        После каждой операции выводите значение переменной в консоль. В итоге, у вас должно быть выведено 3 значения
        одной переменной. Для решения этой задачи используйте тип переменной var.
        */
        var friend = 19;
        System.out.println("\nExercise 4: Multi math operations 1");
        System.out.println("initial value:\t\t" + friend);
        friend += 2;
        System.out.println("addition operation:\t" + friend);
        friend /= 7;
        System.out.println("division operation:\t" + friend);

        var friendGroup2 = 19;
        System.out.println("\nPrint in one step " +
                "\ninitial value:\t\t" + friendGroup2 +
                "\naddition operation:\t" + (friendGroup2 + 2) +
                "\ndivision operation:\t" + (friendGroup2 + 2) / 7);

        //*************************************** Exercise 5 ********************************************
        /*
        Инициализируйте переменную frog значением 3,5.
        Умножьте переменную в 10 раз и поделите на 3,5. Добавьте к последнему значению переменной 4. После каждой
        операции выводите значение переменной в консоль. В итоге, у вас должно быть выведено 4 значения одной
        переменной. Для решения этой задачи используйте тип переменной var.
        */
        var frog = 3.5;
        System.out.println("\nExercise 5: Multi math operations 2");
        System.out.println("initial value:\t\t\t\t" + frog);
        frog *= 10;
        System.out.println("multiplication operation:\t" + frog);
        frog /= 3.5;
        System.out.println("division operation:\t\t\t" + frog);
        frog += 4;
        System.out.println("addition operation:\t\t\t" + frog);

        var frogGroup2 = 3.5;
        System.out.println("\nPrint in one step " +
                "\ninitial value:\t\t\t\t" + frogGroup2 +
                "\nmultiplication operation:\t" + frogGroup2 * 10 +
                "\ndivision operation:\t\t\t" + frogGroup2 * 10 / 3.5 +
                "\naddition operation:\t\t\t" + (frogGroup2 * 10 / 3.5 + 4));

        //*************************************** Exercise 6 ********************************************
        /*
        А теперь решите задание.
        В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры
        соответствуют своей весовой категории, и бой будет честным.
        Вес одного боксера – 78,2 кг
        Вес второго боксера – 82,7 кг
        Подсчитайте и выведите в консоль общий вес двух бойцов.
        Подсчитайте и выведите в консоль разницу между весами бойцов. Для решения этой задачи используйте тип
        переменной var.
        */
        var fighter1_Weight = 78.2;
        var fighter2_Weight = 82.7;
        System.out.println("\nExercise 6: Fighters weight 1");
        System.out.println("Fighters 1 weight:\t\t\t" + fighter1_Weight);
        System.out.println("Fighters 2 weight:\t\t\t" + fighter2_Weight);

        var fightersWeight_Tot = fighter1_Weight + fighter2_Weight;
        System.out.println("Fighters weight total:\t\t" + fightersWeight_Tot);

        var fighterWeight_Dif = Math.abs(fighter1_Weight - fighter2_Weight);
        System.out.println("Fighters weight difference:\t" + fighterWeight_Dif);

        //*************************************** Exercise 7 ********************************************
        /*
        Вычислите разницу весов спортсменов, используя 2 способа:
         - Вычитание из большего веса меньшего
         - Используя функцию остаток от деления
        Для решения этой задачи используйте тип переменной var.
        */
        System.out.println("\nExercise 7: Fighters weight 2");
        fighterWeight_Dif = fighter2_Weight - fighter1_Weight;
        System.out.println("Fighters weight Max - Min:\t" + fighterWeight_Dif);
        fighterWeight_Dif = fighter2_Weight % fighter1_Weight;
        System.out.println("Fighters weight Modulus:\t" + fighterWeight_Dif);

        //*************************************** Exercise 8 ********************************************
        /*
        Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        1). 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов, то сколько
        всего работников в компании?
        Выведите результат задачи в консоль в формате "Всего работников в компании – … человек".
        2). Посчитайте сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94
        человека больше. Выведите результат задачи в консоль в формате "Если в компании работает … человек, то
        всего … часов работы может быть поделено между сотрудниками".
        Для решения этой задачи используйте тип переменной var.
        */
        var totalHours = 640;
        var workTime = 8;

        var numOfEmployees = totalHours / workTime;
        System.out.println("\nExercise 8: Number of employees");
        System.out.println("Number of employees:\t" + numOfEmployees);
        numOfEmployees += 94;
        totalHours = workTime * numOfEmployees;
        System.out.println("If " + numOfEmployees + " employees work in a company, then " + totalHours +
                " hours could be shared between employees");
    }
}