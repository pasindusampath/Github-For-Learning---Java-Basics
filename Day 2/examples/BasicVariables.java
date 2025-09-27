/**
 * BasicVariables.java
 * 
 * This program demonstrates basic variable declaration and initialization
 * in Java. It shows how to create variables of different data types
 * and display their values.
 * 
 * @author Java Learning Repository
 * @version 1.0
 */

public class BasicVariables {
    
    public static void main(String[] args) {
        // Integer variables
        int age = 25;
        int year = 2024;
        int numberOfStudents = 30;
        
        // String variables (text data)
        String name = "Alice Johnson";
        String course = "Java Programming";
        String university = "Tech University";
        
        // Double variables (decimal numbers)
        double height = 5.6;
        double weight = 130.5;
        double gpa = 3.75;
        
        // Boolean variables (true/false)
        boolean isStudent = true;
        boolean hasScholarship = false;
        boolean isGraduated = false;
        
        // Character variables (single characters)
        char grade = 'A';
        char letter = 'Z';
        char symbol = '@';
        
        // Display all variables
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println("Year: " + year);
        
        System.out.println("\n=== Physical Information ===");
        System.out.println("Height: " + height + " feet");
        System.out.println("Weight: " + weight + " pounds");
        
        System.out.println("\n=== Academic Information ===");
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Number of Students: " + numberOfStudents);
        
        System.out.println("\n=== Status Information ===");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Has Scholarship: " + hasScholarship);
        System.out.println("Is Graduated: " + isGraduated);
        
        System.out.println("\n=== Character Examples ===");
        System.out.println("Letter: " + letter);
        System.out.println("Symbol: " + symbol);
        
        // You can also change variable values
        System.out.println("\n=== Changing Values ===");
        age = 26;  // Update age
        gpa = 3.8; // Update GPA
        isGraduated = true; // Update graduation status
        
        System.out.println("Updated Age: " + age);
        System.out.println("Updated GPA: " + gpa);
        System.out.println("Updated Graduation Status: " + isGraduated);
    }
}

/*
 * Key Points:
 * 1. Variables must be declared with a data type
 * 2. Variables can be initialized when declared
 * 3. Variable values can be changed after declaration
 * 4. Use meaningful names for variables
 * 5. Different data types store different kinds of information
 */
