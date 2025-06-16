import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fizz buzz:");

        int n = sc.nextInt();

        if (n % 3 == 0 || n % 5 == 0) {
            String fizzBuzz = "";
            if (n % 3 == 0)
                fizzBuzz += "Fizz";
            if (n % 5 == 0)
                fizzBuzz += "Buzz";
            System.out.println(fizzBuzz);
        }
        else
            System.out.println(n);
    }
}
