class AreaOfRectangle{

	public double rectangle(double length, double width){
	return(length*width);
}

public static void main(String[] args){
	AreaOfRectangle areaOfReactangle = new AreaOfRectangle();
	double Arectangle = areaOfReactangle.rectangle(23.5,54.6);
	System.out.println("Area Of Rectangle is : " + Arectangle);
	}
}