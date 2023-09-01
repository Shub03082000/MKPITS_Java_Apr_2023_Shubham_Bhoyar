package BubbleSort;

public class BubbleSortForStringArray {
    public static void main(String[] args) {
        String temp;
        String[] arr = {"Aniket","Abhishek","Shubham","Sanket","Mohit","Abhilash"};
        for(int i=0; i<arr.length; i++){
            int flag = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if((arr[j].compareTo(arr[j+1]) > 0)){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(String j : arr){
            System.out.print(j + " ");
        }
    }
}
