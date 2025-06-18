package springCore.Core1;

public class Mobile {
	private String model;
	private String storage;
	private double price;
	private MSim sim;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public MSim getSim() {
		return sim;
	}
	public void setSim(MSim sim) {
		this.sim = sim;
	}
	
	public void display() {
		System.out.println("Mobile Details:");
		System.out.println("Model: "+getModel());
		System.out.println("Storage: "+getStorage());
		System.out.println("Price: "+getPrice()+"\n");
		
		System.out.println("Sim Card Details:");
		MSim s = getSim();
		System.out.println("Name: "+s.getName()+" "+s.getNetwork());
		System.out.println("Number: "+s.getNumber());
	}
}
