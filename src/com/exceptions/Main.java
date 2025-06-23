package com.exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getCause());
        }
    }
}
