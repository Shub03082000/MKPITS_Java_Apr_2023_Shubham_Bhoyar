package OctalBinaryHexConversion;

public class OctalBinaryHexConversion {
    private String str = "343483";
    public void octalBinaryHexFindOut(int number){
        System.out.println("Integer to binary conversion of number is : " + Integer.toBinaryString(number));
        System.out.println("Integer to octal conversion of number is : " + Integer.toOctalString(number));
        System.out.println("Integer to hexadecimal conversion of number is " + Integer.toHexString(number));
        System.out.println("toString(int i) method - It return String object of specified integer : " + Integer.toString(number));
        System.out.println("valueOf(int i) method - it return Integer instance of specified int value : " +Integer.valueOf(number));
        System.out.println("compare(int x, int y) - it compare two integer value numerically " + Integer.compare(52,12));
    }
}
