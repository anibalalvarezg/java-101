package com.inheritance;

public class Main {
    public static void main(String[] args) {

        UIControl[] controls = { new TextBox(), new CheckBox() };
        for (var controlInput: controls) {
            controlInput.render();
        }

    }

    public static void show(UIControl control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
            System.out.println(control);
        }
    }
}
