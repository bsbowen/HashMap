package org.example;
import java.util.HashMap;

/*
    1.	Objective: Create a class to manage debts using a hashmap.
	2.	Steps:
	•	Create a class IOU with methods to set and retrieve amounts owed.
	•	Implement methods: setSum and howMuchDoIOweTo.

 */

public class IOU {
    // Step 1: Declare a HashMap to store debts
    private HashMap<String, Double> debts;

    // Step 2: Constructor to initialize the HashMap
    public IOU() {
        this.debts = new HashMap<>();
    }

    // Step 3: Method to set the amount owed to a person
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    // Step 4: Method to retrieve the amount owed to a person
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }

    public static void main(String[] args) {
        // Step 5: Create an instance of IOU
        IOU mattsIOU = new IOU();

        // Step 6: Set some debts
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        // Step 7: Retrieve and print the amounts owed
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur")); // Prints 51.5
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael")); // Prints 30.0
    }

}
