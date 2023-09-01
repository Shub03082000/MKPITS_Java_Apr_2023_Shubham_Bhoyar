import java.util.Scanner;

public class FiniteEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of Even number : ");
        int number = scanner.nextInt();
//        int count;
        for (int count = 1; count <= number; count++) {
            if (count % 2 == 0) {
                System.out.print(count + " ");
            }
        }
    }
}
