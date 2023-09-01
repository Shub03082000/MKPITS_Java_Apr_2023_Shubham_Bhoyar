package SelectionSortProgram;

public class SelectionSortForStringArray {
    public static void main(String[] args) {
        String temp;
        int minValue;
        String[] arr = {"Aniket","Abhishek","Shubham","Sanket","Mohit","Abhilash"};
        for(int i=0; i<arr.length; i++){
            minValue = i;
            for(int j=i+1; j<arr.length; j++){
                if((arr[minValue].compareTo(arr[j])) >+ 0){
                    minValue = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
        }
        for(String j : arr) {
            System.out.print(j + " ");
        }
    }
}
