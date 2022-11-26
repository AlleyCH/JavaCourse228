
public abstract class Product {
	private int id;
	private String name;
	protected double price;
	private int year;
	
	public Product() {
		
	}
	
	public Product(int id, String name, double price, int year) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.year = year;
	}
	
	public String toString() {
		return "Id : " + id + 
				"Name: " + name +
				"Price: " + price +
				"Year: " + year;
	}
	
	// setters and getters
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public abstract void setPrice(double amount);
	
	public abstract String GetType();

}











