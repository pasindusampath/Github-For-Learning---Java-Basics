import java.util.Scanner;

public class StoryGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Story Generator ===");
        System.out.println("Let's create a fun story together!");
        System.out.println();
        
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        
        System.out.print("Enter an animal: ");
        String animal = input.nextLine();
        
        System.out.print("Enter a color: ");
        String color = input.nextLine();
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.print("Enter an adjective: ");
        input.nextLine(); // Consume the newline character
        String adjective = input.nextLine();
        
        System.out.println();
        System.out.println("=== Your Story ===");
        System.out.println("Once upon a time, " + name + " found a " + color + " " + animal + ".");
        System.out.println("The " + animal + " was very " + adjective + " and had " + number + " spots.");
        System.out.println(name + " and the " + animal + " became best friends!");
        System.out.println("They went on many adventures together.");
        System.out.println("The end.");
    }
}
