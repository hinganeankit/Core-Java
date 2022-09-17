import java.util.Scanner;
class Circle
{
	private double radius;
	private String colour;

	Circle (double radius,String colour)
	{
		this.radius=radius;
		this.colour=colour;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public String getColour()
	{
		return colour;
	}
}
class circleTest
{
	public static void main(String a[])
	{
		double r=1.0;
		String c="red";
		double a=3.14*r*r;
		Circle c1=new Circle(2.0,blue);
		Circle c2=new Circle(2.0,red);
		Circle c3=new Circle(1.0,red);

		System.out.println("Radius of circle is "+r);
		System.out.println("Area of circle is "+a);
		System.out.println("colour of circle is "+c);
		System.out.println("---------------------------------");

		System.out.println("Radius of Second circle is"+c1.getRadius());
		System.out.println("Area of Second circle is"+c1.getArea());
		System.out.println("Colour of Second circle is"+c1.getColour());

		System.out.println("Radius of Third circle is"+c2.getRadius());
		System.out.println("Area of Third circle is"+c2.getArea());
		System.out.println("Colour of Third circle is"+c2.getColour());

		System.out.println("Radius of Fourth circle is"+c3.getRadius());
		System.out.println("Area of Fourth circle is"+c3.getArea());
		System.out.println("Colour of Fourth circle is"+c3.getColour());
	}
}