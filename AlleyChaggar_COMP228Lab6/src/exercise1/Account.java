package exercise1;

public class Account {

	
	  private static int balance;
	    
	    public synchronized int deposit(int amount) {
	        balance += amount;
	        return balance;
	    }
	    
	    public synchronized int withdraw(int amount) {
	        balance -= amount;
	        return balance;
	    }
	}

