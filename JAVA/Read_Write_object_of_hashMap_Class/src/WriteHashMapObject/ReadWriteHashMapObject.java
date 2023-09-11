package WriteHashMapObject;

import java.io.*;
import java.util.HashMap;

public class ReadWriteHashMapObject {
    public static void readObject(HashMap hashMap) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File("hashmap.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(hashMap);
        objectOutputStream.close();
    }

    public static void writeObject(HashMap hashMap) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File("hashmap.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        HashMap hashMap1 = (HashMap) objectInputStream.readObject();
        System.out.println(hashMap1);
        objectInputStream.close();
    }
}
