// Mildness Akomoize

package org.howard.edu.lsp.assignment5;

/**
 * The Driver class is used to test the functionality of the IntegerSet class.
 * It contains a main method that demonstrates various operations on IntegerSet objects.
 */
public class Driver {

    /**
     * Constructs a new Driver object.
     * This constructor is empty as the class is used solely for running the main method.
     */
    public Driver() {
        // Empty constructor
    }

    /**
     * The main method runs a series of tests on the IntegerSet class.
     * It demonstrates the usage of various methods provided by IntegerSet.
     *
     * @param args Command line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        // Test IntegerSet methods
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Test add method
        System.out.println("Testing add method:");
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2);

        // Test smallest and largest methods
        System.out.println("\nTesting smallest and largest methods:");
        try {
            System.out.println("Smallest value in Set1: " + set1.smallest());
            System.out.println("Largest value in Set1: " + set1.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test with empty set
        System.out.println("\nTesting smallest and largest methods with empty set:");
        IntegerSet emptySet = new IntegerSet();
        try {
            System.out.println("Smallest value in empty set: " + emptySet.smallest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            System.out.println("Largest value in empty set: " + emptySet.largest());
        } catch (IntegerSetException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test remove method
        System.out.println("\nTesting remove method:");
        System.out.println("Set1 before removing 2: " + set1);
        set1.remove(2);
        System.out.println("Set1 after removing 2: " + set1);

        // Test union method
        System.out.println("\nTesting union method:");
        System.out.println("Set1 before union: " + set1);
        System.out.println("Set2 before union: " + set2);
        set1.union(set2);
        System.out.println("Set1 after union with Set2: " + set1);

        // Test intersect method
        System.out.println("\nTesting intersect method:");
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 before intersect: " + set1);
        System.out.println("Set2 before intersect: " + set2);
        set1.intersect(set2);
        System.out.println("Set1 after intersect with Set2: " + set1);

        // Test diff method
        System.out.println("\nTesting diff method:");
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 before diff: " + set1);
        System.out.println("Set2 before diff: " + set2);
        set1.diff(set2);
        System.out.println("Set1 after diff with Set2: " + set1);

        // Test complement method
        System.out.println("\nTesting complement method:");
        set1.clear();
        set1.add(1);
        set1.add(2);
        set2.clear();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        System.out.println("Set1 before complement: " + set1);
        System.out.println("Set2 (universal set): " + set2);
        set1.complement(set2);
        System.out.println("Set1 after complement with Set2: " + set1);

        // Test isEmpty method
        System.out.println("\nTesting isEmpty method:");
        System.out.println("Is Set1 empty? " + set1.isEmpty());
        set1.clear();
        System.out.println("Is Set1 empty after clear? " + set1.isEmpty());

        // Test equals method
        System.out.println("\nTesting equals method:");
        set1.add(1);
        set1.add(2);
        set2.clear();
        set2.add(2);
        set2.add(1);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are Set1 and Set2 equal? " + set1.equals(set2));

        // Test length method
        System.out.println("\nTesting length method:");
        System.out.println("Length of Set1: " + set1.length());

        // Test contains method
        System.out.println("\nTesting contains method:");
        System.out.println("Does Set1 contain 2? " + set1.contains(2));
        System.out.println("Does Set1 contain 3? " + set1.contains(3));
    }
}