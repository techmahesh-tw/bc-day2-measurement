package com.tw.bootcamp;

public class Meter {

    private final int value;

    public Meter(int value) {
        this.value = value;
    }

    public Meter(float value) {
        this.value = Integer.parseInt(String.valueOf(value * 100));
    }

    public boolean equalsCM(Centimeter obj) {
        return value == (obj.getValue() / 100);
    }

}
