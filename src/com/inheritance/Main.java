package com.inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textbox = new TextBox();
        show(control);

        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.equals(point1));

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());

    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
            System.out.println(control);
        }
    }
}
