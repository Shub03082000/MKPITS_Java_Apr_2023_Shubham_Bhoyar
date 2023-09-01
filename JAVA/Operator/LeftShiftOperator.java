class LeftShiftOperator1{
	public int lShiftOperator(int a, int b){
		return a << b; //20*2^3 => 160
	}
}
class LeftShiftOperator{
	public static void main(String[] args){
		LeftShiftOperator1 leftShiftOperator1 = new LeftShiftOperator1();
		int lshift = leftShiftOperator1.lShiftOperator(20,3);
		System.out.println("The value of left shift operator is : " + lshift);
	}
}