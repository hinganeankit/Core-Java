import java.util.Scanner;
class Auther
{
	private String name;
	private String email;
	private char ch;

	Auther (String name,String email,char ch)
	{
		this.name=name;
		this.email=email;
		this.ch=ch;
	}
	public String getName()
	{
		return this.name;
	}
	public String getEmail()
	{
		return this.email;
	}
	public char getCh()
	{
		return ch;
	}
	void printAuther()
	{
		System.out.println("Name : "+name);
		System.out.println("Email ID : "+email);
		System.out.println("Gender : "+ch);
	}
	public void setEmail(String email) 
	{
		this.email=email;
	}
}
class autherTest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String x=sc.nextLine();
		System.out.println("Enter Gender");
		char y=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Enter Email");
		String z=sc.nextLine();
		Auther a1=new Auther(x,z,y);

		System.out.println("Name :"+a1.getName());
		System.out.println("Email Id :"+a1.getEmail());
		System.out.println("Gender :"+a1.getCh());

		System.out.println("-----------*****-----------");
		System.out.println("Change Email ID ????");
		String b=sc.nextLine();
		System.out.println("-----------*****-----------");
		a1.setEmail(b);
		a1.printAuther();	

	}
}