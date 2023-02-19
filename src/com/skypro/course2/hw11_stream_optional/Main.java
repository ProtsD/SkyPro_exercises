package com.skypro.course2.hw11_stream_optional;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //////////////////////////////////// Exercise 1 ////////////////////////////////////
        Stream<Transport> transportStream = Stream.of(new Transport("car1", 1.1),
                new Transport("car2", 1.2),
                new Transport("car5", 1.5),
                new Transport("car4", 1.4));
        BiConsumer<Transport, Transport> biConsumer = (min, max) -> System.out.println(min.toString() + max.toString());
        Comparator<Transport> transportComparator = Comparator.comparing(Transport::getEngineVolume).thenComparing(Transport::getType);
        findMinMax(transportStream, transportComparator, biConsumer);

        //////////////////////////////////// Exercise 2 ////////////////////////////////////
        findEvenNumbers(List.of(45, 34, 3, 6, 9, 22));

    }

    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            list.sort(order);
            minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
        }

    }

    public static void findEvenNumbers(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        Predicate<Integer> predicate = num -> num % 2 == 0;
        Stream<Integer> evenNumbersStream = stream.filter(predicate);
        System.out.println("Number of even numbers is " + evenNumbersStream.count());
    }

}
