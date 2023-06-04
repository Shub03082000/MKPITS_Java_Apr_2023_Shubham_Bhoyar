class MultiplcationArithmaticOperator{

/*Multiplication Operation*/
	public int multiplyInteger(int number1, int number2){
		return number1 * number2;
	}
	
	public float multiplyFloat(float number1, float number2){
		return number1 * number2;
	}
	
	public double multiplyDouble(double number1, double number2){
		return number1 * number2;
	}
	
	public long multiplyLong(long number1, long number2){
		return number1 * number2;
	}
	
	public short multiplyShort(short number1, short number2){
		return number1 * number2;
	}
}

class MainMultiply{
	public static void main(String[] args){
		/*Multiplication Operation*/
		
		/*Addition Operation using Integer datatype*/
			MultiplcationArithmaticOperator multiply1 = new MultiplcationArithmaticOperator();
			System.out.println("Addition of two Integer number is : " + (multiply1.multiplyInteger(40,80)));
		
		/*Addition Operation using Float datatype*/
			MultiplcationArithmaticOperator multiply2 = new MultiplcationArithmaticOperator();
			System.out.println("Addition of two float number is : " + (multiply2.multiplyFloat(40f,20f)));
		
		/*Addition Operation using Double datatype*/
			MultiplcationArithmaticOperator multiply3 = new MultiplcationArithmaticOperator();
			System.out.println("Addition of two Double number is : " + (multiply3.multiplyDouble(25.75,16.86)));
	
		/*Addition Operation using Long datatype*/
			MultiplcationArithmaticOperator multiply4 = new MultiplcationArithmaticOperator();
			System.out.println("Addition of two Long number is : " + (multiply4.multiplyLong(700,100)));
			
		/*Addition Operation using Short datatype*/
			//MultiplcationArithmaticOperator multiply5 = new MultiplcationArithmaticOperator();
			//System.out.println("Addition of two Short number is : " + (multiply5.multiplyShort(7,2)));
	}
}