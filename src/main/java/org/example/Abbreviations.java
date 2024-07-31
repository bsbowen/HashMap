package org.example;
import java.util.HashMap;
/*
    1.	Objective: Create a class to manage abbreviations
        and their explanations.
	2.	Steps:
	•	Create a class Abbreviations with methods to add,
	    check, and find explanations for abbreviations.
	•	Implement methods: addAbbreviation, hasAbbreviation,
	    and findExplanationFor.
 */
public class Abbreviations {
    // Step 1: Declare a HashMap to store abbreviations and
    // their explanations
    private HashMap<String, String> abbreviations;

    // Step 2: Constructor to initialize the HashMap
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    // Step 3: Method to add an abbreviation and its explanation
    public void addAbbreviation(String abbreviation,
                                String explanation) {
        abbreviations.put(abbreviation, explanation);
    }
    //Step 4: Method to check if an abbreviation exists in the HashMap
    public boolean hasAbbreviation(String abbreviation) {
        return
                abbreviations.containsKey(abbreviation);
    }
    // Step 5: Method to find the explanation for a given abbreviation
    public String findExplanationFor(String abbreviation) {
        return
                abbreviations.get(abbreviation);
    }

    public static void main(String[] args) {
        // Step 6: Create an instance of Abbreviations
        Abbreviations abbr = new Abbreviations();

        // Step 7: Add some abbreviations and their explanations
        abbr.addAbbreviation("e.g.", "for example");
        abbr.addAbbreviation("etc.", "and so on");
        abbr.addAbbreviation("i.e.", "more precisely");


        // Step 8: Split a string into parts and replace
        // abbreviations with their explanations
        String text = "e.g. i.e. etc. lol";
        for (String part : text.split(" ")) {
            if (abbr.hasAbbreviation(part)) {
                part = abbr.findExplanationFor(part);
            }
            System.out.print(part + " ");
            }
        }
    }

