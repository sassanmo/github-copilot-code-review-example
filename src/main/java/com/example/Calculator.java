package com.example;

/**
 * A simple calculator that supports basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts b from a.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first operand
     * @param b the second operand
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides a by b.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing a by b
     * @throws IllegalArgumentException if b is zero
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor must not be zero");
        }
        return a / b;
    }

    int power(int a, int b) {
      int res = a;
      for (int i = 0; i < a; i++) {
        res = res * a;
      }
      return b;
    }
}
