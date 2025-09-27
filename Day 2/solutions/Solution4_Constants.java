/**
 * Solution 4: Constants
 * 
 * This is the solution for Exercise 4.
 * It demonstrates how to create and use constants
 * in Java programs.
 */

public class Solution4_Constants {
    
    public static void main(String[] args) {
        // Declare constants using the 'final' keyword
        final double PI = 3.14159;
        final double GRAVITY = 9.81;
        final int MAX_STUDENTS = 100;
        final String COMPANY_NAME = "Java Learning Co.";
        
        // Display the constants
        System.out.println("=== Constants ===");
        System.out.println("PI: " + PI);
        System.out.println("GRAVITY: " + GRAVITY + " m/s²");
        System.out.println("MAX_STUDENTS: " + MAX_STUDENTS);
        System.out.println("COMPANY_NAME: " + COMPANY_NAME);
        
        // Use constants in calculations
        System.out.println("\n=== Using Constants in Calculations ===");
        
        // Calculate area of a circle
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);
        
        // Calculate circumference
        double circumference = 2 * PI * radius;
        System.out.println("Circumference of circle with radius " + radius + ": " + circumference);
        
        // Use constants in conditions
        System.out.println("\n=== Using Constants in Conditions ===");
        int currentStudents = 85;
        
        if (currentStudents < MAX_STUDENTS) {
            int remainingSlots = MAX_STUDENTS - currentStudents;
            System.out.println("There are " + remainingSlots + " slots remaining.");
        } else {
            System.out.println("Maximum capacity reached!");
        }
        
        // Use constants in string operations
        System.out.println("\n=== Using Constants in Strings ===");
        String welcomeMessage = "Welcome to " + COMPANY_NAME;
        System.out.println(welcomeMessage);
        
        // Additional constants
        System.out.println("\n=== Additional Constants ===");
        final boolean DEBUG_MODE = true;
        final char GRADE_A = 'A';
        final double TAX_RATE = 0.08;
        
        System.out.println("Debug mode: " + DEBUG_MODE);
        System.out.println("Grade A: " + GRADE_A);
        System.out.println("Tax rate: " + TAX_RATE);
        
        // Using constants in calculations
        double price = 100.0;
        double tax = price * TAX_RATE;
        double total = price + tax;
        
        System.out.println("Price: $" + price);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}

/*
 * Explanation:
 * 1. Constants are created using the 'final' keyword
 * 2. Constants are typically written in UPPER_SNAKE_CASE
 * 3. Constants must be initialized when declared
 * 4. Constants cannot be changed after initialization
 * 5. Constants are used in calculations and conditions
 * 6. Constants make code more readable and maintainable
 * 
 * Key points about constants:
 * - Use 'final' keyword to create constants
 * - Constants are typically written in ALL_CAPS
 * - Constants cannot be modified after initialization
 * - Constants are useful for values that never change
 * - Constants improve code readability and maintainability
 * 
 * To compile and run:
 * javac Solution4_Constants.java
 * java Solution4_Constants
 */
