package p1;
abstract class Shape
{
    String color;
	boolean filled;
	Shape()
	{
		color="Red";
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	abstract double getArea();
	abstract double getPerimeter();
	public String toString()
	{
		return "Shape[Color="+this.color+", Filled="+this.filled+"]";
	}
} 
class Circle extends Shape
{
	double radius;
	Circle()
	{
		radius=10;
	}
	public double getRadius()
	{
		return this.radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		 return 3.14*this.radius*this.radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*this.radius;

	}
	public String toString()
	{
		return "Circle[Shape[Color="+color+" Radius="+this.radius+"]";
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle()
	{
		length=30;
		width=20;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getArea()
	{
		return this.length*this.width;
	}
	public double getPerimeter()
	{
		return 2*this.length+2*this.width;
	}
	public String toString()
	{
		return "Rectangle[Shape[Color="+color+"],Width="+this.width+" Length="+this.length+"]";
	}
}
class Square extends Rectangle
{
	double side;
	Square()
	{
		side=20;
	}
	public double getSide()
	{
		return this.side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public void setLength(double side)
	{
		length=side;
	}
	public void setWidth(double side)
	{
		width=side;
	}
	public String toString()
	{
		return "Square[Rectangle[Shape[color="+color+"],Width="+this.width+",Length="+this.length+"]]";
	}
}
class test
{
	public static void main (String [] agrs)
	{
        Shape sh=new Circle();
		System.out.println(sh);
		
		System.out.print("Area of circle=");
		System.out.println(sh.getArea());
		System.out.print("Perimeter of circle=");
		System.out.println(sh.getPerimeter());
		Shape sh1=new Rectangle();
		System.out.print("Area of Rectangle=");
		System.out.println(sh1.getArea());
		System.out.print("Perimeter of Rectangle=");
		System.out.println(sh1.getPerimeter());
		System.out.println(sh1);
		Rectangle r=new Square();
		System.out.println(r);

	}
}