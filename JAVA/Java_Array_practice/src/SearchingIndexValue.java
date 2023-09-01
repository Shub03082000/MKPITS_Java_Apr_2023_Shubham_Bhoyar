public class SearchingIndexValue {
    public void searchValue(int findNumber){
        int arr[] = {33,22,54,87,23};
//        int flag;
        for(int i=0; i<=4; i++){
            if(findNumber == arr[i]){
                System.out.println("The index of value found at " + i);
            }
        }if(findNumber == arr.length){
            System.out.println("Not found");
        }

    }

}
