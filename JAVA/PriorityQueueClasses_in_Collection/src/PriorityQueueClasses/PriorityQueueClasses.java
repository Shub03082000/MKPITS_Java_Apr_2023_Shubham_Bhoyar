package PriorityQueueClasses;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueClasses {
    public static void useOfPriorityQueueClasses(){
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add("shubham");
//        priorityQueue.add(89);
//        priorityQueue.add(90);
        priorityQueue.add("neha");
        priorityQueue.add("ankit");
        priorityQueue.add("shivam");
        priorityQueue.add("raj");
        System.out.println(priorityQueue);

//-------- contains() --> Returns true if this queue contains the specified element. ---------------------------------//
        System.out.println("contains() --> Returns true if this queue contains the specified element");
        System.out.println(priorityQueue.contains("neha"));

//-------- Iterator() --> Returns an iterator over the elements in this queue. ---------------------------------------//
        System.out.println("Iterator() --> Returns an iterator over the elements in this queue");
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

//--------- offer(E e) --> Inserts the specified element into this priority queue. -----------------------------------//
        System.out.println("offer(E e) --> Inserts the specified element into this priority queue");
        System.out.println(priorityQueue.offer("pravin"));
        System.out.println(priorityQueue);

//--------- peek() --> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. --------------//
        System.out.println("peek() --> Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty");
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

//-------- poll() --> Retrieves and removes the head of this queue, or returns null if this queue is empty. ----------------------//
        System.out.println("poll() --> Retrieves and removes the head of this queue, or returns null if this queue is empty");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

//-------- remove(Object o) --> Removes a single instance of the specified element from this queue, if it is present. --------------//
        System.out.println(priorityQueue.remove("pravin"));
        System.out.println(priorityQueue);

//-------- size() --> Returns the number of elements in this collection. ---------------------------------------------//
        System.out.println(priorityQueue.size());
        
    }
}
