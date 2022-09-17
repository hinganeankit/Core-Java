package employee;
import java.util.ArrayList;

public class epm {

	public static void main(String[] args) {
		
		employi e1=new employi (123,"Ankit","Hingane",80000.56);
		employi e2=new employi (124,"Aniket","Hiwale",80001.56);
		employi e3=new employi (125,"Govinda","Gawande",80002.56);
		
		ArrayList<employi>list=new ArrayList<employi>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
	}

}
