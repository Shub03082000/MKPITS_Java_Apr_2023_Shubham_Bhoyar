import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public void useOfIterator(){
        ArrayList arrayList = new ArrayList();
        for(int counter=0; counter<=10; counter++){
            arrayList.add(counter);
        }
        System.out.println(arrayList);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Integer integer = (Integer) iterator.next();
            if(integer%2 == 0)
                System.out.println(integer);//0,2,4,6,8,10
            else
                iterator.remove();
        }
        System.out.println(arrayList);//[0,2,4,6,8,10]
    }
}
