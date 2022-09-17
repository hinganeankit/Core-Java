import java.util.Scanner;
class alleven
{
	public static void main(String a[])
	{
		int start=1;
		int end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the End Point");
		end=sc.nextInt();
		 while(start<=end)
		 {
		 	if (start%2==0)
		 {
		 	System.out.println(start);
		 }
		 start++;
		 }
	}
}