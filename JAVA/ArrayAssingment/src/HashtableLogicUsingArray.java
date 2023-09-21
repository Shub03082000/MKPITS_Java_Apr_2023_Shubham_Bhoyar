import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HashtableLogicUsingArray {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of elements you want to store : ");
//        int number = scanner.nextInt();
        int[] numbers = new int[10];
        System.out.println("Enter elements of the array : ");
        for(int counter=0; counter<numbers.length; counter++){
           value  = scanner.nextInt();
            numbers[value%10] = value;
        }
        System.out.println("Arrays of elements by using hashtable logic ");
       for(int counter=0; counter<numbers.length; counter++){
           System.out.println(numbers[counter]);
       }

       int count=0;
       for(int counter = 0; counter < numbers.length; counter++){
           if(numbers[counter] != 0){
               count++;
           }
       }
       double loadFactor = (double) count/ numbers.length;
        System.out.println("Load factor = " + loadFactor);

        int newNumbers[] = new int [count];
        for(int counter=0, newCounter=0; counter<10; counter++){
            if(numbers[counter] != 0){
                newNumbers[newCounter] = numbers[counter];
                newCounter++;
            }
        }

        Arrays.sort(newNumbers);
        for(int num: newNumbers){
            System.out.println(num);
        }



    }
}
