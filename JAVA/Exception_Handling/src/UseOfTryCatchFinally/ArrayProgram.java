package UseOfTryCatchFinally;

public class ArrayProgram {
    public static int[] array = {12,43,343,53,12,1};
    public void exceptionHandling(){
        try{
            for(int i=0; i<= array.length+1; i++){
                System.out.println(array[i]);
            }
        }catch (ArithmeticException exception){
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());
        }catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("program is overed");
        }

    }

}
