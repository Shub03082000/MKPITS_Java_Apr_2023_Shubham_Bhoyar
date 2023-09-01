/**
 * If we create any final class, we cannot extend or inherit it.....
 */
final class FinalKeywordWithClass {
    void getFinalClass1(){
        System.out.println("This is my method 1");
    }
}
//---------- If we try to inherit final class we cannot inherit it as it is a final
class Demo extends FinalKeywordWithClass{
    void getFinalClass2(){
        System.out.println("This is my method 2");
    }

    public static void main(String[] args) {
        Demo demo1 = new Demo();
        demo1.getFinalClass1();
    }
}


