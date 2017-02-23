/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_006 {
	public static void main(String[] args){
		int [] primes = new int[50];
		int count = 0;
		for(int i = 2; i >= 2; i++){
			if(test(primes, i)){
				
			}else{
				primes[count] = i;
				count++;
				if(count == 50){
					break;
				}
			}
		}
		int num = 1;
		for(int u: primes){
			if(num % 10 == 0){
				System.out.println(u);
				num++;
			}else{
				System.out.print(u  + " ");
				num++;
			}
		}
	}
	
	public static boolean test(int[] primes, int temp){
		int num = (int)(Math.pow(temp, 0.5));
		if(primes[0] == 0){
			return false;
		}else{
			for(int u: primes){
				if(u != 0 && u <= num && temp % u == 0){
					return true;
				}
			}
			return false;
		}
	}

}
