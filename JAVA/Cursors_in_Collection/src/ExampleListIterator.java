import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ExampleListIterator {
    public void useOfListIterator(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("Shubham");
        linkedList.add("sanket");
        linkedList.add("aniket");
        linkedList.add("rohit");
        linkedList.add("shivam");
        System.out.println(linkedList);

        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            String str = (String) listIterator.next();
            if(str.equals("aniket")){
                listIterator.remove();//[shubham,sanket,rohit,shivam]
            } else if (str.equals("rohit")) {
                listIterator.add("abhishek");//[shubham,sanket,rohit,abhishek,shivam]
            } else if (str.equals("shivam")) {
                listIterator.set("raj");//[shubham,sanket,rohit,abhishek,raj]
            }
        }
        System.out.println(linkedList);
    }
}
