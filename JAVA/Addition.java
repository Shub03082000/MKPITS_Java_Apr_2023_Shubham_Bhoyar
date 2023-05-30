import java.util.Scanner;

public class Addition{
/**
*Below class add 2 int numbers a and b
*@param a - This is first value
*@param b - This is second value
*@param sum - Return addition of a and b
*E.g. 1. a = 2, b = 3, sum = 5
	  2. a = -2, b = 3, sum = 1
	  3. a = 0, b = 3, sum = 3
	  4. a = -2, b = -3, sum = -5
*/
	public static void main(String args[]){
		
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("The addition of two number is "+ sum);
	}	
	
}