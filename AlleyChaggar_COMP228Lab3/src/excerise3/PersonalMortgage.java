package excerise3;

public class PersonalMortgage extends Mortgage {

	
    public PersonalMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
    	
    	super(mortgageNumber, customerName, amount, interestRate, term);
    	setAmount(getInterestRate()+2);
    }
    
	@Override
	public String toString() {
		
	return "Personal Mortgage:  Mortgage number:" + 
	this.getMortgageNumber() +" "+
	"Amount of loan:$" + this.getAmount() +" "+
	"Customer Name:" + this.getCustomerName() +" "+
	"Interest Rate:" + this.getInterestRate() +" "+
	"Term of Loan:" + this.getTerm();
	}
}

