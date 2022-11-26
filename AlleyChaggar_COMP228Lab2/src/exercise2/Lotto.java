package exercise2;

import java.util.Random;




public class Lotto {
	
	private enum Status{Continue, Won, Lost};
	
	static int slots = 3;
	Status gameStatus;
			
				public static void lotto() {
					Random random = new Random();  // creating Random object
					int [] lotto = new int[slots]; // creates an new array with 5 slots 
							
				// draw starts with 1 and stops at 5			  
				for (int draw = 1; draw <= slots; draw++) {	
					
			        lotto[draw] = 1+random.nextInt(9); // storing random integers in an array
					System.out.print(lotto);
				}
				
			}
		
				
		public static int[] returnArray(int [] lotto) {
			return lotto;
	}
	
}
