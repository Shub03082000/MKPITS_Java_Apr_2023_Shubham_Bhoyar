package VectorClasses;

import com.sun.security.jgss.GSSUtil;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class VectorClasses {
    public static void useOfVectorClass() {
        Vector vector = new Vector();

//------------------------- Default constructor --> By default size of Default vector constructor is 10. ----------------------//
        System.out.println(vector.capacity());

//------------------------- add() method --> append specified element to the end of the vector  ------------------------------//
        vector.add(10);
        vector.add("Shubham");
        vector.add("aniket");
        vector.add("sonu");
        vector.add(98);
        vector.add(87);
        vector.add(12);
        vector.add("sonu");
        vector.add(56);
        vector.add("sanket");
        vector.add("neha");
        System.out.println("add() method --> append specified element to the end of the vector ");
        System.out.println(vector);

//-------------------- add(int index, element e) --> Inserts the specified element to the specific position in this vector ---------------//
        vector.add(3,'X');
        System.out.println("add(int index, element e) --> Inserts the specified element to the specific position in this vector ");
        System.out.println(vector);

//-------------------- addAll(Collection c) --> It append all the element in specified collection to another vector collection at the end ---------------------//
        Vector vector1 = new Vector<>();
        vector1.add("raj");
        vector1.add("mohit");
        vector1.add("akash");
        System.out.println(vector.addAll(vector1));
        System.out.println("addAll(Collection c) --> It append all the element in specified collection to another vector collection at the end ");
        System.out.println(vector);

//-------------------- addElement(E obj) --> Add specified component to the end of the vector, increasing its size by one ---------------------------//
        vector.addElement('Q');
        System.out.println("addElement(E obj) --> Add specified component to the end of the vector, increasing its size by one ");
        System.out.println(vector);

//-------------------- contains(object o) --> return true if vector contain specified element ------------------------------//
        System.out.println("contains(object o) --> return true if vector contain specified element = " + vector.contains("shubham"));
        System.out.println(vector);

//-------------------- containsAll(Collection c) --> Returns true if this Vector contains all the elements in the specified Collection. -----------------//
        System.out.println("containsAll(Collection c) --> Returns true if this Vector contains all of the elements in the specified Collection");
        System.out.println(vector1.containsAll(vector));

//-------------------- elements() --> Returns an enumeration of the components of this vector. -------------------------------------//
        System.out.println("elements() --> Returns an enumeration of the components of this vector");
        System.out.println(vector.elementAt(7));

/*
* ensureCapacity() --> Increases the capacity of this vector, if necessary, to ensure that it
* can hold at least the number of components specified by the minimum capacity argument.
 * */
        vector.ensureCapacity(20);
        System.out.println("ensureCapacity() --> Increases the capacity of this vector, by passing minimum Capacity as parameter : ");
        System.out.println(vector.capacity());

//---------------- equals(Object o) --> Compares the specified Object with this Vector for equality. -------------------------------//
        System.out.println("equals(Object o) --> Compares the specified Object with this Vector for equality ---------------------");
        System.out.println(vector.equals(vector));

//---------------- 	firstElement() --> Returns the first component (the item at index 0) of this vector. ---------------------------//
        System.out.println("firstElement() --> Returns the first component (the item at index 0) of this vector -------------------");
        System.out.println(vector.firstElement());

//---------------- get(int index) --> Returns the element at the specified position in this Vector -----------------------------//
        System.out.println("get(int index) --> Returns the element at the specified position in this Vector -----------------");
        System.out.println(vector.get(3));

//--------------- hashCode() --> Returns the hash code value for this Vector. ---------------------------------------//
        System.out.println("hashCode() --> Returns the hash code value for this Vector. ----------------");
        System.out.println(vector.hashCode());

/*
* indexOf(Object o)
    Returns the index of the first occurrence of the specified element in this vector,
* or -1 if this vector does not contain the element.
* */
        System.out.println("Return the index of first occurrence of specified element if it contain repeated value" + "\n" + "if it does not contain that specified value so it return -1.");
        System.out.println(vector.indexOf("sonu"));

/*
* indexOf(Object o, int index)
* Returns the index of the first occurrence of the specified element in this vector,
* or -1 if this vector does not contain the element.
* */
        System.out.println("Returns the index of the first occurrence of the specified element in this vector," + "\n" + "searching forwards from index, or returns -1 if the element is not found.");
        System.out.println(vector.indexOf("shivam",1));

//--------------- insertElementAt(E obj, int index) --> Inserts the specified object as a component in this vector at the specified index. ----------------------------//
        System.out.println("insertElementAt(E obj, int index) --> Inserts the specified object as a component in this vector at the specified index.");
        vector.insertElementAt("ankit",5);
        System.out.println(vector);

//--------------- isEmpty() --> Tests if this vector has no components. --------------------------------------//
        System.out.println("isEmpty() --> Tests if this vector has no components -------------------");
        System.out.println(vector.isEmpty());

//--------------- iterator() --> Returns an iterator over the elements in this list in proper sequence. ----------------------//
        System.out.println("iterator() --> Returns an iterator over the elements in this list in proper sequence------------");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

//--------------- lastElement() --> Returns the last component of the vector. ----------------------------------//
        System.out.println("lastElement() --> Returns the last component of the vector. ----------------");
        System.out.println(vector.lastElement());

//------ lastIndexOf(Object o) -->  Returns the index of the last occurrence of the specified element in this vector,
// or -1 if this vector does not contain the element.
        System.out.println("lastIndexOf(Object o) -->  Returns the index of the last occurrence of the specified element in this vector," + "\n" + "or -1 if this vector does not contain the element.");
        System.out.println(vector.lastIndexOf("sonu"));

//------ lastIndexOf(Object o, int index) --> Returns the index of the last occurrence of the specified
// element in this vector, searching backwards from index, or returns -1 if the element is not found.
        System.out.println("lastIndexOf(Object o, int index) --> Returns the index of the last occurrence of the specified" + "\n" + "element in this vector, searching backwards from index, or returns -1 if the element is not found.");
        System.out.println(vector.lastIndexOf("sonu",14));

//-------- listIterator() --> Returns a list iterator over the elements in this list (in proper sequence). -----------------------------//
        System.out.println("listIterator() --> Returns a list iterator over the elements in this list (in proper sequence)");
        Iterator iterator1 = vector.listIterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next() + " ");
        }

