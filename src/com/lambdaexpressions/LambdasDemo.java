package com.lambdaexpressions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
    public LambdasDemo(String message) {

    }
    public static void show() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        list.forEach(print.andThen(printUpperCase).andThen(print));

        Supplier<Double> getRandom = () -> Math.random();
        System.out.println(getRandom.get());

        Function<String, Integer> map = str -> str.length();
        System.out.println(map.apply("Hello World!"));
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
