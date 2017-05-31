/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_23;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class EfficientrimeNumbers_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Find all prime numbers <= n, enter n: ");
		int n = input.nextInt();
		
		java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();
		
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		int number = 2;
		int squareRoot = 1;
		 System.out.println("The prime numbers are \n");
		 
		 while(number <= n){
			 boolean isPrime = true;
			 if(squareRoot * squareRoot < number){
				 squareRoot++;
			 }
			 
			 for(int k = 0; k < list.size() && list.get(k) <= squareRoot; k++){
				 if(number % list.get(k) == 0){
					 isPrime = false;
					 break;
				 }
			 }
			 
			 if(isPrime){
				 count++;
				 list.add(number);
				 if(count % NUMBER_PER_LINE == 0){
					 System.out.println(number);
				 }else{
					 System.out.print(number + " ");
				 }
				 
			 }
			 number++;
		 }
		 System.out.println("\n" + count + "prime(s) less than or equal to " + n);
	}

}
