package SelectionSortProgram;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortProgram {
    public int selectionSort(int[] array){
        int minValue = 0;
        int temp;
        for(int i = 0; i < array.length; i++){
            minValue = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[minValue] > array[i]){
                    minValue = j;
                }
                temp = array[i];
                array[i] = array[minValue];
                array[minValue] = temp;
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        return minValue;
    }



//    public static void main(String[] args){
//        int[] array = {38,52,9,18,6,62,13};
//        int temp;
//        int minValue;
//        for(int i=0; i<array.length; i++){
//            minValue = i;
//            for(int j=i+1; j<array.length; j++){
//                if(array[minValue] > array[j]){
//                    minValue = j;
//                }
//            }
//            temp = array[i];
//            array[i] = array[minValue];
//            array[minValue] = temp;
//        }
//        for(int j : array) {
//            System.out.print(j + " ");
//        }
//    }
}
