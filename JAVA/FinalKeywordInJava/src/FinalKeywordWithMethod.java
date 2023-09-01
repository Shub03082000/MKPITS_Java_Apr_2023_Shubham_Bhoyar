/**
 * If we create any final method, we cannot override it
 * Method overriding conditions:--
 * 1. same method names
 * 2. within different class
 * 3. same arguments
 *    3.1- number of parameter
 *    3.2- type of parameter
 *    3.3- sequence of parameter
 * 4. inheritance (IS-A relationship)
 */
public class FinalKeywordWithMethod {
   final void getFinalMethod(){
       System.out.println("This is my method 1");
   }
}

//Without final keyword.... method runs successfully but when we use final method it will throw an error
//getFinalMethod() in Test cannot override getFinalMethod() in FinalKeywordWithMethod
//  overridden method is final
class Test extends FinalKeywordWithMethod{
    void getFinalMethod(){
        System.out.println("This is my method 2");
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.getFinalMethod();
    }
}
