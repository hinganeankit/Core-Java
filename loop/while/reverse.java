import java.util.Scanner;
class reverse
{
	public static void main(String a[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		int sum=0;
		int rem;

		while (num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		    System.out.println("Reverse of the number is "+sum);
	}
}