class RightShiftOperator1{
	public int rShiftOperator(int a, int b){
		return a >> b;	//20/2^2  
		//If the quotient is in the fraction value then it gives us remainder value as answer.
	}
}
class RightShiftOperator{
	public static void main(String[] args){
		RightShiftOperator1 rightShiftOperator1 = new RightShiftOperator1();
		int rshit = rightShiftOperator1.rShiftOperator(10,2);
		System.out.println("The value of Right Shift Operator is : " + rshit);
	}
}