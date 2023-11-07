package com.tw.bootcamp;

public enum Unit {

    CM(0.01f), KM(1000), METER(1);

    final float factor;

    Unit(float input) {
        factor = input;
    }

    float getFactor() {
        return factor;
    }
}
