package linkedList;

import java.util.LinkedList;

import moderate.Student;

public class Test {
	public static void main(String[] args) {

		Student s1=new Student(1,"Akit",88.22);
		Student s2=new Student (2,"Pratik",77.33);
		Student s3=new Student(3,"Viraj",66.44);
		Student s4=new Student(4,"Shree",55.55);
		
		LinkedList<Student>list=new LinkedList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
        System.out.println(list);
        System.out.println("-------BY USING FOR LOOP------");
        
        for (int i=0;i<list.size();i++)
        	System.out.println(list.get(i));
            System.out.println("-------BY USING FOR EACH LOOP------");
            
        for (Student s:list)
             System.out.println(s);
	}

}
