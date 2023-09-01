import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to search in the array : " );
        int findNumber = scanner.nextInt();
//        SearchingIndexValue searchingIndex = new SearchingIndexValue();
//        searchingIndex.searchValue(findNumber);

        //================================ Binary Search ===========================================================
        BinarySearch binarySearch = new BinarySearch();
        if(binarySearch.isFoundMethod(findNumber)){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }
    }
}