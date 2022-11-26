package excerise1;

import javax.swing.JOptionPane;

public class Life extends Insurance{
	// nobody likes "magic" numbers ;)

		public Life()
		{
			super("Life");
			setInsuranceCost();
		}

		public void setInsuranceCost()
		{
			monthlyCost = 45;
		}

		
		public void displayInfo() {
			JOptionPane.showMessageDialog(null, "Insurance type: " + getTypeOfInsurance() + "Monthly Cost: $" + getMonthlyCost());

		}
}
