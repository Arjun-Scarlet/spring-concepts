package springCore.Core1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Mobile m = (Mobile)ac.getBean("mobile");
		System.out.println("Mobile Details:");
		System.out.println("Model: "+m.getModel());
		System.out.println("Storage: "+m.getStorage());
		System.out.println("Price: "+m.getPrice()+"\n");
		
		System.out.println("Sim Card Details:");
		MSim s = m.getSim();
		System.out.println("Name: "+s.getName()+" "+s.getNetwork());
		System.out.println("Number: "+s.getNumber());
		System.out.println("------------");
		
		//Or we can display()
		m.display();
		System.out.println("------------");
		
		//Injected object references
		System.out.println(m);
		System.out.println(s);
	}
}
