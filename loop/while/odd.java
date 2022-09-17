import java.util.Scanner;
class odd
{
	public static void main(String arg[])
	{
		int start=1;
		int end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end point");
		end=sc.nextInt();

		while (start<=end)
		{
			if (start%2!=0)
			{
				System.out.println(start);
			}   start++;
		}

		
	}

}