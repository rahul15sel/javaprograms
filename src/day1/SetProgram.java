package day1;

import java.util.*;
public class SetProgram {

            public static void main(String[] args) {
                // Create a HashSet of Strings
                Set<String> fruits = new HashSet<>();

                // Add elements to the set
                fruits.add("Apple");
                fruits.add("Banana");
                fruits.add("Mango");
                fruits.add("Orange");
                fruits.add("Apple"); // duplicate, will be ignored

                // Display the set
                System.out.println("Fruits Set: " + fruits);

                // Check if an item exists
                if (fruits.contains("Mango")) {
                    System.out.println("Mango is in the set.");
                }

                // Remove an element
                fruits.remove("Banana");
                System.out.println("After removing Banana: " + fruits);

                // Size of the set
                System.out.println("Set size: " + fruits.size());

                // Iterate through the set
                System.out.println("Iterating through set:");
                for (String fruit : fruits) {
                    System.out.println(fruit);
                }
            }
        }


