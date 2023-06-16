class Factory{
	List<Workers> workers;
	Double Area;
	String Department;
}
class Automobile extends Factory{
	List<Vehicle> vehicles;
	String qualityOfMaterial;
	String brand;
}
class Vehicle{
	VehicleType vehicleType;
	Double priceOfVehicle;
	String color;
}
class Car extends vehicle{
	Double heightOfCar;
	Double widthOfCar;
	Double lengthOfCar;
}
	
