class MulArithOperator1{
	public int mulOperator(int a, int b){
		return a * b;
	}
}
class MulArithOperator{
	public static void main(String[] args){
		MulArithOperator1 mulArithOperator1 = new MulArithOperator1();
		int mul = mulArithOperator1.mulOperator(18,3);
		System.out.println("Multiplication of a and b is : " + mul);
	}
}