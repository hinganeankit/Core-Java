import java.util.Scanner;
class Room
{
	String address;
	String bname;
	int rnumber;
	String flattype;
	String oname;

	Room (String address,String bname,int rnumber,String flattype, String oname)
	{
		this.address=address;
		this.bname=bname;
		this.rnumber=rnumber;
		this.flattype=flattype;
		this.oname=oname;
	}
	String getAddress()
	{
		return address;
	}
	String getbname()
	{
		return bname;
	}
	int getrnumber()
	{
		return rnumber;
	}
	String getflattype()
	{
		return flattype;
	}
	String getoname()
	{
		return oname;
	}
}
class roomTest
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Address");
		String a=sc.nextLine();
		System.out.println("Enter the Bulding Name");
		String b=sc.nextLine();
		System.out.println("Enter Room Number");
		int c=sc.nextInt();
		System.out.println("Enter Flat Type");
		String d=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter Owner Name");
		String e=sc.nextLine();
		Room r1=new Room(a,b,c,d,e);

		System.out.println("Address is : "+r1.getAddress());
		System.out.println("Bulding name is : "+r1.getbname());
		System.out.println("Room number is : "+r1.getrnumber());
		System.out.println("Flate type is : "+r1.getflattype());
		System.out.println("Owner is : "+r1.getoname());
	}
}