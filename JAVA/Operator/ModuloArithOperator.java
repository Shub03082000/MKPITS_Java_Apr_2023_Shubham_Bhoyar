class ModuloArithOperator1{
	public int moduloOperator(int a, int b){
		return a % b;
	}
}
class ModuloArithOperator{
	public static void main(String[] args){
		ModuloArithOperator1 moduloArithOperator = new ModuloArithOperator1();
		int modulus = moduloArithOperator.moduloOperator(18,7);
		System.out.println("Modulo of a and b is : " + modulus);
	}
}