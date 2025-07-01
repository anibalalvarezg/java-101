package com.lambdaexpressions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
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

        // "key:value"
        // first: "key=value"
        // second: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addCurlyBrackets = str -> "{" + replaceColon.apply(str) + "}";
        var result = replaceColon
                .andThen(addCurlyBrackets)
                .apply("key:value");

        var result2 = addCurlyBrackets.compose(replaceColon).apply("key:value");

        System.out.println(result);
        System.out.println(result2);

        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var resul3 = isLongerThan5.test("sky");
        System.out.println(resul3);

        Predicate<String> hasLeftBrace = str -> str.contains("{");
        Predicate<String> hasRightBrace = str -> str.contains("}");
        Predicate<String> hasLeftAndRightBraces = hasRightBrace.and(hasLeftBrace);
        System.out.println(hasLeftAndRightBraces.test("{test}"));

        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
