package excerise3;

public class BusinessMortgage extends Mortgage{

	
	
	//Its constructor sets the interest rate to 1% over the current prime rate.
	
	  public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
	    	
		  super(mortgageNumber, customerName, amount, interestRate, term);
		  setAmount(getAmount() + 1);
	    }
	  
	  public String toString() {
	  return"Personal Mortgage:  Mortgage number:" + this.getMortgageNumber() +" "+
			"Amount of loan:$" + this.getAmount() +" "+
			"Customer Name:" + this.getCustomerName() +" "+
			"Interest Rate:" + this.getInterestRate() +" "+
			"Term of Loan:" + this.getTerm();
		  
	  }
	
}
