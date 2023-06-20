class OverloadingModulo{
	private double number1;
	private double number2;
	private double number3;
	
	public double Modulus(double number1, double number2, double number3){
		return number1 % number2 % number3;
	}
	public double Modulus(double number1, double number2){
		return number1 % number2;
	}
	
	public static void main(String[] args){
	//Modulo program by using overloading in polymorphism
		OverloadingModulo modulo = new OverloadingModulo();
		double modulo1 = modulo.Modulus(20.3,3.5);
		double modulo2 = modulo.Modulus(120.5,30.5,12.4);
		System.out.println("The modulo of two number in overloading is : "+ modulo1);
		System.out.println("The modulo of three number in overloading is : "+ modulo2);
	}	
}

