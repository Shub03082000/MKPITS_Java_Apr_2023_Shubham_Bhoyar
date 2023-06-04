class SubstractionArithmaticOperator{

/*Substraction Operation*/
	public int substractInteger(int number1, int number2){
		return number1 - number2;
	}
	
	public float substractFloat(float number1, float number2){
		return number1 - number2;
	}
	
	public double substractDouble(double number1, double number2){
		return number1 - number2;
	}
	
	public long substractLong(long number1, long number2){
		return number1 - number2;
	}
	
	//public short substractShort(short number1, short number2){
		//return number1 - number2;
	//}
}

class MainSub{
	public static void main(String[] args){
	/*Subtraction Operation*/
		
		/*Addition Operation using Integer datatype*/
			SubstractionArithmaticOperator substract1 = new SubstractionArithmaticOperator();
			System.out.println("Addition of two Integer number is : " + (substract1.substractInteger(40,80)));
		
		/*Addition Operation using Float datatype*/
			SubstractionArithmaticOperator substract2 = new SubstractionArithmaticOperator();
			System.out.println("Addition of two float number is : " + (substract2.substractFloat(40f,20f)));
		
		/*Addition Operation using Double datatype*/
			SubstractionArithmaticOperator substract3 = new SubstractionArithmaticOperator();
			System.out.println("Addition of two Double number is : " + (substract3.substractDouble(25.75,16.86)));
	
		/*Addition Operation using Long datatype*/
			SubstractionArithmaticOperator substract4 = new SubstractionArithmaticOperator();
			System.out.println("Addition of two Long number is : " + (substract4.substractLong(773473,783423)));
		
		/*Addition Operation using Short datatype*/
			//SubstractionArithmaticOperator substract5 = new SubstractionArithmaticOperator();
			//System.out.println("Addition of two Long number is : " + (substract5.substractShort(7,7)));
			
	}
}