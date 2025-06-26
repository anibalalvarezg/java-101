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
        customers.add(new Customer("John", "a1"));
        customers.add(new Customer("Jane", "a2"));
        customers.add(new Customer("Jill", "a3"));

        Collections.sort(customers, new EmailComparator());

        System.out.println(customers);

        QueueDemo.show();
    }
}
