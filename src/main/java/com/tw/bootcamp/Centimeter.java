package com.tw.bootcamp;

public class Centimeter {

    private final int value;

    public Centimeter(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter unit = (Centimeter) o;
        return value == unit.value;
    }

    public int getValue() {
        return value;
    }

}
