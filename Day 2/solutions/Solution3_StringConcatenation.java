/**
 * Solution 3: String Concatenation
 * 
 * This is the solution for Exercise 3.
 * It demonstrates how to concatenate strings
 * and create meaningful messages.
 */

public class Solution3_StringConcatenation {
    
    public static void main(String[] args) {
        // Declare variables for first name and last name
        String firstName = "John";
        String lastName = "Doe";
        
        // Concatenate them to form a full name
        String fullName = firstName + " " + lastName;
        
        // Display the individual names
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
        // Display the full name
        System.out.println("Full Name: " + fullName);
        
        // Add a greeting message using the full name
        String greeting = "Hello, " + fullName + "! Welcome to Java programming!";
        System.out.println(greeting);
        
        // Additional examples of string concatenation
        System.out.println("\n=== Additional Examples ===");
        
        // Concatenating with other data types
        int age = 25;
        String ageMessage = "Age: " + age;
        System.out.println(ageMessage);
        
        // Building a complete message
        String completeMessage = "Name: " + fullName + ", Age: " + age;
        System.out.println(completeMessage);
        
        // Using += operator for concatenation
        String message = "Welcome";
        message += " to";
        message += " Java!";
        System.out.println(message);
    }
}

/*
 * Explanation:
 * 1. Two string variables are declared for first and last name
 * 2. The + operator is used to concatenate strings
 * 3. A space is added between first and last name
 * 4. The full name is used in a greeting message
 * 5. Additional examples show different ways to concatenate strings
 * 
 * Key points about string concatenation:
 * - Use + operator to combine strings
 * - You can concatenate strings with other data types
 * - Numbers are automatically converted to strings when concatenated
 * - Use += operator to append to existing strings
 * 
 * To compile and run:
 * javac Solution3_StringConcatenation.java
 * java Solution3_StringConcatenation
 */
