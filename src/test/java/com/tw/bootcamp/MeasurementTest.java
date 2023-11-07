package com.tw.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MeasurementTest {

    @Test
    void shouldVerify1CmEquals1Cm() {
        Measurement obj = new Measurement(1);

        Assertions.assertTrue(obj.verify(1));
    }

    @Test
    void shouldVerify1CmNotEquals2Cm() {
        Measurement obj = new Measurement(1);

        Assertions.assertFalse(obj.verify(2));
    }
}
