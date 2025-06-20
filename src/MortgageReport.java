import java.text.NumberFormat;

public class MortgageReport {

    private Calculator calculator;

    public MortgageReport(Calculator calculator) {
        this.calculator = calculator;
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        String result = mortgageFormatted.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Mortgage Payments: " + result);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance: calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
}