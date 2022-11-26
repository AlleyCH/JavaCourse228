
public class Software extends Product {

	private Boolean discount;
	
	
	public Software() {
		
	}

	public Software(int id, String name, double price, int year, Boolean discount) {
		super();
		this.discount = discount;
	}
	
	// setters and getters
	public void setDiscount(Boolean discount) {
		this.discount = discount;
	}
	public Boolean getDiscount() {
		return discount;
	}
	
	
	
	@Override
	public void setPrice(double amount) {
		// TODO Auto-generated method stub
		
		if (discount == true) 
		{
			amount = amount * 0.1;
			price = amount;
		}
		else 
		{
			price = amount;
		}
	}

	@Override
	public String GetType() {
		// TODO Auto-generated method stub
		return "Discount: " + discount;
	}
	
	public String toString() {
		return "Discount : " + discount; 
	}

}
/*Override setPrice(double amount) method should return book price (set price
variable as follows if discount variable is true reduce amount by 10% then
assign it to price, if discount variable is false set price to amount )
- Override getType to return string product type “Software”
- Override toString() method that returns the information stored in the instance
variables. */
