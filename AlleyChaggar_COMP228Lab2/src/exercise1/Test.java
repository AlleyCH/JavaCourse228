package exercise1;

import java.util.Random;

public class Test {
	
	static public String question [];
	static public String answer [];
	
	public Test(String[] question)  {
			this.question = question; 
	}
	
	
	public static String simulateQuestion() {
		String question1 ="What is Java?\n" + 
				"(a)A high-level programming language\n(b)A hyperText language\n(c)And IDE\n(d)"; 
		
		String question2 = "What is a Class?\n" +
				"(a) A blue print\n(b)An object\n(c)";
		
		String question3 = "is Java an interpreted or compiled language?\n" + 
				"(a)Interpreted\n(b)Compiled\n(c)Both\n(d)Neither"; 
				
		String question4 = "What is the default value for an instance variable of type int?\n" + 
				"(a)Null\n(b)0\n(c)1\n(d)Undefind"; 
		
		String question5 = "What type of file is a java file?"+
				"(a)css\n(b)text\n(c)java\n(d)class";
				
		return question1 + question2 + question3 +question4 + question5; 
		}		
		
	
	
	public static String generateMessage(Boolean x) {
		Random random = new Random();
		if (x) {String[] congratMessage = { "Excellent!", "Good!", "Keep up the good work!", "Nice Work!" };
		switch (random.nextInt(4)) {
		case 0:
		return congratMessage[0];
		case 1:
		return congratMessage[1];
		case 2:
		return congratMessage[2];
		case 3:
		return congratMessage[3];
		default:
		return congratMessage[0];
		}
	}
			else {String[] incorrectMessage = { "No. Please try again.", "Wrong. Try once more.", "Dont give up.", "No. Keep trying." };
			switch (random.nextInt(4)) {
			case 0:
			return incorrectMessage[0];
			case 1:
			return incorrectMessage[1];
			case 2:
			return incorrectMessage[2];
			case 3:
			return incorrectMessage[3];
			default:
			return incorrectMessage[0];
			}
			
		}
			
	}
	
	public void inputAnswer() {
		//I don't know what to write here....
	}
}

