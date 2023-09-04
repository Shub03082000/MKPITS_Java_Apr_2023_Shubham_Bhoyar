//parent class
public class Person {
    //instance variable of the parent class
    private String name;
    private int age;

    //constructor of the parent class to initialize the values
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getter method to access the values
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}
