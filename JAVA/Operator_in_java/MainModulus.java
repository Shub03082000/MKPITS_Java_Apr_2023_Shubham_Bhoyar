class ModulusArithmaticOperator{

/*Modulus Operation*/
	public int modulusInteger(int number1, int number2){
		return number1 % number2;
	}
	
	public float modulusFloat(float number1, float number2){
		return number1 % number2;
	}
	
	public double modulusDouble(double number1, double number2){
		return number1 % number2;
	}
	
	public long modulusLong(long number1, long number2){
		return number1 % number2;
	}
	
	//public short modulusShort(short number1, short number2){
		//return number1 % number2;
	//}
}

class MainModulus{
	public static void main(String[] args){
	/*Modulus Operation*/
		
		/*Addition Operation using Integer datatype*/
			ModulusArithmaticOperator modulus1 = new ModulusArithmaticOperator();
			System.out.println("Addition of two Integer number is : " + (modulus1.modulusInteger(90,80)));
		
		/*Addition Operation using Float datatype*/
			ModulusArithmaticOperator modulus2 = new ModulusArithmaticOperator();
			System.out.println("Addition of two float number is : " + (modulus2.modulusFloat(46f,20f)));
		
		/*Addition Operation using Double datatype*/
			ModulusArithmaticOperator modulus3 = new ModulusArithmaticOperator();
			System.out.println("Addition of two Double number is : " + (modulus3.modulusDouble(69.75,16.86)));
	
		/*Addition Operation using Long datatype*/
			ModulusArithmaticOperator modulus4 = new ModulusArithmaticOperator();
			System.out.println("Addition of two Long number is : " + (modulus4.modulusLong(7809450,105460)));
			
		/*Addition Operation using Short datatype*/
			//ModulusArithmaticOperator modulus5 = new ModulusArithmaticOperator();
			//System.out.println("Addition of two Short number is : " + (modulus5.modulusShort(7,5)));
	}
}