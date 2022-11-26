package excerise1;

import javax.swing.JOptionPane;

public class Health extends Insurance {
	
	public Health() {
		super("Health");
		setInsuranceCost();
	}
	
	public void setInsuranceCost() {
		monthlyCost = 90;
	}
	
	public void displayInfo() {
		JOptionPane.showMessageDialog(null, "Insurance type: " + getTypeOfInsurance() + "Monthly Cost: $" + getMonthlyCost());
	}


	
}
