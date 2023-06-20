public class AreaOfCircleOverloading{
	private double pi=3.14;
	
	public double AreaCircle(double radius, double pi){
		return pi*radius*radius;
	}
	public int AreaCircle(int radius, double pi){
		return (pi*radius*radius);
	}
	public static void main(String[] args){
	//Area of circle by using overloading in polymorphism
		AreaOfCircleOverloading areaOfCircle = new AreaOfCircleOverloading();
		double AOfcircle = areaOfCircle.AreaCircle(8.0,3.14);
		System.out.println("The area of circle in overloading is "+ AOfcircle);
		
		int AOfcircle1 = areaOfCircle.AreaCircle(11,3.14);
		System.out.println("The area of circle in overloading is "+ AOfcircle1);
	}
}