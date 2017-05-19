/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import java.util.concurrent.*;

public class NewAccountInnerClass_012 {
	
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
	
	private static class AddAPennyTask implements Runnable{
		public void run(){
			synchronized(account){
				account.deposit(1);
			}
		}
	}
	
	private static class Account{
		private static Semaphore semaphore = new Semaphore(1);
		private int balance = 0;
		
		public int getBalance(){
			return balance;
		}
		
		public void deposit(int amount){
			try{
				semaphore.acquire();
				int newBalance = balance + amount;
				Thread.sleep(5);
				balance = newBalance;
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}finally{
				semaphore.release();
			}
		}
	}

}
