import java.util.Scanner;

public class ForLoopNaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number here : ");
        int number = scanner.nextInt();
        for (int initializer = 1; initializer <= number; initializer++){
            System.out.println(initializer);
        }
    }
}
