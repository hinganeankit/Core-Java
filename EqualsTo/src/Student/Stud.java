package Student;

public class Stud {
	private int id;
	private String name;
	private double marks;
	
	public Stud() {
		id=0;
		name="";
		marks=0.0;
}

	public Stud(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Stud s1=(Stud)obj;
		if ((this.id==s1.id)&&(this.name.equals(s1.name))&&(this.marks==s1.marks)) {
			return true;
		}else {
			return false;
		}
	}

}
