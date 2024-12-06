package org.howard.edu.lsp.finalexam.question2;

/**
 * Client class demonstrating the usage of RandomNumberService
 * with different random number generation strategies.
 */
public class RandomNumberClient {
    /**
     * Main method that demonstrates the usage of different
     * random number generation strategies.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();
        
        // Using Java's built-in Random
        service.setStrategy(new JavaRandomGenerator());
        System.out.println("Java Random Generator: " + service.getRandomNumber());
        
        // Using Linear Congruential Generator
        service.setStrategy(new LinearCongruentialGenerator());
        System.out.println("Linear Congruential Generator: " + service.getRandomNumber());
    }
}