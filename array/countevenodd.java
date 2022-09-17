import java.util.Scanner;
class count
{
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size =sc.nextInt();
	int a[]=new int[size];
	int i;
	int sum=0;
	int sum1=0;
	System.out.println("Enter the array");
	for (i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	for (i=0;i<a.length;i++)
	{
		if (a[i]%2==0)
		{
		    sum=sum+a[i];
			System.out.println("Even Number is ");
			System.out.println(a[i]);
		}
	     else
	     {
	     	sum1=sum1+a[i];
	     	System.out.println("Odd Number is ");
	     	System.out.println(a[i]);
	     }
	}
	      System.out.println("Sum of even number is "+sum);
	      System.out.println("Sum of odd number is "+sum1);
	}
}