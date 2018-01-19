package edu.ldsbc.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Daniel on 1/11/2018.
 */
public class CalculatorTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        assertEquals(40, calculator.add(20,20));
        // Then 20 + 20 = 40
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.multiply(4, 4));
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
}