package com.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try (
            var reader = new FileReader("text.txt");
        ) {
            var value = reader.read();
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ParseException e) {
            System.out.println("I/O exception");
        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
