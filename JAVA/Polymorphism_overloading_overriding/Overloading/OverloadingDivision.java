public class OverloadingDivision{
	private double number1;
	private double number2;
	private double number3;
	
	public double Division(double number1, double number2){
		return number1/number2;
	}
	public double Division(double number1, double number2, double number3){
		return number1/number2/number3;
	}
	
	public static void main(String[] args){
	//Division program by using overloading in polymorphism
		OverloadingDivision division = new OverloadingDivision();
		double div1 = division.Division(45.0,7.0);
		double div2 = division.Division(120.0,4.0,12.0);
		System.out.println("The division of two number in overloading is : " +div1);
		System.out.println("The division of three number in overloading is : " +div2);
	}
}

	