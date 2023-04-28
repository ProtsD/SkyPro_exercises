package com.skypro.course1.hw7_loops2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////// Exercise 1.1 /////////////////////////////////////////
        /*
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей" с тем
        количеством месяцев, необходимым для накопления данной суммы.
         */
        int savingsPerMonth = 15000;
        int savingsTotal = 0;
        int monthsToTarget = 0;
        int savingsTarget = 2_459_000;
        double interestRatePerYear = 12;

        System.out.println("Exercise 1.1");
        while (savingsTarget > savingsTotal) {
            savingsTotal += savingsPerMonth + savingsTotal * interestRatePerYear / 100 / 12;
            System.out.println("Месяц " + monthsToTarget + ", сумма накоплений равна " + savingsTotal + " рублей");
            monthsToTarget++;
        }
        ///////////////////////////////////////// Exercise 1.2 /////////////////////////////////////////
        /*
        Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
         */
        int i = 0;
        System.out.println("\nExercise 1.2");

        System.out.print("\nWhile: ");
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }

        System.out.print("\nFor:   ");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
        ///////////////////////////////////////// Exercise 1.3 /////////////////////////////////////////
        /*
        В стране Y население равно 12 миллионам человек.
        За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек. Рассчитайте, какая численность
        населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
         */
        int countryPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int populationBase = 1000;
        int studyPeriodInYears = 10;
        int years = 1;

        System.out.println("\nExercise 1.3");
        while (years < studyPeriodInYears) {
            countryPopulation += countryPopulation / populationBase * (birthRate - deathRate);
            System.out.println("Год " + years + ", численность населения составляет " + countryPopulation);
            years++;
        }
        ///////////////////////////////////////// Exercise 2.1 /////////////////////////////////////////
        /*
        Условие
        Напишите программу, которая выводит в консоль сумму накоплений.
        Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        Первоначальная сумма вклада Василия составляет 15 тысяч рублей.

        Задание 1
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов
        рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль результат
        программы с указанием суммы накоплений по каждому месяцу.
         */
        savingsPerMonth = 15000;
        savingsTotal = 0;
        monthsToTarget = 0;
        savingsTarget = 12_000_000;
        interestRatePerYear = 7;

        System.out.println("Exercise 2.1");
        while (savingsTarget > savingsTotal) {
            savingsTotal += savingsPerMonth + savingsTotal * interestRatePerYear / 100 / 12;
            System.out.println("Месяц " + monthsToTarget + ", сумма накоплений равна " + savingsTotal + " рублей");
            monthsToTarget++;
        }
        ///////////////////////////////////////// Exercise 2.2 /////////////////////////////////////////
        /*
        Задание 2
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
        Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
         */
        savingsPerMonth = 15000;
        savingsTotal = 0;
        monthsToTarget = 0;
        savingsTarget = 12_000_000;
        interestRatePerYear = 7;

        System.out.println("\nExercise 2.2");
        while (savingsTarget > savingsTotal) {
            savingsTotal += savingsPerMonth + savingsTotal * interestRatePerYear / 100 / 12;
            if (monthsToTarget % 6 == 0) {
                System.out.println("Месяц " + monthsToTarget + ", сумма накоплений равна " + savingsTotal + " рублей");
            }
            monthsToTarget++;
        }
        ///////////////////////////////////////// Exercise 2.3 /////////////////////////////////////////
        /*
        Задание 3
        Василий решил копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода
        на протяжении этих 9 лет. Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода
        в течение 9 лет.
         */
        savingsPerMonth = 15000;
        savingsTotal = 0;
        monthsToTarget = 0;
        int yearTarget = 9;
        interestRatePerYear = 7;

        System.out.println("\nExercise 2.3");
        while (yearTarget * 12 >= monthsToTarget) {
            savingsTotal += savingsPerMonth + savingsTotal * interestRatePerYear / 100 / 12;
            if (monthsToTarget % 6 == 0) {
                System.out.println("Месяц " + monthsToTarget + ", сумма накоплений равна " + savingsTotal + " рублей");
            }
            monthsToTarget++;
        }
        ///////////////////////////////////////// Exercise 2.4 /////////////////////////////////////////
        /*
        Задание 4
        В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит
        сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
         */
        int firstFridayInMonth = 3;
        int daysInMonth = 31;
        System.out.println("\nExercise 2.4");
        for (; firstFridayInMonth <= daysInMonth; firstFridayInMonth += 7) {
            System.out.println("Сегодня пятница, " + firstFridayInMonth + "-е число. Необходимо подготовить отчет.");
        }
        ///////////////////////////////////////// Exercise 3.1 /////////////////////////////////////////
        /*
        Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно
        будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей
        каждый 79-й год, начиная с нулевого. Нам нужно узнать, в каких годах комета пролетала рядом с Землей за
        последние 200 лет и когда мы увидим ее в следующий раз.

        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее
        появления.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
         */
