class SubArithOperator1{
	public int subOperator(int a, int b){
		return a - b;
	}
}
class SubArithOperator{
	public static void main(String[] args){
		SubArithOperator1 subArithOperator1 = new SubArithOperator1();
		int sub = subArithOperator1.subOperator(15,3);
		System.out.println("Substraction of a and b is : " + sub);
	}
}
		
		