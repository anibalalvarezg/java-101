public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENTAGE = 100;

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal", 1000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual interest rate", 1, 30);
        byte years = (byte) Console.readNumber("Period (years)", 1, 31);

        var calculator = new Calculator(principal, annualInterestRate, years);
        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
