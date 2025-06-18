package springCore.Core2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements Property {
	private int price = 25000;
	private String name = "Vivo V20SE";
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getDetails() {
		System.out.println("Model: "+getName());
		System.out.println("Price: "+getPrice());
	}
}
