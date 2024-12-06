package org.howard.edu.lsp.finalexam.question2;

/**
 * Implementation of RandomNumberGenerator using the Linear Congruential
 * Generator algorithm to produce random numbers.
 * Uses the formula: X(n+1) = (aX(n) + c) mod m
 */
public class LinearCongruentialGenerator implements RandomNumberGenerator {
    /** Current seed value for the generator */
    private long seed;
    /** Multiplier constant for the LCG algorithm */
    private static final long MULTIPLIER = 1597;
    /** Increment constant for the LCG algorithm */
    private static final long INCREMENT = 51749;
    /** Modulus constant for the LCG algorithm */
    private static final long MODULUS = 244944;
    
    /**
     * Constructs a new Linear Congruential Generator with
     * a seed based on the current system time.
     */
    public LinearCongruentialGenerator() {
        this.seed = System.currentTimeMillis() % MODULUS;
    }
    
    /**
     * Generates a random positive integer using the LCG algorithm.
     * @return a positive random integer
     */
    @Override
    public int generateNumber() {
        seed = (MULTIPLIER * seed + INCREMENT) % MODULUS;
        return Math.abs((int)seed);
    }
}