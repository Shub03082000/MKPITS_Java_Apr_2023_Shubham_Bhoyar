class MulAssignOperator1{
	public int mulOperator(int a, int b){
		return a * b;
	}
}
class MulAssignOperator{
	public static void main(String[] args){
		MulAssignOperator1 mulAssignOperator1 = new MulAssignOperator1();
		int mul = mulAssignOperator1.mulOperator(18,3);
		System.out.println("Multiplication of a and b is : " + mul);
	}
}