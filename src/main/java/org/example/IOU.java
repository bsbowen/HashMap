package org.example;
import java.util.HashMap;

/*
    Objective: Create a class to manage debts using a hashmap.
    Steps:
    - Create a class IOU with methods to set and retrieve amounts owed.
    - Implement methods: setSum and howMuchDoIOweTo.
 */

public class IOU {
    // Step 1: Declare a HashMap to store debts where the key is the name (String)
    // and the value is the amount owed (Double)
    private HashMap<String, Double> debts;

    // Step 2: Constructor to initialize the HashMap when a new IOU object is created
    public IOU() {
        // Initialize the debts HashMap to be an empty map
        this.debts = new HashMap<>();
    }

    // Step 3: Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        // Store the person's name and the amount owed in the HashMap
        debts.put(toWhom, amount);
    }

    // Step 4: Method to retrieve the amount owed to a specific person
    public double howMuchDoIOweTo(String toWhom) {
        // Retrieve the amount owed to the person using the key (toWhom),
        // or return 0.0 if the person is not found in the HashMap
        return debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        // Step 5: Create an instance of IOU to track debts
        IOU mattsIOU = new IOU();

        // Step 6: Set debts for specific individuals
        mattsIOU.setSum("Arthur", 51.5); // Owe Arthur 51.5
        mattsIOU.setSum("Michael", 30);  // Owe Michael 30.0

        // Step 7: Retrieve and print the amounts owed to these individuals
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));  // Expected output: 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Expected output: 30.0
    }

    /*
     Summary:
     The IOU class uses a HashMap to store and manage debts, with each person's name as the key
     and the amount owed to them as the value. The setSum method allows us to add or update
     the amount owed to a person, while the howMuchDoIOweTo method retrieves the amount owed
     to a specified person, defaulting to 0.0 if the person is not found. In the main method,
     we demonstrated how to create an instance of the IOU class, set debts for individuals,
     and retrieve the amounts owed to them.
    */
}