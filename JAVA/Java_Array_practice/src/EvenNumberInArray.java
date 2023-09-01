import java.util.Scanner;

public class EvenNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int arr[] = scanner.nextInt();
//        for(int i=0; i<5; i++){
        int arr[] = {23,34,12,45,87,56,34};
        for(int row = 0; row < arr.length; row++){
            if(arr[row]%2 == 0){
                System.out.println("The even number is : " + arr[row]);
            }else{
                System.out.println("The odd number is : " + arr[row]);
            }
        }
    }
}
