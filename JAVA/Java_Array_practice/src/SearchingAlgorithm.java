import java.util.Scanner;

public class SearchingAlgorithm {
    public static void main(String[] args) {
        int array[] = {33,22,54,87,23};
        Scanner scanner = new Scanner(System.in);
        int findNumber = scanner.nextInt();

        for(int i=0; i<=4; i++){
            if(findNumber == array[i]){
                System.out.println("The index of value found at " + i);
            }
        }if(findNumber == array.length){
            System.out.println("Not found");
        }
    }
}
