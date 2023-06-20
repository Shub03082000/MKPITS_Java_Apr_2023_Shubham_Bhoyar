public class AreaOfTriangleOverloading{
	double b;	//b => base
	double h;	//h => height	
	
	public double AreaTriangle(double b, double h){
		return (1/2*b*h);
	}
	
	public static void main(String[] args){
		AreaOfTriangleOverloading areaOfTriangle = new AreaOfTriangleOverloading();
		double triangle = areaOfTriangle.AreaTriangle(20.5,100.34);
		System.out.println("The Area of Triangle by using overloading is : " + triangle);
	
	}
}