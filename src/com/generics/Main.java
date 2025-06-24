package com.generics;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        System.out.println(list.get(0));
    }
}
