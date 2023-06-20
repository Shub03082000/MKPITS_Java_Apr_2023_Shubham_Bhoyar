class OverloadingMultiply{
	private int number1;
	private int number2;
	private int number3;
	
	public int Multiply(int number1, int number2, int number3){
		return number1 * number2 * number3;
	}
	public int Multiply(int number1, int number2){
		return number1 * number2;
	}
	
	public static void main(String[] args){
	//Multiplication program by using overloading in polymorphism
		OverloadingMultiply multiply = new OverloadingMultiply();
		int mul1 = multiply.Multiply(5,6);
		int mul2 = multiply.Multiply(5,4,3);
		System.out.println("The multiply of two number in overloading is : "+ mul1);
		System.out.println("The multiply of two number in overloading is : "+ mul2);
	}
}