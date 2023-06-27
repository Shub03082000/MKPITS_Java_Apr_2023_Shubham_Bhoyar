import java.util.Scanner;

public class StarPatternRightAngleUpperHalf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number here : ");
        int number = scanner.nextInt();
        for(int i=1; i<=number; i++){
            //SPACES
            for(int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //LOWER HALF
        for(int i=number; i>=1; i--){
            //SPACES
            for(int j=1; j<=number-i; j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
