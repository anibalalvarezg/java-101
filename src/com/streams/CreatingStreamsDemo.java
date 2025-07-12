package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        var stream = Stream.generate(() -> Math.random());
        stream
                .limit(3)
                .forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));

        var streamList = Stream.of(List.of(1,2,3), List.of(4,5,6));
        streamList
                .flatMap(list -> list.stream())
                .forEach(System.out::println);
    }
}
