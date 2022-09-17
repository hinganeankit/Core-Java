import java.util.Scanner;
class table
{
	public static void main(String a[])
	{
		int num;
		int i=10;
		int res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which table have to print");
		num=sc.nextInt();

		for (num=1;num<=i;num++)
		{
			res=num*i;
			System.out.println(res);
		}
	}
}