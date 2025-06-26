package com.collections;

import com.generics.GenericList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ListDemo.show();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John"));
        customers.add(new Customer("Jane"));
        customers.add(new Customer("Jill"));

        Collections.sort(customers);

        System.out.println(customers);
    }
}
