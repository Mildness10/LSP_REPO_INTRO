package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implementation of RandomNumberGenerator using Java's built-in
 * Random class to generate random numbers.
 */
public class JavaRandomGenerator implements RandomNumberGenerator {
    /** Instance of Java's Random class used for number generation */
    private final Random random = new Random();
    
    /**
     * Generates a random positive integer using Java's Random class.
     * @return a positive random integer between 0 and 99999
     */
    @Override
    public int generateNumber() {
        return Math.abs(random.nextInt(100000));
    }
}