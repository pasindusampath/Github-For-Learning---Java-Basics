import java.util.Scanner;

public class Solution3_MadLibsGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Mad Libs Generator ===");
        System.out.println("Let's create a funny story!");
        System.out.println();
        
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        System.out.println();
        System.out.println("=== Your Story ===");
        System.out.println("Once upon a time, a " + adjective + " " + noun + " " + verb + " over " + number + " fences.");
        System.out.println("The " + noun + " was very happy and continued " + verb + " all day long!");
        System.out.println("The end.");
    }
}
