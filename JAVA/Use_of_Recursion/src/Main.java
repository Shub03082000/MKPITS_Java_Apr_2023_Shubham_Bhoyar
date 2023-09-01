import FindFactorial.FindFactorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to print factorial : ");
        int number = scanner.nextInt();
        FindFactorial.factorial(number);
    }
}