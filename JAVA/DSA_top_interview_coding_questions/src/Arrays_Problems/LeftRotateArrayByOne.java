package Arrays_Problems;

public class LeftRotateArrayByOne {
    public void leftRotate(){
        int arr[] = {1,2,3,4,5};
        int temp = arr[0]; // storing the first element of array in a variable
        for(int counter=0; counter<arr.length-1; counter++){
            arr[counter] = arr[counter+1];
        }
        arr[arr.length - 1] = temp; // assigned the value of variable at the last index
        for(int counter=0; counter<arr.length; counter++){
            System.out.print(arr[counter] + " ");
        }
    }
}
