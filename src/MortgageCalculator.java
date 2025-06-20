public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal", 1000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual interest rate", 1, 30);
        byte years = (byte) Console.readNumber("Period (years)", 1, 31);
        MortgageReport.printMortgage(principal, annualInterestRate, years);
        MortgageReport.printPaymentSchedule(years, principal, annualInterestRate);
    }

    public static double calculateMortgage(
            int principal,
            float annualInterestRate,
            byte years
    ) {
        double monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;
        short months = (short) (years * MONTHS_IN_YEAR);
        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        return (double) principal * (((monthlyInterestRate) * pow) / (pow - 1));
    }

    public static double calculateBalance(
            int principal,
            float annualInterestRate,
            byte years,
            short numberOfPaymentsMade
    ) {
        double monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;
        short months = (short) (years * MONTHS_IN_YEAR);
        return (double) principal
                * (Math.pow(1 + (monthlyInterestRate), (months)) - Math.pow(1 + (monthlyInterestRate), (numberOfPaymentsMade)))
                / (Math.pow(1 + (monthlyInterestRate), (months)) - 1);
    }
}
