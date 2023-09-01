import java.util.Scanner;

public class WhilePinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPinCorrect = true;
        System.out.println("Enter your pin Number : ");
        int pinNumber = scanner.nextInt();

        while(isPinCorrect!=false){
            if(pinNumber == 1234){
                //System.out.println("Wait for further process......");
                System.out.println("Enter your amount here : ");
                int amount = scanner.nextInt();
                if(amount >= 500){
                    System.out.println("Wait for the money to process.....");
                }else{
                    System.out.println("Enter more than 500/-");
                }
                break;
            }else{
                System.out.println("Your pin is invalid Or incorrect");
                break;
            }
        }
    }
}
