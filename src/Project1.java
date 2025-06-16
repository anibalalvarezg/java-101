import java.text.NumberFormat;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        Scanner sc = new Scanner(System.in);
        int principal;
        while (true) {
            System.out.println("Principal: ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a value between 1000 and 1_000_000: ");
        }

        double annualInterestRate;
        while (true) {
            System.out.println("Annual Interest Rate: ");
            annualInterestRate = sc.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
                break;
            }
            System.out.println("Enter a value between 1 and 30: ");
        }
        double monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;

        int years;
        while (true) {
            System.out.println("Period (years)");
            years = sc.nextByte();
            if (years >= 1 && years < 31) {
                break;
            }
            System.out.println("Enter a value between 1 and 30 ");
        }
        int months = years * MONTHS_IN_YEAR;

        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        double mortgage = principal * (((monthlyInterestRate) * pow) / (pow - 1));

        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
