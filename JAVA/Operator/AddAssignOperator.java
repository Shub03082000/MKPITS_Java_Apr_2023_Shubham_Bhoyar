class AddAssignOperator1{
	public int addAssignOperator(int a){
		return a += 4;
	}
}
class AddAssignOperator{
	public static void main(String[] args){
		AddAssignOperator1 addAssignOperator1 = new AddAssignOperator1();
		int add = addAssignOperator1.addAssignOperator(20);
		System.out.println("Addition of a with number using Assignment operator is : "+ add);
	}
}