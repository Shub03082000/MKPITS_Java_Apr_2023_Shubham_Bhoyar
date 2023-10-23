import java.util.ArrayList;

public class DemoArrayList {
    public void useOfArrayList(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add(10);
        arrayList.add("A");
        arrayList.add(null);
        System.out.println(arrayList); //[A,10,A,null]
        arrayList.remove(2);
        System.out.println(arrayList);//[A,10,null]
        arrayList.add(2,"shubham");
        arrayList.add("M");
        System.out.println(arrayList);//[A,10,shubham,null,M]
    }
}
