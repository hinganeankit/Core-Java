import java.util.Scanner;
class Arithmatic
{
	public static void main (String a[])
	{
	double x;
	double y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Frist value");
	x=sc.nextDouble();
	System.out.println("Enter the Second value");
	y=sc.nextDouble();

	double res;
	double res1;
	double res2;
	double res3;

	 res=x+y;
	 res1=x-y;
	 res2=x*y;
	 res3=x/y;


	 System.out.println(res);
	 System.out.println(res1);
	 System.out.println(res2);
	 System.out.println(res3);
	}
}