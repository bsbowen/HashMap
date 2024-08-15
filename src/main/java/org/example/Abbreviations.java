package org.example;
import java.util.HashMap;

/*
    Objective: Create a class to manage abbreviations and their explanations.
    Steps:
    - Create a class Abbreviations with methods to add, check, and find explanations for abbreviations.
    - Implement methods: addAbbreviation, hasAbbreviation, and findExplanationFor.
 */

public class Abbreviations {
    // Step 1: Declare a HashMap to store abbreviations and their explanations.
    private HashMap<String, String> abbreviations;

    // Step 2: Constructor to initialize the HashMap.
    public Abbreviations() {
        // Initialize the abbreviations HashMap as an empty map.
        this.abbreviations = new HashMap<>();
    }

    // Step 3: Method to add an abbreviation and its corresponding explanation to the HashMap.
    public void addAbbreviation(String abbreviation, String explanation) {
        // Store the abbreviation as the key and the explanation as the value in the HashMap.
        abbreviations.put(abbreviation, explanation);
    }

    // Step 4: Method to check if a given abbreviation exists in the HashMap.
    public boolean hasAbbreviation(String abbreviation) {
        // Return true if the abbreviation exists in the HashMap, false otherwise.
        return abbreviations.containsKey(abbreviation);
    }

    // Step 5: Method to find and return the explanation for a given abbreviation.
    public String findExplanationFor(String abbreviation) {
        // Retrieve the explanation for the abbreviation from the HashMap.
        return abbreviations.get(abbreviation);
    }

    public static void main(String[] args) {
        // Step 6: Create an instance of Abbreviations class to manage abbreviations.
        Abbreviations abbr = new Abbreviations();

        // Step 7: Add some abbreviations and their corresponding explanations.
        abbr.addAbbreviation("e.g.", "for example");
        abbr.addAbbreviation("etc.", "and so on");
        abbr.addAbbreviation("i.e.", "more precisely");

        // Step 8: Split a string into parts and replace abbreviations with their explanations.
        String text = "e.g. i.e. etc. lol";  // The original text containing abbreviations.

        // Loop through each word in the text (split by spaces).
        for (String part : text.split(" ")) {
            // If the word is an abbreviation, replace it with its explanation.
            if (abbr.hasAbbreviation(part)) {
                part = abbr.findExplanationFor(part);
            }
            // Print each word (or replaced explanation) followed by a space.
            System.out.print(part + "    ");
        }
    }
}

/*
Summary:
The Abbreviations class uses a HashMap to store abbreviations as keys and their corresponding explanations as values.
The addAbbreviation method allows you to add new abbreviations to the HashMap, while the hasAbbreviation method checks
if an abbreviation exists. The findExplanationFor method retrieves the explanation for a given abbreviation from the HashMap.

In the main method, the program demonstrates how to use the class by adding abbreviations, splitting a text string into
individual words, checking if those words are abbreviations, and replacing them with their explanations before printing
the final string.

The split method is used to split the text string into words using a space as a delimiter. The program then iterates
through the words, replacing abbreviations with explanations when found, and printing the result.
*/