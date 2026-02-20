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
}
