package LinkedHashSet_Example;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public void useOfLinkedHashSet(){
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("shubham");
        linkedHashSet.add("aniket");
        linkedHashSet.add("B");
        linkedHashSet.add(10);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet.add("shubham"));
        System.out.println(linkedHashSet);
    }
}
