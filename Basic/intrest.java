import java.util.Scanner;
class intrest
{
	public static void main(String a[])
	{
		double p;
		double t;
		double r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principle amount");
		p=sc.nextDouble();
		System.out.println("Enter the Time");
		t=sc.nextDouble();
		System.out.println("Enter the Rate of Intrest");
		r=sc.nextDouble();

		double A= p*(1+((r/100)*t));

        System.out.print("Simple Intrest is : ");
		System.out.println(A);

	}
}

