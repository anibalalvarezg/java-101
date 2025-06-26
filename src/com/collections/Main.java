package com.collections;

import com.generics.GenericList;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
