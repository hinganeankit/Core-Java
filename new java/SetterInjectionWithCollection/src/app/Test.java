package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Person;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		
		Person person=(Person)ctx.getBean("person");
		
		System.out.println(person);
		
		person.displayPerson();
		
	}
}
