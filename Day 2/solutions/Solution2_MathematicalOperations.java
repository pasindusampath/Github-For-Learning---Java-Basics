/**
 * Solution 2: Mathematical Operations
 * 
 * This is the solution for Exercise 2.
 * It demonstrates how to perform mathematical operations
 * with variables in Java.
 */

public class Solution2_MathematicalOperations {
    
    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int a = 15;
        int b = 4;
        
        // Display the original values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Perform addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        
        // Perform subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);
        
        // Perform multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
        
        // Perform division (integer division)
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);
        
        // Perform modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
    }
}

/*
 * Explanation:
 * 1. Two integer variables are declared and initialized
 * 2. Five mathematical operations are performed:
 *    - Addition (+): adds two numbers
 *    - Subtraction (-): subtracts second number from first
 *    - Multiplication (*): multiplies two numbers
 *    - Division (/): divides first number by second (integer division)
 *    - Modulus (%): gives remainder after division
 * 3. Each operation result is stored in a variable
 * 4. Results are displayed with descriptive labels
 * 
 * Note: Integer division truncates the decimal part
 * 15 / 4 = 3 (not 3.75)
 * 
 * To compile and run:
 * javac Solution2_MathematicalOperations.java
 * java Solution2_MathematicalOperations
 */
