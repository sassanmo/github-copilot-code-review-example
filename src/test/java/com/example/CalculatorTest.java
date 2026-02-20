package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add_returnsSumOfTwoPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void add_returnsCorrectResultWithNegativeNumbers() {
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    void subtract_returnsDifference() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void subtract_returnsNegativeWhenBGreaterThanA() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    void multiply_returnsProduct() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void multiply_returnsZeroWhenMultipliedByZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void power_returnsCorrectResultForPositiveExponent() {
        assertEquals(8, calculator.power(2, 3), "2^3 should equal 8");
    }

    @Test
    void power_returnsOneWhenExponentIsZero() {
        assertEquals(1, calculator.power(5, 0), "Any number raised to the power 0 should equal 1");
    }

    @Test
    void power_returnsZeroWhenBaseIsZero() {
        assertEquals(0, calculator.power(0, 3), "0 raised to any positive exponent should equal 0");
    }

    @Test
    void power_throwsIllegalArgumentExceptionForNegativeExponent() {
        assertThrows(IllegalArgumentException.class, () -> calculator.power(2, -1),
                "Negative exponent should throw IllegalArgumentException");
    }

}
