package excerise2;

import javax.swing.JOptionPane;

public class FullTimeGameTester extends GameTester {
	
	private double baseSal = 3000;
	
	public FullTimeGameTester() {		
		super(true);
	}
	
	@Override
	public void salary() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Type: " + getStatus() + " Salary: $" + baseSal);

	}
	
}
