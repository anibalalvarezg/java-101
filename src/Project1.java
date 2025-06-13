import java.text.NumberFormat;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = sc.nextInt();

        System.out.println("Annual Interest Rate: ");
        double annualInterestRate = sc.nextDouble();
        double monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_YEAR;

        System.out.println("Period (years)");
        byte years = sc.nextByte();
        int months = years * MONTHS_IN_YEAR;

        double pow = Math.pow(1 + (monthlyInterestRate), (months));
        double mortgage = principal * (((monthlyInterestRate) * pow) / (pow - 1));

        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
