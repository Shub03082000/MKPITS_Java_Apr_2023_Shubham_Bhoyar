class AddArithmaticOperator{
	
	/*Addition Operation*/
	public int additionInteger(int number1, int number2){
		return number1 + number2;
	}
	
	public float additionFloat(float number1, float number2){
		return number1 + number2;
	}
	
	public double additionDouble(double number1, double number2){
		return number1 + number2;
	}
	
	public long additionLong(long number1, long number2){
		return number1 + number2;
	}
	
	//public short additionShort(short number1, short number2){
		//return number1 + number2;
	//}
	
}

class MainAdd{
	public static void main(String[] args){
/*Addition Operation*/
		
		/*Addition Operation using Integer datatype*/
			AddArithmaticOperator addition1 = new AddArithmaticOperator();
			System.out.println("Addition of two Integer number is : " + (addition1.additionInteger(40,80)));
		
		/*Addition Operation using Float datatype*/
			AddArithmaticOperator addition2 = new AddArithmaticOperator();
			System.out.println("Addition of two float number is : " + (addition2.additionFloat(40f,20f)));
		
		/*Addition Operation using Double datatype*/
			AddArithmaticOperator addition3 = new AddArithmaticOperator();
			System.out.println("Addition of two Double number is : " + (addition3.additionDouble(25.75,16.86)));
	
		/*Addition Operation using Long datatype*/
			AddArithmaticOperator addition4 = new AddArithmaticOperator();
			System.out.println("Addition of two Long number is : " + (addition4.additionLong(700,100)));
	}
}
			
