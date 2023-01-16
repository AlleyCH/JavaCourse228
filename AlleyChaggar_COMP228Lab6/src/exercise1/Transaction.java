package exercise1;
import java.security.SecureRandom;


public class Transaction extends Thread implements Runnable {

	  private static final SecureRandom generator = new SecureRandom();
	    private final int sleepTime; // random sleep time for thread
	    private String transaction;
	    private int amount;
	    private static int balance;
	    private Account account = new Account();
	    
	    public Transaction (String transaction, int amount) {
	        this.transaction = transaction;
	        this.amount = amount;
	        sleepTime = generator.nextInt(2000); 
	    }
	    
	    @Override
	    public void run() {
	        // TODO Auto-generated method stub
	        try {
	            if(transaction == "deposit") {
	                balance = account.deposit(amount);

	            } else if (transaction == "withdraw") {
	                balance = account.withdraw(amount);
	            }
	            
	            System.out.println("[" + transaction + "] amount : " + amount +" balance : " + balance);
	            Thread.sleep(sleepTime);
	            
	        }catch (InterruptedException e) {
	            e.printStackTrace();
	             Thread.currentThread().interrupt(); // re-interrupt the thread
	        }

	    }

	}
