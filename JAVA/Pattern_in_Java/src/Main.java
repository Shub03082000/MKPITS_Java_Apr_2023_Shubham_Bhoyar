import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        while (num != 0) {
            Scanner scanner = new Scanner(System.in);

//------------------------------- Right Angle triangle pattern normal and reverse case ------------------------//
            System.out.println("Enter case number here from \n 1 \n 2 \n 3 \n 4 \n 5 \n 6  : ");
            int pattern = scanner.nextInt();
            System.out.println("Enter number of lines in pattern : ");
            int number1 = scanner.nextInt();
            System.out.println("======================================= Right Angle triangle pattern normal and reverse case ================================================");
            ServicePattern servicePattern = new ServicePattern();
            servicePattern.Pattern(pattern, number1);

        }
    }
}

