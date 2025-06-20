package com.inheritance;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textbox = new TextBox();
        show(control);
    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
            System.out.println(control);
        }
    }
}
