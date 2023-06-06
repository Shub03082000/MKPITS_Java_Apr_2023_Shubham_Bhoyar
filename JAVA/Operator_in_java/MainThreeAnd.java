class MainThreeAnd{
	public static void main(String[] args){
		
		/*------------------------------logical operator using three parameter--------------------------------------------*/
		logicalThreeAnd logicalOperator1 = new logicalThreeAnd();
		System.out.println("Logical AND 3-parameters true && true && true" + " = " + logicalOperator1.logical3Operator(true,true,true));
		System.out.println("Logical AND 3-parameters true && true && false " + " = " + logicalOperator1.logical3Operator(true,true,false));
		System.out.println("Logical AND 3-parameters true && false && true " + " = " + logicalOperator1.logical3Operator(true,false,true));
		System.out.println("Logical AND 3-parameters false && false && false " + " = " + logicalOperator1.logical3Operator(false,false,false));	
		System.out.println("Logical AND 3-parameters false && false && true " + " = " + logicalOperator1.logical3Operator(false,false,true));	
		System.out.println("Logical AND 3-parameters false && true && false " + " = " + logicalOperator1.logical3Operator(false,true,false));	
	}
}