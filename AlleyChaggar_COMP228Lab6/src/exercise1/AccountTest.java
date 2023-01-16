package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     // create ArrayList
        List<Transaction> alley = Collections.synchronizedList(new ArrayList<>());
        
        // add Transaction objects
        alley.add(new Transaction("deposit", 1000));
        alley.add(new Transaction("withdraw", 500));
        alley.add(new Transaction("withdraw", 200));
        alley.add(new Transaction("deposit", 3000));

        ExecutorService executorService = Executors.newCachedThreadPool();
        
        for(int i=0; i<alley.size(); i++) {
            executorService.execute(alley.get(i)); 
        }
        
    }
}
	


