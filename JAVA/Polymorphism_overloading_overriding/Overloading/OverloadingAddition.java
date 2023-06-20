public class OverloadingAddition{
	private int number1;
	private int number2;
	private int number3;
	
	public int Addition(int number1, int number2){
		return number1 + number2;
	}
	public double Addition(double number1, double number2, double number3){
		return (number1 + number2 + number3);
	}
	
	public static void main(String[] args){
		OverloadingAddition add = new OverloadingAddition();
		int sum1 = add.Addition(8,9);
		double sum2 = add.Addition(10.5,5.5,20.0);
		System.out.println("The addition of two number in Overloading is : " + sum1);
		System.out.println("The addition of three number in Overloading is : " + sum2);
	}
}
	