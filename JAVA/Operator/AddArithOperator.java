class AddArithOperator1{
	public int addOperator(int a, int b){
		return a + b;
	}
}	
class AddArithOperator{
	public static void main(String[] args){
		AddArithOperator1 addArithOperator1 = new AddArithOperator1();
		int sum = addArithOperator1.addOperator(12,3);
		System.out.println("Addition of a and b is : " + sum);
	}
}
		
		