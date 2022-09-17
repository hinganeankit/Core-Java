import java.util.Scanner;
class evenodd
{
	public static void main(String a[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.print("The following number is even : ");
			System.out.println(num);
		}
		else
		{
            System.out.print("The following number is odd : ");
            System.out.println(num);
		}


	}
}