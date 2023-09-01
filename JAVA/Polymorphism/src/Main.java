public class Main {
    public static void main(String[] args) {

//        OverloadingAddition add=new OverloadingAddition();
//        OverridingAddition1 add1 = new OverridingAddition1();
//        int sum2 = add1.addition(5,7);
//       int sum= add.addition(5,6);
//       int sum1= add.addition(9,5,6);


//        System.out.println(sum);
//        System.out.println(sum1);
//        System.out.println(sum2);

        OverloadingAddition add = new OverloadingAddition();
        int sum1 = add.Addition(4,5);
        int sum2 = add.Addition(7,8,9);
        System.out.println("The addition of number by using two parameter in overloading is : "+sum1);
        System.out.println("The addition of number by using three parameter in overloading is : "+sum2);

    }
}