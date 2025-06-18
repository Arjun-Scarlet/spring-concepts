package springCore.Core2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
		Person p = (Person)ac.getBean("person");
		p.display();
	}
}
