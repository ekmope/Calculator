package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void testAdd() {
        assertEquals(5.0, Calculator.add(2.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(5.0, 0));
    }
}