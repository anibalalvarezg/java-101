package com.generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T a, T b) {
        return a.compareTo(b) < 0 ? b : a;
    }

    public static <K,V> void print(K key, V value) {
        System.out.println(key + ": " + value);
    }

    public static void printUser(User user) {
        System.out.println(user.toString());
    }

    // Class CAP#1 extends User {}
    // class Intructor extends User {}
    public static void printUsers(
            GenericList<? super User> users) {
        GenericList<Object> temp = new GenericList<>();
        users.add(new Instructor(1));
        Object x = users.get(0);
    }
}
