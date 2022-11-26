package excerise3;

import javax.swing.JOptionPane;

public class ProcessMortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
		String name = JOptionPane.showInputDialog(null, "Please enter your name");
		String name1 = (name);
		
		String currentInt = JOptionPane.showInputDialog(null, "Please enter interest rate");
		int interest = Integer.parseInt(currentInt);
		
		
		String term = JOptionPane.showInputDialog(null, "Please enter term");
		int inputterm = Integer.parseInt(term);
		
		String amount = JOptionPane.showInputDialog(null, "Please enter amount");
		double inputAmount = Integer.parseInt(amount);
		
		Mortgage[] mortgages = new Mortgage[3];
		
		mortgages[0] = new BusinessMortgage(34, name1, inputAmount, interest, inputterm);
		mortgages[1] = new PersonalMortgage(62, "Bruh", 3000, 0.1, 1);
		mortgages[2] = new BusinessMortgage(34, "Diba", 1000, 0.5, 4);
		

		
        for (Mortgage myMortgage:mortgages)
        {
               System.out.println(myMortgage);
        }
		
	}
	

}
//– a main class that create an array of 3 mortgages. 
//Prompt the user for the current interest rate. 
//Then in a loop prompts the user for a mortgage type and all relevant information for that mortgage.
//Store the created Mortgage objects in the array. When data entry is complete, display all mortgages.