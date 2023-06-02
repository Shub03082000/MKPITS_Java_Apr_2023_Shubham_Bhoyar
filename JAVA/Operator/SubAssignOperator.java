class SubAssignOperator1{
	public int subAssignOperator(int a){
		return a -= 4;
	}
}
class SubAssignOperator{
	public static void main(String[] args){
		SubAssignOperator1 subAssignOperator1 = new SubAssignOperator1();
		int sub = subAssignOperator1.subAssignOperator(20);
		System.out.println("Substraction of a with number using Assignment operator is : "+ sub);
	}
}