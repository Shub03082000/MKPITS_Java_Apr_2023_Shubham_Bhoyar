import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number here : ");
        int number = scanner.nextInt();
        for(int row=number; row>=1; row--){

            for(int column=number; column>row; column--){
                System.out.print(" ");
            }

            for(int k=1; k<(row*2); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
