package com.collections;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Customer other) {
        return getName().compareTo(other.getName());
    }
}
