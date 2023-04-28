package com.skypro.course1.hw4_conditional_statements1;

public class Main {
    public static void main(String[] args) {

        ////////////////////////////// Exercise 1.1 //////////////////////////////
        /*
        С помощью условного оператора напишите программу, которая выводит в консоль:
            - поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
            - информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        */
        int age = 16;
        System.out.println("Exercise 1.1");
        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием!");
        }
        if (age < 18) {
            System.out.println("Подожди немного! Совершенолетие еще не наступило.");
        }

        ////////////////////////////// Exercise 1.2 //////////////////////////////
        /*
        Напишите программу, которая выводит в консоль сообщение о том, что:
        ребенок ходит в школу, если его возраст равен или больше 7 годам
        человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        */
        System.out.println("\nExercise 1.2");
        age = 16;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Можно учиться в университете");
        }
        if (age >= 24) {
            System.out.println("Пора работать");
        }

        ////////////////////////////// Exercise 1.3 - initial //////////////////////////////
        /*
        Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест, все
        остальные – стоячие. Напишите программу, которая выводит в консоль сообщение о том, есть ли место в вагоне:
        сидячее или стоячее или вагон уже полностью забит.
        */
        int numPeople = 200;
        int coachCapacity = 102;
        int availableSeats = 60;
        System.out.println("\nExercise 1.3 - initial");

        if (coachCapacity % numPeople == coachCapacity) {
            System.out.println("В вагоне нет свободных мест");
        }

        if (coachCapacity % numPeople != coachCapacity && availableSeats % numPeople != availableSeats) {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            System.out.println("сидячих " + availableSeats % numPeople + ", стоячих " + (coachCapacity - availableSeats));
        }
        if (coachCapacity % numPeople != coachCapacity && availableSeats % numPeople == availableSeats) {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            System.out.println("сидячих 0, стоячих " + coachCapacity % numPeople);
        }

        ////////////////////////////// Exercise 1.3 - rebuild//////////////////////////////
        int Seats = 100;
        int standingSeats = 100;

        coachCapacity = 102;
        availableSeats = 60;
        int availableStandingSeats = coachCapacity - availableSeats;

        System.out.println("\nExercise 1.3 - rebuild");
        if (availableSeats <= Seats) {
            System.out.println("В вагоне нет свободных сидячих мест");
        }
        if (availableSeats > Seats) {
            System.out.println("В вагоне " + (availableSeats - Seats) + " свободных сидячих мест:");
        }
        if (availableStandingSeats <= standingSeats) {
            System.out.println("В вагоне нет свободных стоячих мест");
        }
        if (availableStandingSeats > standingSeats) {
            System.out.println("В вагоне " + (availableStandingSeats - standingSeats) + " свободных стоячих мест:");
        }

        ////////////////////////////// Exercise 2.1 //////////////////////////////
        /*
        С помощью условного оператора и конструкции else перепишите программу, которая выводит в консоль:
            - поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
            - информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        */
        age = 25;
        System.out.println("\nExercise 2.1");
        if (age >= 18) {
            System.out.println("Поздравляю с совершенолетием!");
        } else {
            System.out.println("Подожди немного! Совершенолетие еще не наступило.");
        }

        ////////////////////////////// Exercise 2.2 //////////////////////////////
        /*
        С помощью условного оператора и конструкции else перепишите программу, которая выводит в консоль сообщение
        о том, что:
            - ребенок ходит в школу, если его возраст равен или больше 7 годам
            - человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
            - человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        */
        age = 4;
        System.out.println("\nExercise 2.2");
        if (age >= 24) {
            System.out.println("Пора работать");
        } else if (age >= 18) {
            System.out.println("Можно учиться в университете");
        } else if (age >= 7) {
            System.out.println("Ребенок ходит в школу");
        }


        ////////////////////////////// Exercise 2.3 - initial //////////////////////////////
        /*
        Вместимость одного вагона поезда составляет 102 человека. Вагон рассчитан на 60 сидячих мест,
        все остальные – стоячие. С помощью условного оператора и конструкции else перепишите программу, которая выводит
        в консоль сообщение о том, есть ли место в вагоне: сидячее или стоячее или вагон уже полностью забит.
        */
        numPeople = 54;
        coachCapacity = 102;
        availableSeats = 60;
        System.out.println("\nExercise 2.3 - initial");
        if (coachCapacity % numPeople == coachCapacity) System.out.println("В вагоне нет свободных мест");
        else {
            System.out.println("В вагоне " + coachCapacity % numPeople + " свободных мест:");
            if (availableSeats % numPeople != availableSeats) {
                System.out.println("сидячих " + availableSeats % numPeople + ", стоячих " + (coachCapacity - availableSeats));
            } else {
                System.out.println("сидячих 0, стоячих " + coachCapacity % numPeople);
            }
        }
        ////////////////////////////// Exercise 2.3 - rebuild //////////////////////////////
        Seats = 25;
        standingSeats = 25;

        coachCapacity = 102;
        availableSeats = 60;
        availableStandingSeats = coachCapacity - availableSeats;

        System.out.println("\nExercise 2.3 - rebuild");
        if (availableSeats <= Seats) {
            System.out.println("В вагоне нет свободных сидячих мест");
        } else {
            System.out.println("В вагоне " + (availableSeats - Seats) + " свободных сидячих мест:");
        }
        if (availableStandingSeats <= standingSeats) {
            System.out.println("В вагоне нет свободных стоячих мест");
        } else {
            System.out.println("В вагоне " + (availableStandingSeats - standingSeats) + " свободных стоячих мест:");
        }

        ////////////////////////////// Exercise 3.1 //////////////////////////////
        /*
        Напишите программу, которая помогает определить в какое учреждение нужно отправить человека в зависимости
        от его возраста:
            - Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад;
            - Если человек от 7 до 18 лет, то ему нужно ходить в школу;
            - Если человеку больше 18 лет, но меньше 24, то его место в университете;
            - А если человеку больше 24, то ему пора ходить на работу
        При выполнении каждого условия программа должна выводить в консоль сообщение в формате :
        "Если возраст человека равен … , то ему нужно ходить … (в зависимости от возраста дописать нужное)"
        */
        age = 25;
        boolean kindergartenAge = age >= 2 && age <= 6;
        boolean schoolAge = age >= 7 && age <= 18;
        boolean universityAge = age > 18 && age <= 24;
        boolean workingAge = age > 24;
        System.out.println("\nExercise 3.1");
        if (kindergartenAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (schoolAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (universityAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (workingAge) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        ////////////////////////////// Exercise 3.2 //////////////////////////////
        /*
        Как правило, на аттракционах действуют ограничения и для детей по возрасту:
            - Если ребенку меньше 5 лет, то он не может кататься на аттракционе.
            - Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого.
              Если взрослого нет, то кататься нельзя.
            - Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого.
        Напишите программу, которая выводит в консоль сообщение о том, можно ли ребенку кататься одному или в
        сопровождении взрослого в зависимости от того, сколько ему лет.
        */
        age = 18;
        boolean prohibited = age < 5;
        boolean allowedWithAdult = age >= 5 && age < 14;
        boolean allowed = age >= 14;
        System.out.println("\nExercise 3.2");
        if (prohibited) {
            System.out.println("Для возраста " + age + ", запрещено кататься на аттракционе");
        }
        if (allowedWithAdult) {
            System.out.println("Для возраста " + age + ", разрешено кататься на аттракционе в сопровождении взрослого");
        }
        if (allowed) {
            System.out.println("Для возраста " + age + ", разрешено кататься на аттракционе без ограничений");
        }

        ////////////////////////////// Exercise 3.3 //////////////////////////////
        /*
        Даны три числа:
            - int one;
            - int two;
            - int free;
        С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех чисел
        бОльшее и выводит результат в консоль.
        */
        int one = 6;
        int two = 5;
        int three = 4;
        System.out.println("\nExercise 3.3");
        if (one > two) {
            if (one > three) {
                System.out.println("Число номер 1 (" + one + ") больше остальных");
            } else if (one == three) {
                System.out.println("Числа номер 1 и 3 (" + one + ") больше остальных");
            } else {
                System.out.println("Число номер 3 (" + three + ") больше остальных");
            }
        } else if (two > three) {
            if (two > one) {
                System.out.println("Число номер 2 (" + two + ") больше остальных");
            } else if (two == one) {
                System.out.println("Числа номер 1 и 2 (" + one + ") больше остальных");
            } else {
                System.out.println("Число номер 1 (" + three + ") больше остальных");
            }
        } else if (three > one) {
            if (three > two) {
                System.out.println("Число номер 3 (" + three + ") больше остальных");
            } else if (three == two) {
                System.out.println("Числа номер 2 и 3 (" + three + ") больше остальных");
            } else {
                System.out.println("Число номер 2 (" + three + ") больше остальных");
            }
        } else {
            System.out.println("Все числа равных");
        }
    }
}