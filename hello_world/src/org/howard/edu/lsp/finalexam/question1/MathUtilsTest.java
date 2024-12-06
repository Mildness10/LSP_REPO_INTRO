package org.howard.edu.lsp.finalexam.question1;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MathUtilsTest {
    private MathUtils mathUtils;
    
    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    // Factorial Tests
    @Test
    public void factorialZeroInputReturnsOne() {
        assertEquals(1, mathUtils.factorial(0));
    }

    @Test
    public void factorialOneInputReturnsOne() {
        assertEquals(1, mathUtils.factorial(1));
    }

    @Test
    public void factorialPositiveInputReturnsCorrectResult() {
        assertEquals(120, mathUtils.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialNegativeInputThrowsException() {
        mathUtils.factorial(-1);
    }

    // Prime Number Tests
    @Test
    public void isPrimeInputOneReturnsFalse() {
        assertFalse(mathUtils.isPrime(1));
    }

    @Test
    public void isPrimePrimeNumberReturnsTrue() {
        assertTrue(mathUtils.isPrime(17));
    }

    @Test
    public void isPrimeNonPrimeNumberReturnsFalse() {
        assertFalse(mathUtils.isPrime(15));
    }

    @Test
    public void isPrimeNegativeNumberReturnsFalse() {
        assertFalse(mathUtils.isPrime(-7));
    }

    // GCD Tests
    @Test
    public void gcdPositiveNumbersReturnsCorrectResult() {
        assertEquals(6, mathUtils.gcd(24, 18));
    }

    @Test
    public void gcdOneZeroInputReturnsNonZeroInput() {
        assertEquals(15, mathUtils.gcd(0, 15));
    }

    @Test
    public void gcdNegativeNumbersReturnsPositiveResult() {
        assertEquals(4, mathUtils.gcd(-12, -16));
    }

    @Test(expected = IllegalArgumentException.class)
    public void gcdBothZeroInputsThrowsException() {
        mathUtils.gcd(0, 0);
    }
}
