class DivArithOperator1{
	public int divOperator(int a, int b){
		return a / b;
	}
}
class DivArithOperator{
	public static void main(String[] args){
		DivArithOperator1 divArithOperator1 = new DivArithOperator1();
		int div = divArithOperator1.divOperator(21,3);
		System.out.println("Division of a and b is : " + div);
	}
}