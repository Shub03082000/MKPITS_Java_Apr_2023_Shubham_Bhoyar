import HashSet_Example.HashSetDemo;
import LinkedHashSet_Example.LinkedHashSetDemo;
import TreeSet_Example.TreeSetDemo;

public class Main {
    public static void main(String[] args) {
        //---------------- HashSet Example -----------------------------------//
        HashSetDemo hashSetDemo = new HashSetDemo();
        hashSetDemo.useHashSet();

        //---------------- LinkedHashSet Example -----------------------------//
        LinkedHashSetDemo linkedHashSetDemo = new LinkedHashSetDemo();
        linkedHashSetDemo.useOfLinkedHashSet();

        //--------------- TreeSet Example ------------------------------------//
        TreeSetDemo treeSetDemo = new TreeSetDemo();
        treeSetDemo.useOfTreeSet();
    }
}