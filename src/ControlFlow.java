import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // Comparison operators
        int x = 1;
        int y = 1;

        System.out.println(x != y);

        // Logical operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;

        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isElegible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        // If statements
        int temperatureIN = 22;

        if (temperatureIN > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temperatureIN > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int income= 120_000;
        boolean hasHighIncome_ = (income > 100_000);
        System.out.println(hasHighIncome_);

        // Ternary operator
        int incomeM = 120_000;
        String className = (incomeM > 100_000) ? "First" : "Economy";
        System.out.println(className);

        // Switch Statements
        String role = "admin";
        if (role == "admin")
            System.out.println("You are an administrator");
        else if (role == "moderator")
            System.out.println("You are moderator");
        else
            System.out.println("You are a guest");

        switch (role) {
            case "admin":
                System.out.println("You are an administrator");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            case "guest":
            default:
                System.out.println("You are guest");
        }

        // For loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World" + i
            );
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("Hello World" + i);
        }

        // While Loops
        int j = 0;
        while (j < 5) {
            System.out.println("Hello World" + j);
            j++;
        }

        String input = "";
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your name:");
            input = sc.nextLine().toLowerCase();

            if (input.equals("pass")) {
                continue;
            }

            if (input.equals("quit") || input.equals("exit")) {
                break;
            }
            System.out.println("Hello " + input);

        } while (true);

        // For-each loop
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]    );
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
