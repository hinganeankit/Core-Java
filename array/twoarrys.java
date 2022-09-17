import java.util.Scanner;
class tArray
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int x []=new int [3];
		System.out.println("Enter the values of X");
		x =sc.nextInt();
		int y []=new int [3];
		System.out.println("Enter the values of Y");
		y =sc.nextInt();
		int a[]=new int [y];
		for (int i=0;i<a.length;i++)
		{
			 a[i]=sc.nextInt();
		}
		for (int j=0;j<a.length;j++)
		{
			 a[j]=sc.nextInt();
		}
		System.out.println("---------------------------------");
		System.out.println("Multiplication is : ");
        for (int k=0;k<a.length;k++)
        {
        	int res = a[x]*a[y];
        	System.out.println(res);
        }
	}
}