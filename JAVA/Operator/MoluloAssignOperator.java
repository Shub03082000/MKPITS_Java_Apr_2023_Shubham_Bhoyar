class ModuloAssignOperator1{
	public int moduloAssignOperator(int a){
		return a %= 3;
	}
}
class ModuloAssignOperator{
	public static void main(String[] args){
		ModuloAssignOperator1 moduloAssignOperator1 = new ModuloAssignOperator1();
		int modulo = moduloAssignOperator1.moduloAssignOperator(20);
		System.out.println("Operation of Modulo Assignment operator is : "+ modulo);
	}
}