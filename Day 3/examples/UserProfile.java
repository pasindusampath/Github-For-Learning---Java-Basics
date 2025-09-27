import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== User Profile Creator ===");
        System.out.println("Let's create your profile!");
        System.out.println();
        
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your height in feet: ");
        double height = input.nextDouble();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();
        
        System.out.print("Enter your favorite hobby: ");
        input.nextLine(); // Consume the newline character
        String hobby = input.nextLine();
        
        System.out.println();
        System.out.println("=== Your Profile ===");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " feet");
        System.out.println("Student: " + isStudent);
        System.out.println("Favorite Hobby: " + hobby);
        System.out.println();
        System.out.println("Welcome, " + firstName + "!");
    }
}
