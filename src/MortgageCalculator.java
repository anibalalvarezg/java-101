import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;
    public static void main(String[] args) {
        int principal = (int)readNumber("Principal", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual interest rate", 1, 30);
        byte years = (byte) readNumber("Period (years)", 1, 31);
        printMortgage(principal, annualInterestRate, years);
        printPaymentSchedule(years, principal, annualInterestRate);
    }

    private static void printMortgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Mortgage Payments: " + result);
    }

    private static void printPaymentSchedule(byte years, int principal, float annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = sc.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max + ": ");
        }
        return value;
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
