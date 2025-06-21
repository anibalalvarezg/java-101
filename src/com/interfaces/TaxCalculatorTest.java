package com.interfaces;

public class TaxCalculatorTest implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculatorTest(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
