package excerise2;

import javax.swing.JOptionPane;

public class PartTimeGameTester extends GameTester {

	private double salPerHour = 20;
	private String status = "FullTime";


	public PartTimeGameTester() {
		super(false);
	}
	
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Type: " + getStatus() + " Salary: $" + salPerHour);
	
	}

}
