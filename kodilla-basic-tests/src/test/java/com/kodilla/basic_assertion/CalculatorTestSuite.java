package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        int a = 8;
        int b = 5;
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        int a = 8;
        int b = 5;
        Calculator calculator = new Calculator();
        int subtractResult = calculator.subtract(a,b);
        assertEquals(3, subtractResult);
    }
    @Test
    public void testSquare() {
        double a = 2.0;
        double b = 3.0;
        double expected = 8.0;
        double delta = 0.0001;
        double result = Math.pow(a, b);
        assertEquals(expected, result, delta);
    }
    @Test
    public void testSquareMinus() {
        double a = 2.0;
        double b = -3.0;
        double expected = -8.0;
        double delta = 0.0001;
        double result = Math.pow(a, b);
        assertEquals(expected, result, delta);
    }
    @Test
    public void testSquareZero() {
        double a = 0.0;
        double b = 3.0;
        double expected = 0.0;
        double delta = 0.0001;
        double result = Math.pow(a, b);
        assertEquals(expected, result, delta);
    }


}
