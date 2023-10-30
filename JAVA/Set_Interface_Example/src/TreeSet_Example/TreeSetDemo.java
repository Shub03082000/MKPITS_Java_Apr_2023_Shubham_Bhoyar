package TreeSet_Example;

import java.util.TreeSet;

public class TreeSetDemo {
    public void useOfTreeSet(){
        TreeSet treeSet = new TreeSet();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("a");
        treeSet.add("L");
        treeSet.add("Z");
        System.out.println(treeSet);//[A,B,L,Z,a] -> It display according to its unicode value
        treeSet.add(new Integer(10));
        System.out.println(treeSet);//Class Cast Exception
    }
}
