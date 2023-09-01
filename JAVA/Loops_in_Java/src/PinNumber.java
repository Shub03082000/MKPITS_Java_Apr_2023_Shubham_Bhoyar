import java.util.Scanner;

public class PinNumber {
    public static void main(String[] args){
        boolean isPinCorrect = true;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your pin number : ");
        int pinNumber = scanner.nextInt();

        do{
            if(pinNumber == 1234 && pinNumber != 0){
                //System.out.println("Wait for further process......");
                System.out.println("Enter your amount here : ");
                int amount = scanner.nextInt();
                if(amount >= 500){
                    System.out.println("Wait for the money to process.....");
                }else{
                    System.out.println("Enter more than 500/-");
                }
            }else{
                System.out.println("Your pin is invalid Or incorrect");
            }

        }while(!isPinCorrect);
    }
}
