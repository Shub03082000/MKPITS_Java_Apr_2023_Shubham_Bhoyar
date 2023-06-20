class PerimeterRhomnusOverloading{
	//private int a;	//a => length of sides
	
	public int PerimeterRhombus(int a){
		return 4*a;
	}
	public double PerimeterRhombus(double a){
		return 4*a;
	}
	
	public static void main(String[] args){
		PerimeterRhomnusOverloading Prhombus = new PerimeterRhomnusOverloading();
		int rhombus = Prhombus.PerimeterRhombus(16);
		System.out.println("The perimeter of rhombus by using integer is : "+ rhombus);
		double rhombus1 = Prhombus.PerimeterRhombus(8.8);
		System.out.println("The perimeter of rhombus by using double is : "+ rhombus1);
	}
}