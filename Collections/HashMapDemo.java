package com.dev;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer,String> hmap = new HashMap<>();
		
		hmap.put(1, "Loki");
		hmap.put(3, "com");
		hmap.put(2, "six");
		hmap.put(6, "L");
		System.out.println(hmap);
		
		Map<String, Integer> studentScores = new HashMap<>();

        // Add elements
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 92);

        // Get a value
        System.out.println("Alice's score: " + studentScores.get("Alice")); // Output: Alice's score: 95

        // Update a value
        studentScores.put("Bob", 90);
        System.out.println("Bob's updated score: " + studentScores.get("Bob")); // Output: Bob's updated score: 90

        // Check if a key exists
        System.out.println("Contains 'Charlie'? " + studentScores.containsKey("Charlie")); // Output: Contains 'Charlie'? true

        // Remove an element
        studentScores.remove("Charlie");
        System.out.println("Contains 'Charlie' after removal? " + studentScores.containsKey("Charlie")); // Output: Contains 'Charlie' after removal? false

        // Iterate through entries
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
	}

}
