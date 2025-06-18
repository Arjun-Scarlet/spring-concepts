package springCore.Core1;

// getBean() returns singleton istance(i.e: If there is more than one object also, it will return same address/instance)
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Person p1 = (Person)ac.getBean("myPerson");
		p1.talk();
		System.out.println(p1+"\n");
		
		Person p2 = (Person)ac.getBean("myPerson");
		p2.talk();
		System.out.println(p2);
	}
}
