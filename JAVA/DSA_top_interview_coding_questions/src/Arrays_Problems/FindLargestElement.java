package Arrays_Problems;

public class FindLargestElement {
    public void largestElement(){
        int arr[] = {1,2,3,4,5};
        int largestElement = arr[0];
        for(int counter=0; counter<arr.length; counter++){
            if(arr[counter] > largestElement){
                largestElement = arr[counter];
            }
        }
        System.out.println("The largest element in array is = "+largestElement);
    }
}
