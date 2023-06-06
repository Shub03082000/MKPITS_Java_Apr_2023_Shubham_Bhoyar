class MainFourAnd{
	public static void main(String[] args){
	/*------------------------------logical operator using three parameter--------------------------------------------*/
		logicalFourAnd logicalOperator1 = new logicalFourAnd();
		System.out.println("Logical AND 4-parameters true && true && true && true" + " = " + logicalOperator1.logical4Operator(true,true,true,true));
		System.out.println("Logical AND 4-parameters true && true && true && false " + " = " + logicalOperator1.logical4Operator(true,true,true,false));
		System.out.println("Logical AND 4-parameters true&& true && false && false " + " = " + logicalOperator1.logical4Operator(true,true,false,false));
		System.out.println("Logical AND 4-parameters true && false && false && false " + " = " + logicalOperator1.logical4Operator(true,false,false,false));	
		System.out.println("Logical AND 4-parameters false && false && false && false " + " = " + logicalOperator1.logical4Operator(false,false,false,false));	
		System.out.println("Logical AND 4-parameters false && false && false && true " + " = " + logicalOperator1.logical4Operator(false,false,false,true));	
		System.out.println("Logical AND 4-parameters false && false && true && true " + " = " + logicalOperator1.logical4Operator(false,false,true,true));
		System.out.println("Logical AND 4-parameters false && true && true && true " + " = " + logicalOperator1.logical4Operator(false,true,true,true));	
	}			
	
}