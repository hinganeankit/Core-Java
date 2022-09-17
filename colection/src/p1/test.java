package p1;

public class test {

	private int id;
	private String name;
	private char gender;
	private double salary;
	public test(int id, String name, char gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public void getEmployee()
	{
		System.out.println("id:"+id+" name:"+name+" gender:"+gender+" Salary:"+salary);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "test [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	

}
