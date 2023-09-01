package HashTable_Class;

import java.util.Hashtable;

public class HashTableClass {
    public static void useOfHashTableClass(){
        Hashtable hashtable1 =  new Hashtable();
        Hashtable hashtable = new Hashtable();
        hashtable.put(101,"Shubham");
        hashtable.put(102, "Sanket");
        hashtable.put(103,"Shivam");
        hashtable.put(104,"Aniket");

        System.out.println(hashtable);

        hashtable1.putAll(hashtable);
        System.out.println(hashtable1);

        System.out.println(hashtable.keySet());

        System.out.println(hashtable.values());

        System.out.println(hashtable.get(103));

        System.out.println(hashtable.equals(hashtable1));

        System.out.println(hashtable.hashCode());

        System.out.println(hashtable.putIfAbsent(104,"ankit"));

        System.out.println(hashtable.size());

        System.out.println(hashtable.clone());

        System.out.println(hashtable.elements());
    }
}
