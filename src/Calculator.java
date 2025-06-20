public class Calculator {
    private int principal;
    private float annualInterestRate;
    private int years;

    public Calculator(int principal, float annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        double monthlyInterestRate = annualInterestRate / MortgageCalculator.PERCENTAGE / MortgageCalculator.MONTHS_IN_YEAR;
        short months = (short) (years * MortgageCalculator.MONTHS_IN_YEAR);
        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        return (double) principal * (((monthlyInterestRate) * pow) / (pow - 1));
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        double monthlyInterestRate = annualInterestRate / MortgageCalculator.PERCENTAGE / MortgageCalculator.MONTHS_IN_YEAR;
        short months = (short) (years * MortgageCalculator.MONTHS_IN_YEAR);
        return (double) principal
                * (Math.pow(1 + (monthlyInterestRate), (months)) - Math.pow(1 + (monthlyInterestRate), (numberOfPaymentsMade)))
                / (Math.pow(1 + (monthlyInterestRate), (months)) - 1);
    }

    public int getYears() {
        return years;
    }
}