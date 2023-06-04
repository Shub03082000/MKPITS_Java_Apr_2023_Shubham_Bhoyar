class DivisionArithmaticOperator{

/*Division Operation*/
	public int divisionInteger(int number1, int number2){
		return number1 / number2;
	}
	
	public float divisionFloat(float number1, float number2){
		return number1 / number2;
	}
	
	public double divisionDouble(double number1, double number2){
		return number1 / number2;
	}
	
	public long divisionLong(long number1, long number2){
		return number1 / number2;
	}
	
	public short divisionShort(short number1, short number2){
		return number1 / number2;
	}
}

class MainDivision{
	public static void main(String[] args){
	/*Division Operation*/
		
		/*Addition Operation using Integer datatype*/
			DivisionArithmaticOperator division1 = new DivisionArithmaticOperator();
			System.out.println("Addition of two Integer number is : " + (division1.divisionInteger(40,80)));
		
		/*Addition Operation using Float datatype*/
			DivisionArithmaticOperator division2 = new DivisionArithmaticOperator();
			System.out.println("Addition of two float number is : " + (division2.divisionFloat(40f,20f)));
		
		/*Addition Operation using Double datatype*/
			DivisionArithmaticOperator division3 = new DivisionArithmaticOperator();
			System.out.println("Addition of two Double number is : " + (division3.divisionDouble(25.75,16.86)));
	
		/*Addition Operation using Long datatype*/
			DivisionArithmaticOperator division4 = new DivisionArithmaticOperator();
			System.out.println("Addition of two Long number is : " + (division4.divisionLong(700,100)));
			
		/*Addition Operation using Short datatype*/
			//DivisionArithmaticOperator division5 = new DivisionArithmaticOperator();
			//System.out.println("Addition of two Short number is : " + (division4.divisionShort(7,2)));
	}
}