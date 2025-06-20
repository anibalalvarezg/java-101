public class Calculator {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENTAGE = 100;

    private int principal;
    private float annualInterestRate;
    private int years;

    public Calculator(int principal, float annualInterestRate, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.years = years;
    }

    public double calculateMortgage() {
        double monthlyInterestRate = getMonthlyInterestRate();
        short months = getMonths();
        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        return (double) principal * (((monthlyInterestRate) * pow) / (pow - 1));
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        double monthlyInterestRate = getMonthlyInterestRate();
        short months = getMonths();
        return (double) principal
                * (Math.pow(1 + (monthlyInterestRate), (months)) - Math.pow(1 + (monthlyInterestRate), (numberOfPaymentsMade)))
                / (Math.pow(1 + (monthlyInterestRate), (months)) - 1);
    }

    private short getMonths() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterestRate() {
        return annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;
    }

    public int getYears() {
        return years;
    }
}