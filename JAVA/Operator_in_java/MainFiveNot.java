class MainFiveNot{
	public static void main(String[] args){
	/*------------------------------logical operator using five parameter--------------------------------------------*/
		logicalFiveNot logicalOperator1 = new logicalFiveNot();
		System.out.println("Logical AND 5-parameters true && true || true || true && true" + " = " + logicalOperator1.logical5Operator(true,true,true,true,true));
		System.out.println("Logical AND 5-parameters true && true || true || true && false " + " = " + logicalOperator1.logical5Operator(true,true,true,true,false));
		System.out.println("Logical AND 5-parameters true && true || true || false && false " + " = " + logicalOperator1.logical5Operator(true,true,true,false,false));
		System.out.println("Logical AND 5-parameters true && true || false || false && false " + " = " + logicalOperator1.logical5Operator(true,true,false,false,false));	
		System.out.println("Logical AND 5-parameters true && false || false || false && false " + " = " + logicalOperator1.logical5Operator(true,false,false,false,false));	
		System.out.println("Logical AND 5-parameters false && false || false || false && false " + " = " + logicalOperator1.logical5Operator(false,false,false,false,false));	
		System.out.println("Logical AND 5-parameters false && false || false || false && true " + " = " + logicalOperator1.logical5Operator(false,false,false,false,true));
		System.out.println("Logical AND 5-parameters false && false || false || true && true " + " = " + logicalOperator1.logical5Operator(false,false,false,true,true));
		System.out.println("Logical AND 5-parameters false && false || true || true && true " + " = " + logicalOperator1.logical5Operator(false,false,true,true,true));
		System.out.println("Logical AND 5-parameters false && true || true || true && true " + " = " + logicalOperator1.logical5Operator(false,true,true,true,true));		
	}			
	
}