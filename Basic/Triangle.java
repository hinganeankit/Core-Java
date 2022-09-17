import java.util.Scanner;
class Tringle
{
	public static void main(String a[])
{
  double b;
  double h;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value of Breadth");
  b=sc.nextDouble();
  System.out.println("Enter the value of Height");
  h=sc.nextDouble();

  double Area = (0.5)*b*h;

  System.out.print("Area is = ");
  System.out.println(Area);
}

}

