import java.util.Scanner;

public class Solution4_PersonalQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Personal Quiz ===");
        System.out.println("Let's get to know you better!");
        System.out.println();
        
        System.out.print("What's your name? ");
        String name = input.nextLine();
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("What's your favorite food? ");
        input.nextLine(); // Consume the newline character
        String favoriteFood = input.nextLine();
        
        System.out.print("Do you like programming? (true/false): ");
        boolean likesProgramming = input.nextBoolean();
        
        System.out.print("What's your favorite number? ");
        int favoriteNumber = input.nextInt();
        
        System.out.println();
        System.out.println("=== Your Profile ===");
        System.out.println("Hi " + name + "! You are " + age + " years old and love " + favoriteFood + ".");
        
        if (likesProgramming) {
            System.out.println("Since you like programming, you'll love Java!");
        } else {
            System.out.println("Don't worry, Java is fun and you'll learn to love it!");
        }
        
        System.out.println("Your favorite number " + favoriteNumber + " is special to you!");
        System.out.println("Thanks for taking the quiz, " + name + "!");
    }
}
