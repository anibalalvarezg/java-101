import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = MortgageCalculator.calculateMortgage(principal, annualInterestRate, years);
        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Mortgage Payments: " + result);
    }

    public static void printPaymentSchedule(byte years, int principal, float annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (short month = 1; month <= years * MortgageCalculator.MONTHS_IN_YEAR; month++) {
            double balance = MortgageCalculator.calculateBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}