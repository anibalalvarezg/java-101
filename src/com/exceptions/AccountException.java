package com.exceptions;

public class AccountException extends Exception {
    public AccountException(InsufficientFundsException message) {
        super(message);
    }
}
