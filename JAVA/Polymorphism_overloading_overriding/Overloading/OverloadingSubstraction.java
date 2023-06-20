class OverloadingSubstraction{
	private int number1;
	private int number2;
	private int number3;
	
	public double Substraction(double number1, double number2, double number3){
		return number1 - number2 - number3;
	}
	public int Substraction(int number1, int number2){
		return number1 - number2;
	}
	
	public static void main(String[] args){
	//Substraction program by using overloading in polymorphism
		OverloadingSubstraction sub = new OverloadingSubstraction();
		double sub1 = sub.Substraction(78.5,9.6,6.9);
		int sub2 = sub.Substraction(35,23);
		System.out.println("The substraction of two number in Overloading is : " + sub1);
		System.out.println("The substraction of three number in Overloading is : " + sub2);
	}
}
	