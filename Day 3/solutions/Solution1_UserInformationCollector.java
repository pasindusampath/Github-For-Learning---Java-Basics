import java.util.Scanner;

public class Solution1_UserInformationCollector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== User Information Collector ===");
        System.out.print("What's your full name? ");
        String fullName = input.nextLine();
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        System.out.print("What's your favorite color? ");
        input.nextLine(); // Consume the newline character
        String favoriteColor = input.nextLine();
        
        System.out.print("What's your dream job? ");
        String dreamJob = input.nextLine();
        
        System.out.println();
        System.out.println("Hello, " + fullName + "! You are " + age + " years old.");
        System.out.println("Your favorite color is " + favoriteColor + " and your dream job is " + dreamJob + ".");
        System.out.println("That sounds amazing!");
    }
}
