import java.util.Scanner;
class upper
{
	public static void main(String a[])
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		ch=sc.next().charAt(0);
		
		if (ch>='A' && ch<='Z')
		{
			System.out.print("The following number is Capital Character: ");
			System.out.println(ch);
		}
		else if (ch>='a' && ch<='z')
		{
            System.out.print("The following number is Small Character : ");
            System.out.println(ch);
		}
		else if (ch>='0' && ch<='9')
		{
            System.out.print("The following number is Number : ");
            System.out.println(ch);
		} 
		else 
		{
            System.out.print("The following number is Special Character : ");
            System.out.println(ch);
		}


	}
}