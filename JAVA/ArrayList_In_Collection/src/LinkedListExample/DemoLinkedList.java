package LinkedListExample;

import java.util.LinkedList;

public class DemoLinkedList {
    public void useOfLinkedList(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("shubham");
        linkedList.add(30);
        linkedList.add(null);
        linkedList.add("shubham");
        linkedList.set(0,"aniket");
        linkedList.add(0,"shivam");
        linkedList.removeLast();
        linkedList.addFirst(90);
        System.out.println(linkedList);


    }
}
