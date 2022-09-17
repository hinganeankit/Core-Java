import java.util.Scanner;
class Person
{
	String name;
	int age;
	String email;
	int weight;
	float height;
	

	Person(String name,int age,String email,int weight,float height)
	{
		this.name=name;
		this.age=age;
		this.email=email;
		this.weight=weight;
		this.height=height;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	String getEmail()
	{
		return email;
	}
	int getWeight()
	{
		return weight;
	}
	float getHeight()
	{
		return height;
	}
	
}


class personTest
{
	public static void main(String ab[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the person's name");
		String a=sc.nextLine();
		System.out.println("Enter the person's age");
		int b=sc.nextInt();

		
		System.out.println("Enter the person's Height");
		float e=sc.nextFloat();
		System.out.println("Enter the person's Weight");
		int d=sc.nextInt();
		System.out.println("Enter the person's Email ID");
        sc.nextLine();
		String c=sc.nextLine();
        Person p1=new Person(a,b,c,d,e);
	
	 System.out.println("name of the person : "+p1.getName());
	 System.out.println("age of the person : "+p1.getAge());
	 System.out.println("Email of the person : "+p1.getEmail());
	 System.out.println("weight of the person : "+p1.getWeight());
	 System.out.println("height of the person : "+p1.getHeight());
	}
}