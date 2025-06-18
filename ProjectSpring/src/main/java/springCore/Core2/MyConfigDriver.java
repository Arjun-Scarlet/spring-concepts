package springCore.Core2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigDriver {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Human h = (Human)ac.getBean("human");
		h.display();
		System.out.println("------------");
		
		Laptop l = (Laptop)ac.getBean("laptop");
		l.getDetails();
		System.out.println("------------");
		
		Mobile m = (Mobile)ac.getBean("mobile");
		m.getDetails();
	}
}
