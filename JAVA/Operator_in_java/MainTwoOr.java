class MainTwoOr{
	public static void main(String[] args)
	{
	/*------------------------------logical operator using two parameter--------------------------------------------*/
	
		logicalTwoOr logicalOperator1 = new logicalTwoOr();
		System.out.println("logical OR 2-parameter : true || true " + " = " + logicalOperator1.logical2Operator(true,true));
		System.out.println("logical OR 2-parameter : true || false " + " = " + logicalOperator1.logical2Operator(true,false));
		System.out.println("logical OR 2-parameter : false || true " + " = " + logicalOperator1.logical2Operator(false,true));
		System.out.println("logical OR 2-parameter : false || false " + " = " + logicalOperator1.logical2Operator(false,false));
	
	}
}