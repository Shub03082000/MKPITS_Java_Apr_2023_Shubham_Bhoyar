public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {9,12,7,23,5};
        int temparoyVariable;
        for(int i=0; i<4; i++){
            for(int j=0; j<4-i; j++){
                if(num[j] > num[j+1])
                {
                    temparoyVariable = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temparoyVariable;
                }
            }
        }
        for(int i=0; i<=4; i++){
            System.out.println(num[i]);
        }
    }
}
