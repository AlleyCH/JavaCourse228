
public class Book extends Product{

	
	private String author;
	
	
	public Book() {
		
		
	}
	
	public Book(int id, String name, double price, int year, String author) {
		
		super();
		this.author = author;
	}
	
	//setters and getters
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	} 
	
	
	@Override
	public void setPrice(double amount) {
		// TODO Auto-generated method stub
		price = amount;
	}

	@Override
	public String GetType() {
		// TODO Auto-generated method stub
		return "Book";
	}
	
	public String toString() {
		return "author : " + author; 
	}

}
