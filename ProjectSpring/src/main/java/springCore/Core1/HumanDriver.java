package springCore.Core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Human h = (Human)ac.getBean("human");
		//retreiving injected values
		System.out.println("Name: "+h.getName());
		System.out.println("Email: "+h.getEmail());
		System.out.println("Mobile: "+h.getNumber());
		System.out.println("------------");
		
		// We can able to call n no of bean class from the same class
		Person p = (Person)ac.getBean("myPerson");
		p.talk();
	}
}
