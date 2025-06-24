package com.generics;

public class GenericList<T extends Comparable & Cloneable>{
    private T[] items = (T[]) new Object[10];
    private int size = 0;

    public void add(T item) {
        items[size++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
