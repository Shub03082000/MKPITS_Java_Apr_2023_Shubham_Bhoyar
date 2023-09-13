package ForEachMethodInCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(23,32,2,21,65,22,65,80));
        arrayList.forEach(number->{
            if(number%2 == 0) {
                System.out.print(number + " ");
            }
        });
        System.out.println();
    }
}
