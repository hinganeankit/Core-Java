package p1;
class empolyee
{
	private int id;
	private String fristname;
	private String lastname;
	private double salary;
	private String doj;

empolyee (int id,String fristname,String lastname,double salary,String doj)
{
 this.id=id;
 this.fristname=fristname;
 this.lastname=lastname;
 this.salary=salary;
 this.doj=doj;
}
public void getEmpolyee()
{
	System.out.println("ID Number : "+id);
	System.out.println("Frist Name of Empolyee : "+fristname);
	System.out.println("Last Name of Empolyee : "+lastname);
	System.out.println("Monthely Salary : "+salary);
	System.out.println("Date of Joining : "+doj);
}
public int getID()
{
	return this.id;
}
public String getFristname()
{
	return this.fristname;
}
public String getLastname()
{
	return this.lastname;
}
public double getSalary()
{
	return this.salary;
}
public String getDoj()
{
	return this.doj;
}
public void setSalary(double salary)
{
	 this.salary = salary;
}
public double getAnnualSalary()
{
	return this.salary*12;
}
public double salaryhike(double percentage)
{
	 return this.salary*((percentage+100)/100);
}

}
class empolyeeTest
{
  public static void main(String args[])
  {
  	empolyee e1=new empolyee(123,"Ankit","Hingane",20000,"20 dec 2012");
  	e1.getEmpolyee();
	int x=e1.getID();
	System.out.println("ID : "+x);
	String v=e1.getFristname();
	System.out.println("Frist Name : "+v);
	String y=e1.getLastname();
	System.out.println("Last Name : "+y);
	String w=e1.getDoj();
	System.out.println("Date of Joining : "+w);
	double z=e1.getSalary();
	System.out.println("Salary : "+z);
	e1.setSalary(40000);
	e1.getEmpolyee();
	double z1=e1.getSalary();
	System.out.println("Updated Salary : "+z1);
	double z2=e1.getAnnualSalary();
	System.out.println("Annual Salary : "+z2);
	e1.salaryhike(20);
	e1.getEmpolyee();
  }
}