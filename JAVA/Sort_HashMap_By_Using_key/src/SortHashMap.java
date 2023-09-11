import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.sort;

public class SortHashMap {
    public void sortHashMapByUsingKey(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList();
        hashMap.put(105,"shubham");
        hashMap.put(104,"aniket");
        hashMap.put(102,"shivam");
        hashMap.put(103,"raj");
        hashMap.put(107,"sanket");
        hashMap.put(109,"mohit");
        hashMap.put(111,"bhagyashri");
        hashMap.put(113,"pranay");
        hashMap.put(112,"abhishek");
        hashMap.put(114,"teju");
        TreeMap<Integer,String> treeMap = new TreeMap<>(hashMap);

        System.out.println("sorted hashmap in key format : " + treeMap);
        Set set = treeMap.entrySet();
        System.out.println(set);
//        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
//            arrayList.add(entry.getValue());
//        }
        LinkedList<Map.Entry<Integer,String>> linkedList = new LinkedList<>();
        Collections.sort(linkedList, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Iterator<Map.Entry<Integer,String >> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
