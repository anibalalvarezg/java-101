package com.interfaces;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculatorTest(10000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculatorTwo());
        report.show();
    }
}
