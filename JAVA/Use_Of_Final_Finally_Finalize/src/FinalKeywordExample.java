public class FinalKeywordExample {
    //declaring final variable
    final int age = 18;
    void display(){
        // reassigning value to age variable
        // gives compile time error
//        age = 30;
    }

    public static void main(String[] args) {
        FinalKeywordExample object = new FinalKeywordExample();
        // gives compile time error
        // java: cannot assign a value to final variable age
        object.display();
    }
}
