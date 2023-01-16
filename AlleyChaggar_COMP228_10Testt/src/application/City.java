package application;

public class City {
	//fields
	private String name;
	private String country;
	private String img;
	
	
	//constructor without arguments (.e.g. initialize fields to default values)
	public City() {
		
	}
	//constructor that initializes name, country, image.
	public City(String name, String country, String img) {
		this.name = name;
		this.country = country;
		this.img = img;
	}
	// Override toString() method that returns the information stored variables
	//name, country’
	public String toString() {
		return "name: " + name + "country: " + country + "image: " + img;
	}
	
	//Create the getter and setter methods for each instance variable
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getImg() {
		return img;
	}
}
