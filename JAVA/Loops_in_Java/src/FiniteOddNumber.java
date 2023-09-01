import java.util.Scanner;

public class FiniteOddNumber {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of odd number : ");
        int number = scanner.nextInt();
        for(int count = 0; count <= number; count++){
            if(count % 2 != 0){
                System.out.println(count);
            }
        }
    }
}
