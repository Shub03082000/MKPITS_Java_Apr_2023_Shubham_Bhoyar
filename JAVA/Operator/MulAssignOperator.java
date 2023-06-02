class MulAssignOperator1{
	public int mulAssignOperator(int a){
		return a *= 4;
	}
}
class MulAssignOperator{
	public static void main(String[] args){
		MulAssignOperator1 mulAssignOperator1 = new MulAssignOperator1();
		int mul = mulAssignOperator1.mulAssignOperator(20);
		System.out.println("Substraction of a with number using Assignment operator is : "+ mul);
	}
}