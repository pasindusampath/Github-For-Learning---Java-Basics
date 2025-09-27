/**
 * MultipleMessages.java
 * 
 * This program demonstrates how to print multiple messages
 * and use different print methods in Java.
 * 
 * @author Java Learning Repository
 * @version 1.0
 */

public class MultipleMessages {
    
    public static void main(String[] args) {
        // Using println() - prints and moves to next line
        System.out.println("Message 1: Welcome to Java!");
        System.out.println("Message 2: Learning is fun!");
        System.out.println("Message 3: Practice makes perfect!");
        
        // Print an empty line
        System.out.println();
        
        // Using print() - prints without moving to next line
        System.out.print("This is ");
        System.out.print("all on ");
        System.out.print("one line!");
        System.out.println(); // Move to next line
        
        // Mix of print and println
        System.out.print("Line 1: ");
        System.out.println("Hello");
        System.out.print("Line 2: ");
        System.out.println("World");
        
        // Print multiple empty lines
        System.out.println();
        System.out.println();
        System.out.println("This message has two empty lines above it!");
        
        // Print a simple ASCII art
        System.out.println();
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");
        System.out.println("  Java!");
    }
}

/*
 * Key differences:
 * - println() prints and moves to next line
 * - print() prints without moving to next line
 * - You can call println() with no arguments to print an empty line
 * - You can mix print() and println() as needed
 */
