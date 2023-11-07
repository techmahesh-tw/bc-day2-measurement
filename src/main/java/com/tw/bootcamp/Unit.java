package com.tw.bootcamp;

public class Unit {
    private final int value;

    public Unit(int value) {
        this.value = value;
    }

    public Unit getCm(int input) {
        return new Unit(input);
    }

    public Unit getMeter(int input) {
        return new Unit(input);
    }

    public Unit getKM(int input) {
        return new Unit(input);
    }

}
