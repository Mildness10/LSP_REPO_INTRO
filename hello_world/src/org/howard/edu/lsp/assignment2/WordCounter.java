// Name: Mildness Akomoize

package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";
        Map<String, Integer> wordCount = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z']", "").toLowerCase();
                    if (word.length() > 3) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            wordCount.forEach((w, count) -> System.out.println(w + " " + count));

        } catch (IOException e) {
            e.printStackTrace();  
        }
    }
}
