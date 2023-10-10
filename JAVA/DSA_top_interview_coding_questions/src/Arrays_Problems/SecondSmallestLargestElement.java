package Arrays_Problems;

public class SecondSmallestLargestElement {
    public void ssmallestlargest(){
        int arr[] = {2,5,6,8,10,11,12};
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int counter=0; counter<arr.length; counter++){
            smallest = Math.min(smallest,arr[counter]);
            largest = Math.max(largest, arr[counter]);
        }

        for(int counter=0; counter<arr.length; counter++){
            if(arr[counter] > second_large && arr[counter] != largest){
                second_large = arr[counter];
            }if(arr[counter] < second_small && arr[counter] != smallest){
                second_small = arr[counter];
            }
        }
        System.out.println("Second largest element in an array = " + second_large);
        System.out.println("Second smallest element in an array = " + second_small);
    }
}
