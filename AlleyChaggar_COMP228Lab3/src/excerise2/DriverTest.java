package excerise2;

import javax.swing.JOptionPane;

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput = JOptionPane.showInputDialog(null, "Game Test type?\n 1 - FullTime \n 2 - PartTime" );
		int selection = Integer.parseInt(userInput);
		
		String userInput1 = JOptionPane.showInputDialog(null, "Number of hours?\n" );
		int selection1 = Integer.parseInt(userInput1);

		if(selection == 1 && selection1 > 30)
		{
			FullTimeGameTester gameTester = new FullTimeGameTester();
			gameTester.salary();
		}
		
		else if(selection == 2 && selection1 < 30)
		{
			PartTimeGameTester gameTester = new PartTimeGameTester();
			gameTester.salary();
		}
	}
}
