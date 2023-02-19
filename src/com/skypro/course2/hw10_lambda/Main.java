package com.skypro.course2.hw10_lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //////////////////////////////////// Exercise 1 ////////////////////////////////////
        System.out.println("Exercise 1: anonymous class");
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i > 0;
            }
        };
        System.out.println(predicate1.test(-1));
        System.out.println(predicate1.test(1));

        System.out.println("\nExercise 1: lambda");
        Predicate<Integer> predicate2 = i -> i > 0;
        System.out.println(predicate2.test(-1));
        System.out.println(predicate2.test(1));

        //////////////////////////////////// Exercise 2 ////////////////////////////////////
        System.out.println("\nExercise 2: anonymous class");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println("Hello " + name);
            }
        };
        consumer1.accept("Denis");

        System.out.println("\nExercise 2: lambda");
        Consumer<String> consumer2 = name -> System.out.println("Hello " + name);
        consumer2.accept("Den");

        //////////////////////////////////// Exercise 3 ////////////////////////////////////
        System.out.println("\nExercise 3: anonymous class");
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return (long) aDouble.intValue();
            }
        };
        System.out.println(function1.apply(5.7));

        System.out.println("\nExercise 3: lambda");
        Function<Double, Long> function2 = Math::round;
        System.out.println(function2.apply(5.7));

        //////////////////////////////////// Exercise 4 ////////////////////////////////////
        System.out.println("\nExercise 4: anonymous class");
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };
        System.out.println(supplier1.get());

        System.out.println("\nExercise 4: lambda");
        Supplier<Integer> supplier2 = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(supplier2.get());

        //////////////////////////////////// Exercise 5 ////////////////////////////////////
        System.out.println("\nExercise 5:");
        String str = "Hello world!";
        System.out.println(str);

        String str1 = "Hello";

        Predicate<String> condition = name -> (name.contains("Hello1"));
        Function<String, String> func1 = name -> name.replace("Hello", "Hi");
        Function<String, String> func2 = name -> name.replace("Hello", "Hey");

        System.out.println(checkThenSubstitute(condition, func1).apply(str));
        System.out.println(ternaryOperator(condition, func1, func2).apply(str));


    }

    private static Function<String, String> checkThenSubstitute(Predicate<String> condition, Function<String, String> function) {
        return str -> condition.test(str) ? function.apply(str) : str;
    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return str -> condition.test(str) ? ifTrue.apply(str) : ifFalse.apply(str);
    }

}
