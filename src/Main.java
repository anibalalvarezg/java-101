import java.awt.*;
import java.util.Arrays;
import java.util.Date;

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
        pi = 4f;
    }
}