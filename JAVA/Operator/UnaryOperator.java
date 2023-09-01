class UnaryOperator1{
	public int unaryOperator(int a){
		return (a++) + (++a) - (--a) + (a--) + (a++); //10 + 12 - 11 + 11 + 10 => 32
	}
}
class UnaryOperator{
	public static void main(String[] args){
		UnaryOperator1 unaryOperator1 = new UnaryOperator1();
		int unary = unaryOperator1.unaryOperator(10);
		System.out.println("Unary operator of a is : "+ unary);
	}
}