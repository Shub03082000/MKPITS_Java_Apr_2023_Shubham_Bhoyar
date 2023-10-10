package Arrays_Problems;
import java.lang.*;

public class SecondSmallestElement {
    private static final int INT_MAX = 0;
//    private int INT_MAX;

    public void secondSmallest(){
        int arr[] = {2,3,5,6,8,10,11,12};
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for(int counter=0; counter< arr.length; counter++){
            if(arr[counter] < smallest){
                secondSmallest = smallest;
                smallest = arr[counter];
            } else if (arr[counter] != smallest && arr[counter] < secondSmallest) {
                secondSmallest = arr[counter];
            }
        }
        System.out.println("Second smallest element in an array = " + secondSmallest);
    }
}
