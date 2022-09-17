import java.util.Scanner;
class Bike
{
	String name;
	String model;
	String colour;
	int mileage;

	Bike (String name,String model,String colour,int mileage)
	{
		this.name=name;
		this.model=model;
		this.colour=colour;
		this.mileage=mileage;
	}
	String getName()
	{
		return name;
	}
	String getModel()
	{
		return model;
	}
	String getColour()
	{
		return colour;
	}
	int getMileage()
	{
		return mileage;
	}
}
class bikeTest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter bike name");
		String w=sc.nextLine();
		System.out.println("Enter bike model");
		String x=sc.nextLine();
		System.out.println("Enter bike colour");
		String y=sc.nextLine();
		System.out.println("Enter bike Mileage");
		int z=sc.nextInt();
		Bike b1=new Bike(w,x,y,z);

		System.out.println("Bike name : "+b1.getName());
		System.out.println("Bike Model : "+b1.getModel());
		System.out.println("Bike Colour : "+b1.getColour());
		System.out.println("Bike Mileage in kmpl : "+b1.getMileage());
	}
}