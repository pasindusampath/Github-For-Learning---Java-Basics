# Day 2: Variables and Data Types

Welcome to Day 2! Today, we'll learn about variables and data types in Java. These are fundamental concepts that you'll use in every Java program you write.

## 🎯 Learning Objectives

By the end of this day, you will be able to:
- Understand what variables are and why we use them
- Learn about different data types in Java
- Declare and initialize variables
- Perform basic operations with variables
- Understand variable naming conventions
- Use constants in your programs

## 📖 What are Variables?

A **variable** is like a container that stores data in your program. Think of it as a labeled box where you can put different types of information.

### Why do we use variables?
- **Store data**: Keep information that can change during program execution
- **Reuse values**: Use the same value multiple times without retyping it
- **Make code readable**: Give meaningful names to data
- **Perform calculations**: Use variables in mathematical operations

## 🏷️ Variable Declaration and Initialization

### Declaration
Declaring a variable means telling Java what type of data it will hold and what name it will have.

```java
// Syntax: dataType variableName;
int age;
String name;
double price;
```

### Initialization
Initializing a variable means giving it a value for the first time.

```java
// Syntax: variableName = value;
age = 25;
name = "John";
price = 19.99;
```

### Declaration and Initialization Together
You can declare and initialize a variable in one line:

```java
// Syntax: dataType variableName = value;
int age = 25;
String name = "John";
double price = 19.99;
```

## 📊 Data Types in Java

Java has two main categories of data types:

### 1. Primitive Data Types
These are basic data types built into Java:

#### Integer Types
- **`byte`**: 8-bit integer (-128 to 127)
- **`short`**: 16-bit integer (-32,768 to 32,767)
- **`int`**: 32-bit integer (-2,147,483,648 to 2,147,483,647) - **Most commonly used**
- **`long`**: 64-bit integer (very large numbers)

#### Floating-Point Types
- **`float`**: 32-bit floating-point number
- **`double`**: 64-bit floating-point number - **Most commonly used**

#### Character Type
- **`char`**: Single character (e.g., 'A', '5', '@')

#### Boolean Type
- **`boolean`**: True or false values

### 2. Reference Data Types
These are more complex types that reference objects:

- **`String`**: Text data (e.g., "Hello, World!")
- **Arrays**: Collections of data
- **Objects**: Custom data types (we'll learn about these later)

## 💻 Code Examples

### Basic Variable Usage
```java
public class VariableExample {
    public static void main(String[] args) {
        // Integer variables
        int age = 25;
        int year = 2024;
        
        // String variables
        String name = "Alice";
        String greeting = "Hello";
        
        // Double variables
        double height = 5.6;
        double weight = 130.5;
        
        // Boolean variables
        boolean isStudent = true;
        boolean hasLicense = false;
        
        // Character variables
        char grade = 'A';
        char symbol = '@';
        
        // Display the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
    }
}
```

### Variable Operations
```java
public class VariableOperations {
    public static void main(String[] args) {
        // Declare and initialize variables
        int a = 10;
        int b = 5;
        
        // Perform operations
        int sum = a + b;        // Addition
        int difference = a - b; // Subtraction
        int product = a * b;    // Multiplication
        int quotient = a / b;   // Division
        int remainder = a % b;  // Modulus (remainder)
        
        // Display results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
```

## 🏷️ Variable Naming Conventions

### Rules for Variable Names:
1. **Start with a letter, underscore, or dollar sign**
2. **Can contain letters, digits, underscores, and dollar signs**
3. **Cannot be Java keywords** (like `int`, `class`, `public`)
4. **Are case-sensitive** (`age` and `Age` are different)

### Best Practices:
- **Use camelCase**: `firstName`, `studentAge`, `totalPrice`
- **Use meaningful names**: `studentName` instead of `s`
- **Avoid abbreviations**: `userName` instead of `un`
- **Use descriptive names**: `numberOfStudents` instead of `num`

### Examples:
```java
// Good variable names
String firstName = "John";
int studentAge = 20;
double averageGrade = 85.5;
boolean isEnrolled = true;

// Bad variable names
String n = "John";           // Too short
int a = 20;                  // Not descriptive
double avg = 85.5;           // Abbreviation
boolean e = true;            // Too short
```

## 🔒 Constants

Constants are variables whose values cannot be changed after initialization. In Java, we use the `final` keyword to create constants.

```java
public class ConstantsExample {
    public static void main(String[] args) {
        // Constants are typically written in UPPER_SNAKE_CASE
        final double PI = 3.14159;
        final String COMPANY_NAME = "Java Learning Co.";
        final int MAX_STUDENTS = 100;
        
        // You cannot change the value of a constant
        // PI = 3.14; // This would cause an error
        
        System.out.println("PI value: " + PI);
        System.out.println("Company: " + COMPANY_NAME);
        System.out.println("Max students: " + MAX_STUDENTS);
    }
}
```

## 🎯 Exercises

### Exercise 1: Basic Variables
Create a program that declares and initializes variables for:
- Your name (String)
- Your age (int)
- Your height in feet (double)
- Whether you're a student (boolean)

### Exercise 2: Mathematical Operations
Create a program that:
- Declares two integer variables
- Performs all basic mathematical operations on them
- Displays the results

### Exercise 3: String Concatenation
Create a program that:
- Declares variables for first name and last name
- Concatenates them to form a full name
- Displays the result

### Exercise 4: Constants
Create a program that:
- Declares constants for common values (like PI, gravity, etc.)
- Uses these constants in calculations
- Displays the results

## 📝 Code Examples

Check out the `examples/` folder for:
- `BasicVariables.java` - Basic variable declaration and usage
- `VariableOperations.java` - Mathematical operations with variables
- `StringConcatenation.java` - Working with text data
- `ConstantsExample.java` - Using constants in programs

## 🎯 Exercise Solutions

After you've tried the exercises, check the `solutions/` folder for:
- Step-by-step solutions
- Explanations of the code
- Best practices and tips

## 🔍 Quick Quiz

1. What is the difference between declaration and initialization?
2. Which data type would you use to store a person's age?
3. What is the naming convention for variables in Java?
4. How do you create a constant in Java?
5. What happens if you try to change the value of a constant?

## 📚 Key Takeaways

- Variables are containers that store data in your program
- Java has primitive and reference data types
- Variables must be declared before they can be used
- Use meaningful names for variables (camelCase)
- Constants are created using the `final` keyword
- You can perform mathematical operations with variables

## 🚀 What's Next?

Tomorrow (Day 3), we'll learn about:
- Control structures (if-else statements)
- Comparison operators
- Logical operators
- Making decisions in your programs

## 💡 Tips for Success

1. **Practice with different data types**: Try creating variables of each type
2. **Use meaningful names**: Make your code self-documenting
3. **Experiment with operations**: Try different mathematical operations
4. **Test your code**: Always compile and run your programs
5. **Ask questions**: Use GitHub Issues if you get stuck

---

**Great job on completing Day 2!** 🎉 You now understand how to store and manipulate data in Java. Keep practicing with variables and data types!

*Ready for Day 3? Let's learn how to make decisions in our programs!* ➡️
