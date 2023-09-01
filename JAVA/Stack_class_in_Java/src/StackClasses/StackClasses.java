package StackClasses;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class StackClasses {
    public static void useOfStackClass() {
        Stack stack1 = new Stack();
        Stack stack = new Stack<>();
        stack.add(98);
        stack.add(87);
        stack.add(76);
        stack.add(23);
        stack.add(34);
        stack.add(64);
        stack.add(78);
        System.out.println(stack);

//-------------- peek() --> Looks at the object at the top of this stack without removing it from the stack ---------------------//
        System.out.println("peek() --> Looks at the object at the top of this stack without removing it from the stack");
        System.out.println(stack.peek());
        System.out.println(stack);

//------------- pop() --> Removes the object at the top of this stack and returns that object as the value of this function. --------------//
        System.out.println("pop() --> Removes the object at the top of this stack and returns that object as the value of this function");
        System.out.println(stack.pop());
        System.out.println(stack);

//------------- push(E item) --> Pushes an item onto the top of this stack. --------------------------------------//
        System.out.println("push(E item) --> Pushes an item onto the top of this stack.");
        System.out.println(stack.push("shubham"));
        System.out.println(stack);

//------------ search(Object o) --> Returns the 1-based position where an object is on this stack. ----------------------//
        System.out.println("search(Object o) --> Returns the 1-based position where an object is on this stack");
        System.out.println(stack.search(23));
        System.out.println(stack);

//----------- empty() --> Tests if this stack is empty. ---------------------------------------------------//
        System.out.println("empty() --> Tests if this stack is empty");
        System.out.println(stack.empty());
        System.out.println(stack1.empty());

//---------- clone() --> Returns a clone of this vector ----------------------------------------------------//
        System.out.println("clone() --> Returns a clone of this vector");
        System.out.println(stack.clone());
        System.out.println(stack);


//---------- getClass() --> Returns the runtime class of this Object ---------------------------------------//
        System.out.println("getClass() --> Returns the runtime class of this Object");
        System.out.println(stack.getClass());

//---------- clear() --> Removes all of the elements from this Vector --------------------------------------//
        System.out.println("clear() --> Removes all of the elements from this Vector");
        stack.clear();
        System.out.println(stack);

    }
}
