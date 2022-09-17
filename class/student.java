import java.util.Scanner;
class Student
{
	private String name;
    private int rollno;
	private double mark;

	Student(String name,int rollno,double mark) 
	{
		this.name=name;
		this.rollno=rollno;
		this.mark=mark;
	}
	 String getName()
	{
		return name;
	}
	int getRollno()
	{
		return rollno;
	}
	double getMark()
	{
		return mark=(mark/500)*100;
	}
}

class studentTest
{
	public static void main (String A[])
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student name");
		String a=sc.nextLine();
		System.out.println("Enter Student roll number");
		int b=sc.nextInt();
		System.out.println("Enter obtain mark out of 500");
		double c=sc.nextDouble();

		Student s1=new Student(a,b,c);
		System.out.println("Student Name is : "+s1.getName());
		System.out.println("Student Roll number : "+s1.getRollno());
		System.out.println("Student Percentage is : "+s1.getMark());
	}
}