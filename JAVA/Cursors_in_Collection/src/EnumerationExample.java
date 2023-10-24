import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public void useOfEnumeration(){
        Vector vector = new Vector();
        for(int counter=0; counter<=10; counter++){
            vector.addElement(counter);
        }
        System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            Integer integer = (Integer) enumeration.nextElement();
            if(integer%2 == 0)
                System.out.println(integer);//0,2,4,6,8,10
        }
        System.out.println(vector);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
