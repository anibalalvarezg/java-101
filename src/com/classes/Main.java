package com.classes;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println("Wage: " + wage);

        var browser = new Browser();
        browser.navigate("https://www.google.com");
    }
}
