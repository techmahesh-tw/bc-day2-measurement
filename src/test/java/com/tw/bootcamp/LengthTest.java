package com.tw.bootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {

    @Test
    void shouldVerify1CmEquals1Cm() {
        Length oneCM = new Length(1, Unit.CM);
        Length anotherCM = new Length(1, Unit.CM);
        assertTrue(oneCM.compare(anotherCM));
    }

    @Test
    void shouldVerify1CmNotEquals2Cm() {
        Length oneCM = new Length(1, Unit.CM);
        Length anotherCM = new Length(2, Unit.CM);
        assertFalse(oneCM.compare(anotherCM));
    }

    @Test
    void shouldVerify1MeterEquals100CM() {
        Length oneMeter = new Length(1, Unit.METER);
        Length cm = new Length(100, Unit.CM);
        assertTrue(oneMeter.compare(cm));
    }

    @Test
    void shouldVerify100CMEqualsPoint001KM() {
        Length cm = new Length(100, Unit.CM);
        Length km = new Length(0.001f, Unit.KM);
        assertTrue(cm.compare(km));

    }

    @Test
    void shouldReturn2MeterFor1MeterAdd100CM() {
        Length oneMeter = new Length(1, Unit.METER);
        Length cm = new Length(100, Unit.CM);
        Length result = oneMeter.add(cm);
        assertEquals(2, result.getValue());
        assertEquals(Unit.METER, result.getUnit());
    }

    @Test
    void shouldReturn300cmFor200cmAdd1Meter() {
        Length oneMeter = new Length(1, Unit.METER);
        Length cm = new Length(200, Unit.CM);
        Length result = cm.add(oneMeter);
        assertEquals(300, result.getValue());
        assertEquals(Unit.CM, result.getUnit());
    }
}
