package com.inheritance;

public class UIControl {
    protected boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        System.out.println("UIControl");
        this.isEnabled = isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
