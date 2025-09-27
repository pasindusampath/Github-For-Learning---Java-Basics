# Day 1: Introduction to Java and Hello World

Welcome to your first day of learning Java! Today, we'll introduce you to the world of Java programming and write your very first program.

## 🎯 Learning Objectives

By the end of this day, you will be able to:
- Understand what Java is and why it's popular
- Set up your Java development environment
- Write and run your first Java program
- Understand the basic structure of a Java program
- Use comments to document your code

## 📖 What is Java?

Java is a powerful, object-oriented programming language that was created by Sun Microsystems (now owned by Oracle) in 1995. Here's why Java is so popular:

### Key Features of Java:
- **Platform Independent**: "Write once, run anywhere" - Java code runs on any device with a Java Virtual Machine (JVM)
- **Object-Oriented**: Everything in Java is an object, making code organized and reusable
- **Simple and Secure**: Java has a clean syntax and built-in security features
- **Robust**: Java handles errors gracefully and prevents many common programming mistakes
- **High Performance**: Java is fast and efficient for most applications

### Where is Java Used?
- **Web Applications**: Backend services, APIs, and web servers
- **Mobile Apps**: Android applications (Android uses Java)
- **Desktop Applications**: GUI applications and tools
- **Enterprise Software**: Large-scale business applications
- **Games**: Many popular games are built with Java
- **Scientific Applications**: Data analysis and research tools

## 🛠️ Setting Up Your Development Environment

### Step 1: Install Java Development Kit (JDK)

1. **Download JDK 17 or later**:
   - Visit [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
   - Choose the version for your operating system
   - Download and install following the instructions

2. **Verify Installation**:
   Open your terminal/command prompt and type:
   ```bash
   java -version
   javac -version
   ```
   You should see version information for both commands.

### Step 2: Choose an IDE

**Recommended for beginners: IntelliJ IDEA Community Edition**
- Download from: https://www.jetbrains.com/idea/download/
- Free and user-friendly
- Excellent for learning Java

**Alternative: VS Code with Java Extension Pack**
- Download VS Code: https://code.visualstudio.com/
- Install the "Extension Pack for Java" extension

## 💻 Your First Java Program: Hello World

Let's write your very first Java program! This is a tradition in programming - every programmer's first program is usually "Hello World".

### Understanding the Program Structure

```java
// This is a comment - it explains what the code does
// Comments are ignored by the computer

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Breaking Down the Code:

1. **`public class HelloWorld`**:
   - `public`: This class can be accessed from anywhere
   - `class`: Keyword that defines a class (we'll learn more about classes later)
   - `HelloWorld`: The name of our class (must match the filename)

2. **`public static void main(String[] args)`**:
   - This is the main method - where your program starts
   - `public`: Can be accessed from anywhere
   - `static`: Belongs to the class, not an instance
   - `void`: This method doesn't return anything
   - `main`: The name of the method
   - `String[] args`: Command-line arguments (we'll use this later)

3. **`System.out.println("Hello, World!");`**:
   - `System.out`: Standard output stream (your screen)
   - `println`: Print a line and move to the next line
   - `"Hello, World!"`: The text to display
   - `;`: Semicolon ends the statement (required in Java)

## 🎯 Exercises

### Exercise 1: Basic Hello World
Create a program that prints "Hello, World!" to the console.

### Exercise 2: Personal Greeting
Modify the program to print your name instead of "World".

### Exercise 3: Multiple Messages
Print three different messages on separate lines.

### Exercise 4: Comments Practice
Add comments to explain what each part of your program does.

## 📝 Code Examples

Check out the `examples/` folder for:
- `HelloWorld.java` - Basic Hello World program
- `PersonalGreeting.java` - Program with your name
- `MultipleMessages.java` - Printing multiple lines

## 🎯 Exercise Solutions

After you've tried the exercises, check the `solutions/` folder for:
- Step-by-step solutions
- Explanations of the code
- Best practices and tips

## 🔍 Quick Quiz

1. What does `System.out.println()` do?
2. Why do we need the `main` method?
3. What is the purpose of comments in Java?
4. What happens if you forget the semicolon at the end of a statement?

## 📚 Key Takeaways

- Java is a powerful, platform-independent programming language
- Every Java program needs a class and a main method
- `System.out.println()` is used to display text
- Comments help explain your code to others (and yourself)
- Java is case-sensitive and requires semicolons to end statements

## 🚀 What's Next?

Tomorrow (Day 2), we'll learn about:
- Variables and how to store data
- Different data types in Java
- Basic mathematical operations
- How to get input from the user

## 💡 Tips for Success

1. **Practice daily**: Even 30 minutes of coding helps
2. **Type the code yourself**: Don't just copy-paste
3. **Experiment**: Try changing the code and see what happens
4. **Ask questions**: Use GitHub Issues if you get stuck
5. **Be patient**: Learning programming takes time

---

**Congratulations on completing Day 1!** 🎉 You've written your first Java program and taken the first step in your programming journey. Keep up the great work!

*Ready for Day 2? Let's learn about variables and data types!* ➡️
