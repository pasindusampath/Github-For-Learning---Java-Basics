/**
 * ConstantsExample.java
 * 
 * This program demonstrates how to use constants in Java.
 * Constants are variables whose values cannot be changed
 * after initialization. They are created using the 'final' keyword.
 * 
 * @author Java Learning Repository
 * @version 1.0
 */

public class ConstantsExample {
    
    public static void main(String[] args) {
        // Mathematical constants
        final double PI = 3.14159;
        final double E = 2.71828;
        final double GOLDEN_RATIO = 1.61803;
        
        // Physical constants
        final double GRAVITY = 9.81; // m/s²
        final double SPEED_OF_LIGHT = 299792458; // m/s
        final double AVOGADRO_NUMBER = 6.022e23;
        
        // Application constants
        final String COMPANY_NAME = "Java Learning Co.";
        final String VERSION = "1.0";
        final int MAX_STUDENTS = 100;
        final int MIN_AGE = 18;
        final int MAX_AGE = 65;
        
        // Display constants
        System.out.println("=== Mathematical Constants ===");
        System.out.println("PI: " + PI);
        System.out.println("Euler's number (e): " + E);
        System.out.println("Golden ratio: " + GOLDEN_RATIO);
        
        System.out.println("\n=== Physical Constants ===");
        System.out.println("Gravity: " + GRAVITY + " m/s²");
        System.out.println("Speed of light: " + SPEED_OF_LIGHT + " m/s");
        System.out.println("Avogadro's number: " + AVOGADRO_NUMBER);
        
        System.out.println("\n=== Application Constants ===");
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("Max students: " + MAX_STUDENTS);
        System.out.println("Age range: " + MIN_AGE + " - " + MAX_AGE);
        
        // Using constants in calculations
        System.out.println("\n=== Using Constants in Calculations ===");
        double radius = 5.0;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
        
        // Using constants in conditions
        System.out.println("\n=== Using Constants in Conditions ===");
        int studentAge = 20;
        
        if (studentAge >= MIN_AGE && studentAge <= MAX_AGE) {
            System.out.println("Student age " + studentAge + " is within valid range.");
        } else {
            System.out.println("Student age " + studentAge + " is outside valid range.");
        }
        
        // Using constants in string operations
        System.out.println("\n=== Using Constants in Strings ===");
        String welcomeMessage = "Welcome to " + COMPANY_NAME + " version " + VERSION;
        System.out.println(welcomeMessage);
        
        // Constants with different data types
        System.out.println("\n=== Different Data Types ===");
        final boolean DEBUG_MODE = true;
        final char GRADE_A = 'A';
        final String DEFAULT_COLOR = "Blue";
        
        System.out.println("Debug mode: " + DEBUG_MODE);
        System.out.println("Grade A: " + GRADE_A);
        System.out.println("Default color: " + DEFAULT_COLOR);
        
        // You cannot change the value of a constant
        // The following lines would cause compilation errors:
        // PI = 3.14; // Error: cannot assign a value to final variable PI
        // COMPANY_NAME = "New Company"; // Error: cannot assign a value to final variable COMPANY_NAME
        
        System.out.println("\n=== Constants Cannot Be Changed ===");
        System.out.println("PI will always be: " + PI);
        System.out.println("Company name will always be: " + COMPANY_NAME);
    }
}

/*
 * Key Points:
 * 1. Constants are created using the 'final' keyword
 * 2. Constants are typically written in UPPER_SNAKE_CASE
 * 3. Constants must be initialized when declared
 * 4. Constants cannot be changed after initialization
 * 5. Constants are useful for values that never change
 * 6. Constants make code more readable and maintainable
 * 
 * Naming Convention for Constants:
 * - Use UPPER_SNAKE_CASE (all caps with underscores)
 * - Examples: PI, MAX_SIZE, COMPANY_NAME, DEFAULT_VALUE
 */
