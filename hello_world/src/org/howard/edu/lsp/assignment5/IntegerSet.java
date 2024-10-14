// Name: Mildness Akomoize

package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The IntegerSet class represents a set of integers.
 * It provides various operations for manipulating and querying the set.
 */
public class IntegerSet {
    private List<Integer> set;

    /**
     * Default constructor initializes an empty set.
     */
    public IntegerSet() {
        set = new ArrayList<>();
    }

    /**
     * Constructor that initializes the set with given elements.
     * @param set The ArrayList of integers to initialize the set with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>(set);
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set.
     * @return The number of elements in the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another object.
     * @param o The object to compare with.
     * @return true if the sets are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IntegerSet)) return false;
        IntegerSet that = (IntegerSet) o;
        return new ArrayList<>(set).containsAll(that.set) && that.set.containsAll(set);
    }

    /**
     * Checks if the set contains a specific value.
     * @param value The value to check for.
     * @return true if the set contains the value, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     * @return The largest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest item in the set.
     * @return The smallest integer in the set.
     * @throws IntegerSetException if the set is empty.
     */
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return Collections.min(set);
    }
    
    /**
     * Adds an item to the set if it's not already present.
     * @param item The integer to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it's present.
     * @param item The integer to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Performs a union operation with another IntegerSet.
     * @param intSetb The IntegerSet to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    /**
     * Performs an intersection operation with another IntegerSet.
     * @param intSetb The IntegerSet to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    /**
     * Performs a set difference operation (this set minus the other set).
     * @param intSetb The IntegerSet to subtract.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    /**
     * Performs a complement operation with another IntegerSet.
     * @param intSetb The IntegerSet to use as the universal set.
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> result = new ArrayList<>(intSetb.set);
        result.removeAll(set);
        set = result;
    }

    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     * @return A string representation of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}