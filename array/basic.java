import java.util.Scanner;
class Array
{
	public static void main(String ar[])
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		size =sc.nextInt();
		int a[]=new int [size];
		for (int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println("---------------------------------");
        for (int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
	}
}