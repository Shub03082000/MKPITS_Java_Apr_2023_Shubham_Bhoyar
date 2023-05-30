class Double{
	public double addDouble(double number1, double number2){
		return number1 + number2;
	}
}
class Double1{
	public static void main(String[] args){
		Double double1 = new Double();
		double ans = double1.addDouble(20.5,25.5);
		System.out.println(ans);
	}
}