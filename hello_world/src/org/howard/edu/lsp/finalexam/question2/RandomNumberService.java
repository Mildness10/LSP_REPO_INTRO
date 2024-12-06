package org.howard.edu.lsp.finalexam.question2;

/**
 * Singleton service class that provides random number generation
 * capabilities using different strategies.
 * This service implements both the Singleton and Strategy patterns.
 */
public class RandomNumberService {
    /** Single instance of the service */
    private static RandomNumberService instance;
    /** Current random number generator strategy */
    private RandomNumberGenerator generator;
    
    /**
     * Private constructor to prevent direct instantiation.
     */
    private RandomNumberService() {}
    
    /**
     * Gets the singleton instance of the RandomNumberService.
     * @return the singleton instance of RandomNumberService
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }
    
    /**
     * Sets the random number generation strategy to be used.
     * @param generator the RandomNumberGenerator implementation to use
     */
    public void setStrategy(RandomNumberGenerator generator) {
        this.generator = generator;
    }
    
    /**
     * Generates a random number using the current strategy.
     * @return a positive random integer
     * @throws IllegalStateException if no generator strategy has been set
     */
    public int getRandomNumber() {
        if (generator == null) {
            throw new IllegalStateException("Random number generator strategy not set");
        }
        return generator.generateNumber();
    }
}