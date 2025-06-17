import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        int principal = (int)readNumber("Principal (years)", 1000, 1_000_000);
        float annualInterestRate = (float) readNumber("Annual interest rate", 1, 30);
        byte years = (byte) readNumber("Period (years)", 1, 31);

        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("Mortgage: " + result);
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
            byte years) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        double monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;
        short months = (short) (years * MONTHS_IN_YEAR);
        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        return principal * (((monthlyInterestRate) * pow) / (pow - 1));
    }
}
