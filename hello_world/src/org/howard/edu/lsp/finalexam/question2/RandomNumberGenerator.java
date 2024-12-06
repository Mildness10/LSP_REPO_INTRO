package org.howard.edu.lsp.finalexam.question2;

/**
 * Interface defining the contract for random number generators.
 * Implementations of this interface provide different algorithms
 * for generating random positive integers.
 */
public interface RandomNumberGenerator {
    /**
     * Generates a random positive integer.
     * @return a positive random integer
     */
    int generateNumber();
}