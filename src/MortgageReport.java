import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currencyInstance;
    private Calculator calculator;

    public MortgageReport(Calculator calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String result = currencyInstance.format(mortgage);
        System.out.println("MORTGAGE");
        System.out.println("-------------");
        System.out.println("Mortgage Payments: " + result);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance: calculator.getRemainingBalances())
            System.out.println(currencyInstance.format(balance));
    }
}