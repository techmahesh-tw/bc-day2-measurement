package com.tw.bootcamp;

public class Measurement {

    private final int value;

    public Measurement(int value) {
        this.value = value;
    }


    public boolean verify(int input) {
        return value == input;
    }

}
