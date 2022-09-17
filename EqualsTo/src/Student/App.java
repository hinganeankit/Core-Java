package Student;
import java.util.ArrayList;
import Student.Stud;

public class App {
	public static void main(String[] args) {
ArrayList<String>names=new ArrayList<String>();
		
		names.add("Ankit");
		names.add("Aniket");
		names.add("Govinda");
		names.add("Dipak");
		names.add("Shreyash");
		names.add("Ashutosh");
		
		System.out.println("List  "+  names);
		
		String name="Dipak";
		
		System.out.println("Contains  "+names.contains(name));
		
		String name1="Aniket";
		
		System.out.println("Contains  "+names.contains(name1));
		
		System.out.println("--------------------------");
		
		Stud s1 = new Stud(11, "AA", 98.88);
		Stud s2 = new Stud(22, "CC", 78.88);
		Stud s3 = new Stud(33, "DD", 68.88);
		Stud s4 = new Stud(44, "RR", 18.88);
		Stud s5 = new Stud(22, "CC", 78.88);
		Stud s6 = new Stud(55, "EE", 88.88);

ArrayList<Stud>List=new ArrayList<Stud>();
		
		List.add(s1);
		List.add(s2);
		List.add(s3);
		List.add(s4);
		List.add(s5);
		List.add(s6);
		
		Stud s=new Stud(22, "CC", 78.88);
		
		System.out.println("Check Student   "+List.contains(s));

		
		
	}

}
