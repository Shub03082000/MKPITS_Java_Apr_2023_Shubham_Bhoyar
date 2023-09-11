package WriteHashMapObject;

import java.io.*;
import java.util.HashMap;

public class WriteHashMapObject {
    public void readWriteHashMapObject() throws IOException, ClassNotFoundException {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"sanket");
        hashMap.put(11,"aniket");
        hashMap.put(12,"shivam");

        ReadWriteHashMapObject.readObject(hashMap);
        ReadWriteHashMapObject.writeObject(hashMap);

    }
}
