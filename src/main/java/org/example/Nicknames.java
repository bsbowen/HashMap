package org.example;

import java.util.HashMap;

/*
	1.	Objective: Create a hashmap to store names
	    and their corresponding nicknames.
	2.	Steps:
	•	Create a new HashMap<String, String>.
	•	Add entries to the hashmap where the key
	    is the person’s name and the value is their nickname.
	•	Retrieve and print a specific nickname from the hashmap.
 */

public class Nicknames {
    public static void main(String[] args) {
       //Create a HashMap
       HashMap<String, String> nicknames= new HashMap<>();

       //add entries
        nicknames.put("matthew", "matt");
        nicknames.put("daniel", "mix");
        nicknames.put("arthur", "artie");

        //retrieve and print a nickname
        System.out.println(nicknames.get("matthew"));


    }


}
