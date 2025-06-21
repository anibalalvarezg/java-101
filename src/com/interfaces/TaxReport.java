package com.interfaces;

public class TaxReport {
    private TaxCalculatorTest calculator;

    public TaxReport() {
        calculator = new TaxCalculatorTest(10_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
