package p1;
import java.util.ArrayList;

import moderate.Student;

public class emp {
	public static void main(String[] args) {
		
		test e1=new test(123,"Ankit",'M',125000);
		test e2=new test(124,"Aniket",'M',15000);
		test e3=new test(123,"Govinda",'M',1500);
		
		ArrayList<test>list=new ArrayList<test>();
		
		list.add(e1);
		list.add(e2);
		list.add(e2);
		
		System.out.println(list);
		System.out.println("-----------by uising for each loop----------------");
		
		for (test e:list)
            System.out.println(e);
		
		
		
	}

}
