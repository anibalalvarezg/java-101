package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Map<String, Customer> map = new HashMap<>();
        var c1 = new Customer("Alvarez", "<EMAIL>");
        var c2 = new Customer("Garcia", "<EMAIL>");
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        var unknown = new Customer("Unknown", "<EMAIL>");

        var exists = map.containsKey(c1.getEmail());

        System.out.println(exists);
        map.replace(c1.getEmail(), new Customer("Alvarez2", "<EMAIL>"));
        System.out.println(map);

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

}
