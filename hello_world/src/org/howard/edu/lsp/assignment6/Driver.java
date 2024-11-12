// Mildness Akomoize

package org.howard.edu.lsp.assignment6;

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
		
		// creates sets and adding values
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		IntegerSet set3 = new IntegerSet();
		
		// prints values of the sets
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		
		// prints length of set1 and checks if set1 equals set2
		System.out.println("The length of set1: " + set1.length());
		System.out.println("Does set1 equal set2: "+ set1.equals(set2));
		
		// removes value from set2 and finding difference between set2 and set1
		set2.remove(3);
		System.out.println("Value of set2 after removing 3 is: " + set2.toString());
		set2.diff(set1);
		System.out.println("The Value of set2 after finding the difference from set1: " + set2.toString());
		
		// checks if set1 contains 2 and union of set1 and set2
		System.out.println("Does set1 contain 2: "+ set1.contains(2));
		set2.union(set1);
		System.out.println("The Value of set2 after Union with set1: " + set2.toString());
		
		// finds smallest and largest values of set1 and intersecting set1 with set2
		try {
			System.out.println("Smallest value in Set1 is:" + set1.smallest());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			System.out.println("Largest value in Set1 is:" + set1.largest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		set1.intersect(set2);
		System.out.println("The Value of set1 after intersecting with set2: " + set1.toString());
		
		
		// clears set1 and checks if it is empty
		set1.clear();
		System.out.println("Is set1 empty after calling the function clear: "+ set1.isEmpty());	
		
		// Test complement
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.complement(set2);
        System.out.println("Complement of Set1 relative to Set2: " + set1);
        
        // Tests largest and smallest on an empty set (should throw exception)
        try {
            System.out.println("Attempting to get largest on empty Set3: " + set3.largest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception when getting largest on empty set: " + e.getMessage());
        }
        
        try {
            System.out.println("Attempting to get smallest on empty Set3: " + set3.smallest());
        } catch (IntegerSetException e) {
            System.out.println("Correctly caught exception when getting smallest on empty set: " + e.getMessage());
        }
        
        // Tests the equals with a non-IntegerSet object
        System.out.println("Set1 equals a String object: " + set1.equals("Hello"));
	}
}