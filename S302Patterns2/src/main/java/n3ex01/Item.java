package n3ex01;

public class Item {
	private String name;
	private double euroPrice;
	
	
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.euroPrice = price;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + euroPrice + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return euroPrice;
	}


	public void setPrice(double price) {
		this.euroPrice = price;
	}

}
