package com.lambdaexpressions;

public class LambdasDemo {
    public static void show() {


        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println("message: " + message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
