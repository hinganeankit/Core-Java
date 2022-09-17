import java.util.Scanner;
class count
{
	public static void main(String a[])
	{
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		 while (num!=0)
		 {
		 	num=num/10;
		 	count++;
		 }
		System.out.print(count);


	}
}