package com.classes;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        var employeeTwo = new Employee(50_000);
        Employee.printNumberOfEmployees();

        int wage = employee.calculateWage();
        System.out.println("Wage: " + wage);

        var browser = new Browser();
        browser.navigate("https://www.google.com");
    }
}
