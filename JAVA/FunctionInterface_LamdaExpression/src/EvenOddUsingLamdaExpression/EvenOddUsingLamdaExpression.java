package EvenOddUsingLamdaExpression;

public class EvenOddUsingLamdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () ->{
            System.out.println("Even Number ");
            for(int iterator=1; iterator<=100; iterator++) {
                if (iterator % 2 == 0) {
                    System.out.print(iterator + " ");
                }
            }
        };
        runnable.run();
        System.out.println();

        Runnable runnable1 = () ->{
            System.out.println("Odd number ");
            for(int iterator=1; iterator<=100; iterator++){
                if(iterator%2 != 0){
                    System.out.print(iterator + " ");
                }
            }
        };
        runnable1.run();
    }
}
