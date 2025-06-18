package springCore.Core3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("bean2.xml");
		Example e1 = (Example)ac.getBean("example");// calls constructor and init() method
		e1.display();
		ac.close();// calls destroy() method
	}
}
