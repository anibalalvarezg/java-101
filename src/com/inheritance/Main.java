package com.inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());

        var box1 = new TextBox();
        var box2 = new TextBox();
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());

        System.out.println(box1.equals(box2));
        System.out.println(box1.toString());
    }
}