//        int currentYear = 2022;
        int currentYear = LocalDate.now().getYear();
        int startYearOfPeriod = 200;
        int endYearOfPeriod = 100;
        int firstYearSeenComet = 100;
        int cometPeriodYear = 79;
        System.out.println("\nExercise 3.1");
        do {
            firstYearSeenComet += cometPeriodYear;
            if (firstYearSeenComet >= currentYear - startYearOfPeriod && firstYearSeenComet < currentYear) {
                System.out.println("в этот год " + firstYearSeenComet + " была замечена комета");
            } else if (firstYearSeenComet >= currentYear) {
                System.out.println("В следующий раз комета прометит в " + firstYearSeenComet + " году");
            }
        } while (firstYearSeenComet < currentYear);

        ///////////////////////////////////////// Exercise 3.2 /////////////////////////////////////////
        /*
        Напишите программу, которая выводит в консоль таблицу умножения на 2:
        2*1=2
        2*2=4
        2*3=6
        2*4=8
        2*5=10
        2*6=12
        2*7=14
        2*8=16
        2*9=18
        2*10=20
         */
        int number = 2;
        int result = 0;

        System.out.println("\nExercise 3.2");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            result = number * multiplier;
            System.out.println(number + " * " + multiplier + " = " + result);
        }

        ///////////////////////////////////////// Extra exercise 5 /////////////////////////////////////////
        /*
        Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам, чтобы вы
        оценили свои силы. Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без
        остатка, вывести ping, а если число делится на 5 без остатка, вывести pong.
        Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        Допускается наличие пустых строк в выводе.
         */
        int divider1 = 3;
        int divider2 = 5;
        int startNumberOfRange = 1;
        int range = 30;

        System.out.println("\nExtra exercise 5");
        for (int j = startNumberOfRange; j < (startNumberOfRange + range); j++) {
            if (j % divider1 == 0 && j % divider2 != 0) {
                System.out.println(j + ": ping");
            } else if (j % divider1 != 0 && j % divider2 == 0) {
                System.out.println(j + ": pong");
            } else if (j % divider1 == 0 && j % divider2 == 0) {
                System.out.println(j + ": ping pong");
            } else {
                System.out.println(j + ":");
            }
        }
        ///////////////////////////////////////// Extra exercise 6 /////////////////////////////////////////
        /*
        Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        – Каждое следующее число равняется сумме двух предыдущих.
        Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        Должно получиться следующее:
        0 1 1 2 3 5 8 13 21 34
         */

        int FiboNumber1 = 0;
        int FiboNumber2 = 1;
        int numberCount = 10;
        System.out.println("\nExtra exercise 6");
        System.out.print(FiboNumber1 + " " + FiboNumber2 + " ");
        for (int j = 0; j < numberCount - 2; j++) {
            int tmpInt = FiboNumber1 + FiboNumber2;
            FiboNumber1 = FiboNumber2;
            FiboNumber2 = tmpInt;
            System.out.print(FiboNumber2 + " ");
        }
    }
}