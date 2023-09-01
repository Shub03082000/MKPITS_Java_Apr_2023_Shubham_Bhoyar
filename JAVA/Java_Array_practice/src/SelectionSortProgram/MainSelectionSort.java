package SelectionSortProgram;

public class MainSelectionSort {
    public static void main(String[] args) {
        int[] array = {38,52,9,18,6,62,13};
        SelectionSortProgram selectionSort1 = new SelectionSortProgram();
        System.out.print("The sorted array using selection sort is : " + selectionSort1.selectionSort(array));

    }
}
