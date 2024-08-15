package org.example;

import java.util.HashMap;

/*
    Objective: Create a HashMap to store names and their corresponding nicknames.
    Steps:
    - Create a new HashMap<String, String>.
    - Add entries to the HashMap where the key is the person’s name and the value is their nickname.
    - Retrieve and print specific nicknames from the HashMap.
 */

public class Nicknames {
    public static void main(String[] args) {
        // Step 1: Create a new HashMap to store names as keys and their nicknames as values.
        HashMap<String, String> nicknames = new HashMap<>();

        // Step 2: Add entries to the HashMap (name as the key and nickname as the value).
        nicknames.put("matthew", "matt");  // Add Matthew's nickname
        nicknames.put("daniel", "mix");    // Add Daniel's nickname
        nicknames.put("arthur", "artie");  // Add Arthur's nickname

        // Step 3: Retrieve and print specific nicknames from the HashMap.
        System.out.println(nicknames.get("matthew"));  // Expected output: matt
        System.out.println(nicknames.get("daniel"));   // Expected output: mix
        System.out.println(nicknames.get("arthur"));   // Expected output: artie
    }
}

/*
Summary:
The Nicknames class creates a HashMap that maps names to nicknames. The names are used as keys,
and the corresponding nicknames are used as values in the HashMap. The program adds three name-nickname
pairs to the HashMap: Matthew (Matt), Daniel (Mix), and Arthur (Artie). The specific nicknames are retrieved
from the HashMap using the names as keys and printed to the console.
*/