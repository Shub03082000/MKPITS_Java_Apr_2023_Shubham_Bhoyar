class DivAssignOperator1{
	public int divAssignOperator(int a){
		return a /= 4;
	}
}
class DivAssignOperator{
	public static void main(String[] args){
		DivAssignOperator1 divAssignOperator1 = new DivAssignOperator1();
		int div = divAssignOperator1.divAssignOperator(20);
		System.out.println("Operation of Division Assignment operator is : "+ div);
	}
}