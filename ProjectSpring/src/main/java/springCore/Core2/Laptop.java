package springCore.Core2;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Property {
	private int price = 55000;
	private String name = "Lenovo";
	
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
