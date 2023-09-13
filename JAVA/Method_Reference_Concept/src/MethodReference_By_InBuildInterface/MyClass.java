package MethodReference_By_InBuildInterface;

public class MyClass {
    public static void displayEvenNumber(){
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("Even Number is ");
                for(int counter=1; counter<=100; counter++){
                    if(counter%2 == 0){
                        System.out.print(counter + " ");
                    }
                }
            }
        };
        runnable.run();
        System.out.println();
    }
}
