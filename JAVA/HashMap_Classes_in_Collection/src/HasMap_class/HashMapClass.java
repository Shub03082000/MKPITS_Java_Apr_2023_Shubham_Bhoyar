package HasMap_class;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {
    public static void useOfHashMapClass() {
        HashMap hashMap1 = new HashMap<>();
        HashMap hashMap = new HashMap<>();
        hashMap.put(50,"shubham");
        hashMap.put(51,"bhagyashri");
        hashMap.put(52,"abhishek");
        hashMap.put(53,"pranay");
        System.out.println(hashMap);

        Set set =hashMap.entrySet();
        System.out.println(set);

        Set set1 = hashMap.keySet();
        System.out.println(set1);

        System.out.println(hashMap.values());

        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        System.out.println(hashMap.containsKey(52));

        System.out.println(hashMap1.containsValue("shubham"));

        System.out.println(hashMap.get(53));

        System.out.println(hashMap.getOrDefault(55,"pranay"));

    }
}
