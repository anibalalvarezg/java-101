package com.exceptions;

// Checked => Exception
// Unchecked (runtime) => RuntimeException

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException() {
        System.out.println("InsufficientFundsException");
    }
}
