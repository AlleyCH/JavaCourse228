package exercise2;

import javax.swing.JOptionPane;
 
public class TestLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Lotto.lotto();
		System.out.print(sum());
	}
	
	public static int sum() {
		
		String input1 = JOptionPane.showInputDialog("chooses a number between 3 and 27");
		int userInput1 = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog("chooses a number between 3 and 27");
		int userInput2 = Integer.parseInt(input2);
		
		String input3 = JOptionPane.showInputDialog("chooses a number between 3 and 27");
		int userInput3 = Integer.parseInt(input3);
		
		String input4 = JOptionPane.showInputDialog("chooses a number between 3 and 27");
		int userInput4 = Integer.parseInt(input4);
		
		String input5 = JOptionPane.showInputDialog("chooses a number between 3 and 27");
		int userInput5 = Integer.parseInt(input5);
				
		
		int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
		
		return sum;
	}

}
