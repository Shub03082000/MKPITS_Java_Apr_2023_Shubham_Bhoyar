class station{
	String name;
	List <Staffs> staffs;
	List <Sections> sections;
}
class railway extends station{
	String nameOfTran;
	Doouble trainLength;
	Double platformLength;
	Double platformWidth;
}
class staff extends station{
	String nameOfPostion;
	String uniformColor;
	String gender;
}
class metro extends station{
	Double lengthOfPlatform;
	Double widthOfPlatform;
	Double lengthOfTrain;
	integer noOfCoaches;
	integer noOfRailwayLine;
	List <Departments> departments;
}
	
	