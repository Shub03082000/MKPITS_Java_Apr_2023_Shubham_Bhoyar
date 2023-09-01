public class Main {
    public static void main(String[] args)  {
        //======================= Try catch finally ======================================= 
//        ArrayProgram arrayProgram = new ArrayProgram();
//        arrayProgram.exceptionHandling();

//        try {
//            ArrayProgram arrayProgram=null;
//            System.out.println(arrayProgram.toString());
//        }catch (Exception e){
//            System.out.println(e);
//
//        }
        try {

            Bank bank=new Bank(100);
            bank.deposit(100);
            bank.withdraw(500);
        }
        catch (InsufficientBalance e){
            System.out.println(e);
        }

    }
}