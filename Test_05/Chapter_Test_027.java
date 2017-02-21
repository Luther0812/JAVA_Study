/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_027 {
	public static void main(String[] args){
		int count = 0;
		int number = 2;
		while(count < 100){
			if(antiphaseNumber(number)){
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
	
	public static boolean antiphaseNumber(int number){
		if(isPrime(number) && !(isBack(number)) && isBackPrime(number)){
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
	
	public static boolean isBackPrime(int number){
		int num = 0;
		int temp = number;
		while(number > 9){
			num = num * 10 + number % 10;
			number = number / 10;
		}
		num = num * 10 + number;
		for(int i = 2; i < num; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}

}
