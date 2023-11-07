package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MeterTest {

    @Test
    void shouldVerify1CmEquals1Cm() {
        Centimeter oneCM = new Centimeter(1);
        Centimeter anotherCM = new Centimeter(1);

        assertTrue(oneCM.equals(anotherCM));
    }

    @Test
    void shouldVerify1CmNotEquals2Cm() {
        Centimeter oneCM = new Centimeter(1);
        Centimeter twoCM = new Centimeter(2);

        assertFalse(oneCM.equals(twoCM));
    }

    @Test
    void shouldVerify1MeterEquals100CM() {
        Meter meter = new Meter(1);
        Centimeter cm = new Centimeter(100);

        assertTrue(meter.equalsCM(cm));
    }

    @Test
    void shouldVerify100CMEqualsPoint001KM() {
        Meter kilometer = new Meter(0.001f);
        Centimeter cm = new Centimeter(100);

        assertTrue(kilometer.equalsCM(cm));
    }
}
