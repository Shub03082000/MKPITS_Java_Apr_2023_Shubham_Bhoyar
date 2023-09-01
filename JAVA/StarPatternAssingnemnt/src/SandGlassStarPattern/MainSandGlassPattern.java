package SandGlassStarPattern;

import java.util.Scanner;

public class MainSandGlassPattern {
    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("## Printing the pattern ##");

        SandGlassStarPattern sandGlassPattern1 = new SandGlassStarPattern();
        sandGlassPattern1.sandGlassStarPattern(rows);
    }
}
