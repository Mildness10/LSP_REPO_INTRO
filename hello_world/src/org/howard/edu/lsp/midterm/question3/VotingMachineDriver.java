package org.howard.edu.lsp.midterm.question3;

/**
 * Driver class to test the VotingMachine functionality.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");

        // Display the results
        System.out.println(vm.toString()); // Output: prints the vote counts for each candidate
    }
}
