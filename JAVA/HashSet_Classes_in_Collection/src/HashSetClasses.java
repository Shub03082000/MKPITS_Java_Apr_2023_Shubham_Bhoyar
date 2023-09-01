import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.jar.JarOutputStream;

public class HashSetClasses {
    public static void useOfHashSetClasses() {
        HashSet hashSet = new HashSet();
        hashSet.add(90);
        hashSet.add(70);
        hashSet.add(120);
        hashSet.add(60);
        hashSet.add(150);
        System.out.println(hashSet);

//---------- clone() --> Returns a shallow copy of this HashSet instance: the elements themselves are not cloned. ----------------//
        System.out.println("clone() --> Returns a shallow copy of this HashSet instance: the elements themselves are not cloned");
        System.out.println(hashSet.clone());

//---------- contains(Object o) --> Returns true if this set contains the specified element. -------------//
        System.out.println("contains(Object o) --> Returns true if this set contains the specified element");
        System.out.println(hashSet.contains(70));
        System.out.println(hashSet.contains(80));

//----------- isEmpty() --> Returns true if this set contains no elements. -------------------------------//
        System.out.println("isEmpty() --> Returns true if this set contains no elements");
        System.out.println(hashSet.isEmpty());

//----------- iterator() --> Returns an iterator over the elements in this set. --------------------------//
        Iterator iterator = hashSet.iterator();
        System.out.println("iterator() --> Returns an iterator over the elements in this set");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

//------------ remove(Object o) --> Removes the specified element from this set if it is present. ----------------//
        System.out.println("remove(Object o) --> Removes the specified element from this set if it is present");
        System.out.println(hashSet.remove(70));

//------------ size() --> Returns the number of elements in this set (its cardinality). -------------------------//
        System.out.println("size() --> Returns the number of elements in this set (its cardinality)");
        System.out.println(hashSet.size());


        Integer[] numArray1 = {87,45,23,65,90,50};
        Integer[] numArray2 = {89,12,65,56,90,50};

        HashSet hashSet1 = new HashSet(Arrays.asList(numArray1));
        HashSet hashSet2 = new HashSet(Arrays.asList(numArray2));
        System.out.println(hashSet1);
        System.out.println(hashSet2);

//------------------------ UnionOfHashSet -----------------------------------------------//
        System.out.println("Union of hashset : ");
        HashSet unionOfSet1andSet2 = new HashSet<>();
        unionOfSet1andSet2.addAll(hashSet1);
        unionOfSet1andSet2.addAll(hashSet2);
        System.out.println(unionOfSet1andSet2);

//--------------------- intersection of Se1 and Set2 --------------------------------------//
        HashSet intersectionOfSet1andSet2 = new HashSet(hashSet1);
        intersectionOfSet1andSet2.retainAll(hashSet2);
        System.out.println(intersectionOfSet1andSet2);

//-------------------- difference ---------------------------------------------------------//
        hashSet1.removeAll(hashSet1);
        System.out.println(hashSet1);

    }
}
