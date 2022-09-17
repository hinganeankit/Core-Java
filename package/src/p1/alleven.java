package p1;
import java.util.Scanner;
class even
{
	public static void main(String a[])
	{
		int i=1;
		int j;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the last interval");
		j=sc.nextInt();
		for (i=1;i<=j;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}