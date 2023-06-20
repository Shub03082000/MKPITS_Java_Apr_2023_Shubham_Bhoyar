class PerimeterOfTrapeziumOverloading{
	private int a,b,c,d;	//a => length of sides
	
	public int PerimeterTrapezium(int a, int b, int c, int d){
		return a+b+c+d;
	}
	public double PerimeterTrapezium(double a, double b, double c, double d){
		return a+b+c+d;
	}
	
	public static void main(String[] args){
		PerimeterOfTrapeziumOverloading perimeterTrapezium1 = new PerimeterOfTrapeziumOverloading();
		int Ptrapezium = perimeterTrapezium1.PerimeterTrapezium(16,12,45,65);
		System.out.println("The perimeter of rhombus by using integer is : "+ Ptrapezium);
		double Ptrapezium1 = perimeterTrapezium1.PerimeterTrapezium(8.8,78.34,88.76,90.5);
		System.out.println("The perimeter of rhombus by using double is : "+ Ptrapezium1);
	}
}