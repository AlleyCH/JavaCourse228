package excerise1;

import javax.swing.JOptionPane;


public class DriverText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String userInput = JOptionPane.showInputDialog(null, "Pick Insurance type?\n 1 - Life \n 2 - Health");
		int selection = Integer.parseInt(userInput);

		if(selection == 1)
		{
			Life lifeInsurance = new Life();
			lifeInsurance.displayInfo();
		}
		else
		{
			Health healthInsurance = new Health();
			healthInsurance.displayInfo();
		}
	}
}
/*This application should ask the user to enter the type of insurance and its monthly fee.
Then, will create the appropriate object (Life or Health) and display the insurance information.

As you create each insurance object, place an Insurance reference to each new Insurance object into an array. 

Each class has its own setInsuranceCost method.
Write a polymorphic screen manager that walks through the array sending setInsuranceCost
 messages to each object in the array and displaying this information on the screen.*/
