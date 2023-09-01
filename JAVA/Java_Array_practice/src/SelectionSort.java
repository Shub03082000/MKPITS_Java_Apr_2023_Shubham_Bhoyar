public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {9,12,7,23,5};
        int tempararyVariable;
        for(int i = 0; i < num.length; i++){
            for(int j=i+1; j<num.length; j++){
                if(num[i] > num[j]){
                    tempararyVariable = num[i];
                    num[i] = num[j];
                    num[j] = tempararyVariable;
                }
            }
            for(i=0; i<=num.length; i++){
                System.out.print(num[i] + " ");
            }
        }
    }
}
