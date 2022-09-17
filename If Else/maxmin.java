import java.util.Scanner;
class maxmin
{
	public static void main(String a[])
	{
		int num;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Frist the Number");
		num=sc.nextInt();
		System.out.println("Enter Second the Number");
		num2=sc.nextInt();
		
		if (num>num2)
		{
			System.out.print("The following number is maximum : ");
			System.out.println(num);
			System.out.print("The following number is minimum : ");
			System.out.println(num2);
		}
		else if (num==num2)
		{
			System.out.print("Both are Equal");
		}
		else
		{
            System.out.print("The following number is maximum : ");
			System.out.println(num2);
			System.out.print("The following number is minimum : ");
			System.out.println(num);
		}


	}
}