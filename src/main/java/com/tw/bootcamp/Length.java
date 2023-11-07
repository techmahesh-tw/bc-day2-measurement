package com.tw.bootcamp;

public class Length {

    private final float value;

    private final Unit unit;

    public Length(float value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length length) {
        return this.unit.factor * this.value == length.unit.factor * length.value;
    }

    public Length add(Length length2) {
        float result = (length2.unit.getFactor() * length2.value) + this.value;
//        if (this.unit == Unit.CM)
//            result = result * 100;
        return new Length(result, this.unit);
    }

    public float getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }
}
