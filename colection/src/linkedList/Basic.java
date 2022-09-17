package linkedList;

import java.util.LinkedList;

public class Basic {
   public static void main(String[] args) {
	   
   LinkedList list = new LinkedList();
	   list.add("Ankit");
	   list.add("Hingane");
	   list.add(25);
	   list.add(true);
	   list.add('M');
	   System.out.println(list);
	   
	   LinkedList<String> list2 = new LinkedList<String>();
	   list.add("Pratik");
	   list.add("Hingane");
	   list.add(22);
	   list.add(true);
	   list.add('M');
	   list.add("Shegaon");
	  
	   System.out.println(list2);
	    list.addAll(list2);
	   System.out.println(list);
	   System.out.println("Is contains:"+list.contains("Shegaon"));
	   System.out.println(list);
	   System.out.println(list.remove("Shegaon"));
	   System.out.println(list);
   }
}

	   
	   