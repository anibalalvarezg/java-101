package com.inheritance;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox() {
//        super(true);
        System.out.println("TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clearText() {
        this.text = "";
    }

}
