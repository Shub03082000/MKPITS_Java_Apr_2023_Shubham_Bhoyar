package VectorExample;

import java.util.Vector;

public class DemoVector {
    public void useOfVector(){
        Vector vector = new Vector();
        System.out.println(vector.capacity()); //10
        for(int counter = 1; counter <= 10; counter++){
            vector.addElement(counter);
        }
        System.out.println(vector.capacity());
        vector.addElement("A");
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
