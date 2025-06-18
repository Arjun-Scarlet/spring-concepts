package springCore.Core2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	@Qualifier("laptop") //@Qualifier("mobile")
	Property property;
	void display() {
		System.out.println("Person object is created!");
		property.getDetails();
	}
}
