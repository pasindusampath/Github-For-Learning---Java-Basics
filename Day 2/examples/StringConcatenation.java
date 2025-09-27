/**
 * StringConcatenation.java
 * 
 * This program demonstrates string concatenation in Java.
 * It shows how to combine text data using the + operator
 * and other string operations.
 * 
 * @author Java Learning Repository
 * @version 1.0
 */

public class StringConcatenation {
    
    public static void main(String[] args) {
        // Declare string variables
        String firstName = "John";
        String lastName = "Doe";
        String middleName = "William";
        
        // Basic string concatenation
        System.out.println("=== Basic Concatenation ===");
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        // Concatenating multiple strings
        String completeName = firstName + " " + middleName + " " + lastName;
        System.out.println("Complete Name: " + completeName);
        
        // Concatenating strings with other data types
        System.out.println("\n=== Mixed Data Types ===");
        int age = 25;
        double height = 5.9;
        boolean isStudent = true;
        
        String info = "Name: " + fullName + ", Age: " + age + ", Height: " + height + " feet";
        System.out.println(info);
        
        // Concatenating in print statements
        System.out.println("\n=== Direct Concatenation ===");
        System.out.println("Hello, " + firstName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " feet.");
        System.out.println("Student status: " + isStudent);
        
        // Building strings step by step
        System.out.println("\n=== Building Strings ===");
        String message = "Welcome";
        message = message + " to";
        message = message + " Java";
        message = message + " programming!";
        System.out.println(message);
        
        // Using += operator for concatenation
        System.out.println("\n=== Using += Operator ===");
        String greeting = "Hello";
        greeting += " there";
        greeting += "!";
        System.out.println(greeting);
        
        // Concatenating with numbers
        System.out.println("\n=== Number Concatenation ===");
        int num1 = 10;
        int num2 = 20;
        
        // This will concatenate, not add
        String result1 = "The sum is: " + num1 + num2;
        System.out.println(result1); // Output: "The sum is: 1020"
        
        // To add numbers, use parentheses
        String result2 = "The sum is: " + (num1 + num2);
        System.out.println(result2); // Output: "The sum is: 30"
        
        // More examples
        System.out.println("\n=== More Examples ===");
        String course = "Java Programming";
        int credits = 3;
        String professor = "Dr. Smith";
        
        System.out.println("Course: " + course);
        System.out.println("Credits: " + credits);
        System.out.println("Professor: " + professor);
        
        // Create a formatted string
        String courseInfo = "Course: " + course + " (" + credits + " credits) - " + professor;
        System.out.println("Course Info: " + courseInfo);
        
        // Multi-line string building
        System.out.println("\n=== Multi-line String ===");
        String studentInfo = "Student Information:\n" +
                           "Name: " + fullName + "\n" +
                           "Age: " + age + "\n" +
                           "Height: " + height + " feet\n" +
                           "Student: " + isStudent;
        System.out.println(studentInfo);
    }
}

/*
 * Key Points:
 * 1. Use + operator to concatenate strings
 * 2. You can concatenate strings with other data types
 * 3. Numbers are converted to strings when concatenated
 * 4. Use parentheses to control order of operations
 * 5. You can build strings step by step
 * 6. += operator can be used for concatenation
 */
