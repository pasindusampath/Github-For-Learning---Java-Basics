/**
 * VariableOperations.java
 * 
 * This program demonstrates mathematical operations with variables.
 * It shows how to perform addition, subtraction, multiplication,
 * division, and modulus operations.
 * 
 * @author Java Learning Repository
 * @version 1.0
 */

public class VariableOperations {
    
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 15;
        int b = 4;
        double x = 10.5;
        double y = 3.2;
        
        System.out.println("=== Integer Operations ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Addition
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);
        
        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);
        
        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);
        
        // Division (integer division)
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);
        
        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);
        
        System.out.println("\n=== Double Operations ===");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        // Double operations
        double sumDouble = x + y;
        double differenceDouble = x - y;
        double productDouble = x * y;
        double quotientDouble = x / y;
        
        System.out.println("Addition: " + x + " + " + y + " = " + sumDouble);
        System.out.println("Subtraction: " + x + " - " + y + " = " + differenceDouble);
        System.out.println("Multiplication: " + x + " * " + y + " = " + productDouble);
        System.out.println("Division: " + x + " / " + y + " = " + quotientDouble);
        
        System.out.println("\n=== Mixed Operations ===");
        // You can mix different data types
        double mixedResult = a + x; // int + double = double
        System.out.println("Mixed: " + a + " + " + x + " = " + mixedResult);
        
        // Order of operations (PEMDAS)
        System.out.println("\n=== Order of Operations ===");
        int result1 = 2 + 3 * 4;        // 2 + 12 = 14
        int result2 = (2 + 3) * 4;      // 5 * 4 = 20
        int result3 = 2 + 3 * 4 - 1;    // 2 + 12 - 1 = 13
        
        System.out.println("2 + 3 * 4 = " + result1);
        System.out.println("(2 + 3) * 4 = " + result2);
        System.out.println("2 + 3 * 4 - 1 = " + result3);
        
        // Increment and decrement
        System.out.println("\n=== Increment and Decrement ===");
        int counter = 5;
        System.out.println("Original counter: " + counter);
        
        counter++; // Increment by 1
        System.out.println("After counter++: " + counter);
        
        counter--; // Decrement by 1
        System.out.println("After counter--: " + counter);
        
        counter += 3; // Add 3
        System.out.println("After counter += 3: " + counter);
        
        counter -= 2; // Subtract 2
        System.out.println("After counter -= 2: " + counter);
        
        counter *= 2; // Multiply by 2
        System.out.println("After counter *= 2: " + counter);
        
        counter /= 3; // Divide by 3
        System.out.println("After counter /= 3: " + counter);
    }
}

/*
 * Key Points:
 * 1. Mathematical operations work with variables
 * 2. Integer division truncates the decimal part
 * 3. Modulus (%) gives the remainder
 * 4. Order of operations follows PEMDAS
 * 5. You can use shorthand operators (++, --, +=, -=, *=, /=)
 */