//-------------------------------------------- remove(int index) --------------------------------------------------//
        System.out.println(vector);
        System.out.println("remove(int index) --> Removes the element at the specified position in this Vector");
        System.out.println(vector.remove(4));
        System.out.println("remove(Object o) --> Removes the first occurrence of the specified element in this Vector If the Vector does not contain the element, it is unchanged.");
        System.out.println(vector.remove("sanket"));
        System.out.println("removeAll(Collection c) --> Removes from this Vector all of its elements that are contained in the specified Collection.");
        System.out.println(vector.removeAll(vector1));
        System.out.println("removeAllElements() --> Removes all components from this vector and sets its size to zero.");
        vector1.removeAllElements();
        System.out.println(vector1);
        System.out.println("removeElement(Object obj) --> Removes the first (lowest-indexed) occurrence of the argument from this vector.");
        System.out.println(vector1.removeElement("12"));
        System.out.println("removeElementAt(int index) --> Deletes the component at the specified index.");
        vector.removeElementAt(10);
        System.out.println(vector);


//------------------------------- set() --------------------------------------------------------//
        System.out.println("set(int index, E element) --> Replaces the element at the specified position in this Vector with the specified element.");
        System.out.println(vector.set(0,"shivam"));
        System.out.println(vector);
        System.out.println("setElementAt(E obj, int index) --> Sets the component at the specified index of this vector to be the specified object.");
        vector.setElementAt("rohit",7);
        System.out.println(vector);
        System.out.println("setSize(int newSize) --> Sets the size of this vector.");
        vector.setSize(15);
        System.out.println(vector);
        System.out.println("size() --> Returns the number of components in this vector.");
        System.out.println(vector.size());

//----------------- trimToSize() --> Trims the capacity of this vector to be the vector's current size. -----------------------//
        System.out.println("trimToSize() --> Trims the capacity of this vector to be the vector's current size.");
        vector.trimToSize();
        System.out.println(vector);

//----------------- subList(int fromIndex, int toIndex) --> Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive. ---------------------//
        System.out.println("subList(int fromIndex, int toIndex) --> Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive");
        System.out.println(vector.subList(11,15));

//---------------- toString() --> Returns a string representation of this Vector, containing the String representation of each element. -----------------------//
        System.out.println("toString() --> Returns a string representation of this Vector, containing the String representation of each element");
        System.out.println(vector.toString());

//--------------- getClass() --> Returns the runtime class of this Object -----------------------------------------------------------------------------------------//
        System.out.println("getClass() --> Returns the runtime class of this Object");
        System.out.println(vector.getClass());

//--------------- copyInto(Object[] anArray) --> Copies the components of this vector into the specified array. -----------------------------------------------------------------------------------------//
        Object[] objects = new Object[vector.size()];
        vector.copyInto(objects);
        System.out.println("copyInto(Object[] anArray) --> Copies the components of this vector into the specified array. ");
        for(int index=0; index<objects.length; index++){
            System.out.print(vector.get(index) + " ");
        }

    }
}
