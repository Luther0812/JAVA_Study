/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_026 {
	public static void main(String[] args){
		int count = 0;
		int number = 2;
		while(count < 100){
			if(backToPrimeNumber(number)){
				count++;
				System.out.printf("%6d%4s",number, "");
				if(count % 10 == 0){
					System.out.println();
				}
				number++;
			}else{
				number++;
			}
		}
	}
	
	public static boolean backToPrimeNumber(int number){
		if(isPrime(number) && isBack(number)){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isBack(int number){
		int num = 0;
		int temp = number;
		while(number > 9){
			num = num * 10 + number % 10;
			number = number / 10;
		}
		num = num * 10 + number;
		if(num == temp){
			return true;
		}else{
			return false;
		}
	}

}
