package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * Utility class for operations on HashMaps.
 */
public class MapUtilities {

    /**
     * Counts the number of common key/value pairs between two HashMaps.
     * 
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return the number of common key/value pairs; returns 0 if either map is empty
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int commonCount = 0;

        // Iterate through the entries in the first map
        for (HashMap.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            // Check if the same key/value pair exists in the second map
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                commonCount++;
            }
        }

        return commonCount;
    }
}
