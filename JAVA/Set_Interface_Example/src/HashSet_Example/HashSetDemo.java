package HashSet_Example;

import java.util.HashSet;

public class HashSetDemo {
    public void useHashSet(){
        HashSet hashSet = new HashSet();
        hashSet.add("shubham");
        hashSet.add("aniket");
        hashSet.add("B");
        hashSet.add(10);
        hashSet.add(null);
        System.out.println(hashSet.add("shubham"));//false
        System.out.println(hashSet);
    }
}
