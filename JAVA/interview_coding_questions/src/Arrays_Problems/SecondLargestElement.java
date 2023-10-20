package Arrays_Problems;

public class SecondLargestElement {
    public void secondLargest(){
        int arr[] = {3,5,6,8,10,11,12};
        int largest = arr[0];
        int secondlargest = -1;
        for(int counter=0; counter<arr.length; counter++){
            if(arr[counter] > largest){
                secondlargest=largest;
                largest=arr[counter];
            } else if (arr[counter] < largest && arr[counter] > secondlargest) {
                secondlargest = arr[counter];
            }
        }
        System.out.println("second largest element in an array = "+secondlargest);
    }
}
