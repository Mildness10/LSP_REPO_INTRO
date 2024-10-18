package org.howard.edu.lsp.midterm.question2;

/**
 * Utility class for performing various arithmetic calculations.
 */
public class Calculator {

    /**
     * Sums two integers.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Sums two double values.
     * 
     * @param a the first double
     * @param b the second double
     * @return the sum of a and b
     */
    public static double sum(double a, double b) {
        return a + b;
    }

    /**
     * Sums all elements in an array of integers.
     * 
     * @param numbers the array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
