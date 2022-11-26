package excerise3;

public abstract class Mortgage implements MortgageConstants{
	private double mortgageNumber;
	private String customerName;
	private double amount; // Don’t allow mortgage amounts over $300,000
	private double interestRate;
	private int term;
	
	public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
		if(amount > 300000)
			throw new IllegalArgumentException("Amount has to be less than 300,000");
		this.mortgageNumber = mortgageNumber;
		this.customerName = customerName;
		this.amount = amount;
		this.interestRate = interestRate;
		this.term = term;
	}
	
	// setters and getters
	public void setMortgageNumber(double mortgageNumber) {
		this.mortgageNumber = mortgageNumber;
	}
	public double getMortgageNumber() {
		return mortgageNumber;
	}
	// setters and getters
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	// setters and getters
	public void setAmount(double amount) {
		if(amount < maxMortgageAmount)
		throw new IllegalArgumentException("Amount has to be less than 300,000");
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	// setters and getters
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterestRate() {
		return interestRate;
	}
	// setters and getters
	public void setTerm(int term) {
        if(term<3)
            this.term= shortTerm;
        else if (term==3)
            this.term=midTerm;
        else
            this.term=longTerm;
		this.term = term;
	}
	public int getTerm() {
		return term;
	}
	
	public String getMortgageInfo () {
		return "Mortgage\n-----\nMortage Number: " + getMortgageNumber() + "\nCustomer Name: " + getCustomerName()
				+ "\nMortgage Amount: " + getAmount() + "\nRate Of Int:" + getInterestRate();
	}

}
