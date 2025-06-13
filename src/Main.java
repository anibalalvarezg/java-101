import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Variables
        int age = 30;
        age = age + 1;
        System.out.println(age);

        // Primitive types
        byte ageByte = 30;
        long viewsCount = 3_123_456_789L;

        System.out.println(viewsCount);

        double price = 10.99;
        float priceFloat = 10.99f;
        char letter = 'A';
        boolean isElegible = true;

        // References types
        Date today = new Date();
        System.out.println(today);

        byte x = 1;
        byte y = 2;
        x = 3;

        System.out.println(y);

        Point point = new Point(1,1);
        Point point2 = point;

        point.x = 2;
        System.out.println(point2);

        // String
        String message = "Hello, World!" + "!!";
        System.out.println(message.endsWith("!!"));
        int length = message.length();
        System.out.println(length);

        System.out.println(message.indexOf("H"));
        System.out.println(message.replace('H', 'h'));
        System.out.println(message.toLowerCase());

        String message2 = "   Hello, World!   ";
        System.out.println(message2.trim());

        // Scape Secuences
        String message3 = "Hello, \"World\"!";
        System.out.println(message3.trim());

        String message4 = "Hello, \n\"Wor\tld\"!";
        System.out.println(message4.trim());

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println(numbers[0]);
        System.out.println(Arrays.toString(numbers));

        // Multi dimensional arrays
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        int[][] matrix2 = {{1,2}, {3,4}};

        System.out.println(Arrays.deepToString(matrix2));

        // Constants
        final float pi = 3.14f;
        System.out.println(pi);
        // pi = 4f;

        // Arithmetic Expressions
        int result = 10 + 3;
        System.out.println(result);

        double resultDouble = (double) result;
        System.out.println(resultDouble);

        int z = 1;
        int q = z++;

        q = q + 2;
        q += 1;
        q -= 1;
        q /= 1;
        System.out.println(q);
        System.out.println(z);

        // Order of operations () */ +-
        int u = 10 + 3 * 2;

        // Casting
        // Implicit casting
        short r = 1;
        int t = r + 1;
        // byte > short > int > long > float > double

        // Explicit casting
        // double i = 1.1;
        // int o = (int) i + 2;
        // System.out.println(o);


        // MATH
        System.out.println(Math.max(10, 98));
        System.out.println(Math.random());
        System.out.println((int) Math.round(Math.random() * 100));

        // Number format
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        String result2 = percentInstance.format(1234567.891);
        System.out.println(result2);

        // Scanner
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        byte ageInput = scanner.nextByte();
//        System.out.println("Your ageInput is " + ageInput);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name: " + name);
    }
}