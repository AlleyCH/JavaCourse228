package excerise1;

public abstract class Insurance {

	private String typeOfInsurance;
	public double monthlyCost; 
	
	public Insurance(String type) {
		// TODO Auto-generated constructor stub
		typeOfInsurance = type;
	}

	public String getTypeOfInsurance() {
		return typeOfInsurance;
	}
	
	public double getMonthlyCost() {
		return monthlyCost;
	}
	
	public abstract void displayInfo();
	
	
	public abstract void setInsuranceCost();
}
