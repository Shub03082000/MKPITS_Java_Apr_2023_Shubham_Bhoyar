class MainTwoAnd{
	public static void main(String[] args)
	{
	/*------------------------------logical operator using two parameter--------------------------------------------*/
	
		logicalTwoAnd logicalOperator1 = new logicalTwoAnd();
		System.out.println("The value of given logical operator using two parameter is : " + " = " + logicalOperator1.logical2Operator(true,true));
		System.out.println("The value of given logical operator using two parameter is : " + " = " + logicalOperator1.logical2Operator(true,false));
		System.out.println("The value of given logical operator using two parameter is : " + " = " + logicalOperator1.logical2Operator(false,true));
		System.out.println("The value of given logical operator using two parameter is : " + " = " + logicalOperator1.logical2Operator(false,false));
	
	}	
	
}