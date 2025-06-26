package com.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Collection<String> collections = new ArrayList<>();
        Collections.addAll(collections, "a", "b", "c", "c");
        System.out.println(collections);

        Set<String> set = new HashSet<>(collections);
        System.out.println(set);

        Set<String> set2 = new HashSet<>(Arrays.asList("a", "b", "c"));
        System.out.println(set2);

        Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set4 = new HashSet<>(Arrays.asList("d", "e", "c"));

        System.out.println(set3.removeAll(set4));

    }
}
