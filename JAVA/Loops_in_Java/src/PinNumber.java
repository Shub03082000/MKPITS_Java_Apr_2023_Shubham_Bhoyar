import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args){
        boolean isPinCorrect = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin : ");
        int pinNumber = scanner.nextInt();
        do{
            if(pinNumber == 1234 || pinNumber < 1234){
                System.out.println("Wait for further process");
                break;
            }else{
                System.out.println("Your pin is invalid");
                break;
            }

        }while(!isPinCorrect);
    }
}
