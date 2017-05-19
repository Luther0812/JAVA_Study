/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class AccountWithSyncUsingLock_008 {
	public static Account account = new Account();
	
	public static void main(String[] args){
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 100; i++){
			executor.execute(new AddAPennyTask());
		}
		
		executor.shutdown();
		while(!executor.isTerminated()){
			
		}
		System.out.println("What is balance? " + account.getBalance() );
	}
	
	public static class AddAPennyTask implements Runnable{
		public void run (){
			account.deposit(1);
		}
	}
	
	public static class Account{
		private static Lock lock = new ReentrantLock();
		private int balance = 0;
		public int getBalance(){
			return balance;
		}
		
		public void deposit(int amount){
			lock.lock();
			try{
				int newBalance = balance + amount;
				Thread.sleep(5);
				balance = newBalance;
			}catch(InterruptedException ex){
				
			}finally{
				lock.unlock();
			}
		}
	}

}
