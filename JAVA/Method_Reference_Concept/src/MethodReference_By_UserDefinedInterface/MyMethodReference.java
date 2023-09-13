package MethodReference_By_UserDefinedInterface;

public class MyMethodReference {
    public void displayOdd(){
        System.out.println("Odd Number is ");
        for(int counter=1; counter<=100; counter++){
            if(counter%2 != 0){
                System.out.print(counter + " ");
            }
        }
        System.out.println();
    }
}
