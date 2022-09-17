import java.util.Scanner;
class Book
{
	String bname;
	String aname;
	int edition;

	Book(String bname,String aname,int edition)
	{
		this.bname=bname;
		this.aname=aname;
		this.edition=edition;
	}
	String getBname()
	{
		return bname;
	}
	String getAname()
	{
		return aname;
	}
	int getEdition()
	{
		return edition;
	}
}


class bookTest
{
	public static void main(String ab[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book Name");
		String a=sc.nextLine();
		System.out.println("Enter the Auther Name");
		String b=sc.nextLine();
		System.out.println("Enter the Edition");
		int c=sc.nextInt();
		Book b1=new Book(a,b,c);

		System.out.println("The Book Name is "+b1.getBname());
		System.out.println("The Book Auther Name is "+b1.getAname());
		System.out.println("The Book Edition is "+b1.getEdition());
	}
}