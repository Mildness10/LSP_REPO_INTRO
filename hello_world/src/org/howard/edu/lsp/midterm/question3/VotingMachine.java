package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;

/**
 * A simplified electronic voting machine.
 */
public class VotingMachine {
    private HashMap<String, Integer> candidates; // Maps candidate names to their vote counts

    /**
     * Constructor to initialize the voting machine.
     */
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate with the given name to the list.
     * 
     * @param name the name of the candidate
     */
    public void addCandidate(String name) {
        // Initialize the candidate with 0 votes if they are not already in the list
        candidates.putIfAbsent(name, 0);
    }

    /**
     * Casts a vote for the candidate with the given name.
     * 
     * @param name the name of the candidate to vote for
     */
    public void castVote(String name) {
        // Increment the vote count for the candidate if they exist
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println("Candidate " + name + " not found.");
        }
    }

    /**
     * Returns a string representation of the candidates and their vote counts.
     * 
     * @return a string showing the number of votes for each candidate
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Vote Counts:\n");
        for (String candidate : candidates.keySet()) {
            result.append(candidate).append(": ").append(candidates.get(candidate)).append(" votes\n");
        }
        return result.toString();
    }
}
