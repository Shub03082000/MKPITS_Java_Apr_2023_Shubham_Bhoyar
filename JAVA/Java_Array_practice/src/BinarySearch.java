public class BinarySearch {
    boolean status;
    public boolean isFoundMethod(int number){
        int array[] = {1,25,3,50,5,6,7,36,9};
        int minValue = 0;
        int maxValue = 9;
        int midValue;

        for(midValue = (minValue + maxValue)/2; midValue<=maxValue; midValue = (minValue + maxValue)/2){
            if(number == array[midValue]){
                status=true;
                return status;
            } if(number > array[midValue]){
                minValue = midValue + 1;
            }else{
                maxValue = midValue - 1;
            }
        }
        return status;
    }
}
