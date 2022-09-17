package app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import model.Employee;


public class Test {
 public static void main(String[] args) {
	
	Resource resource = new ClassPathResource("Spring.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	Employee emp=(Employee)factory.getBean("emp");

    emp.displayEmployee();	
}
}
