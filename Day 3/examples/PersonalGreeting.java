import java.util.Scanner;

public class PersonalGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Personal Greeting Program ===");
        System.out.print("What's your name? ");
        String name = input.nextLine();
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("What's your favorite color? ");
        input.nextLine(); // Consume the newline character
        String color = input.nextLine();
        
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color + ".");
        System.out.println("Nice to meet you!");
    }
}
