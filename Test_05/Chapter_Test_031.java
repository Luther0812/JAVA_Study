/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_031 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long num = input.nextLong();
		if(isValid(num)){
			long t1 = getPrefix(num, 1);
			long t2 = getPrefix(num, 2);
			if(prefixMatched(num, (int)t1)){
				System.out.print("The card is valid");
			}else if(prefixMatched(num, (int)t2)){
				System.out.print("The card is valid");
			}else{
				System.out.print("The card is not valid");
			}
		}else{
			System.out.print("The card is not valid");
		}
	}
	
	public static boolean isValid(long number){
		int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(number);
		int sumOfOddPlace = sumOfOddPlace(number);
		int sum = sumOfDoubleEvenPlace + sumOfOddPlace;
		int numberOfNumber = getSize(number);
		if((sum % 10 == 0) && (numberOfNumber >= 13 || numberOfNumber <= 16)){
			return true;
		}else{
			return false;
		}
	}
	
	public static int sumOfDoubleEvenPlace(long number){
		long num;
		int count = 1;
		int result = 0;
		while(number > 9){
			if(count % 2 == 0){
				num = number - (number / 10) * 10;
				int temp = (int)(num * 2);
				result = result + getDigit(temp);
				number = number / 10;
				count++;
			}else{
				number = number / 10;
				count++;
			}
		}
		result = result + getDigit((int)(number * 2));
		return result;
	}
	
	public static int getDigit(int number){
		int temp;
		int result = 0;
		if(number <= 9){
			return number;
		}else{
			temp = number % 10;
			number = number / 10;
			result = temp + number;
			return result;
		}
	}
	
	public static int sumOfOddPlace(long number){
		long num;
		int count = 1;
		int result = 0;
		while(number > 9){
			if(count % 2 == 0){
				number = number / 10;
				count++;
			}else{
				num = number % 10;
				result = result + (int)num;
				number = number / 10;
				count++;
			}
		}
		return result;
	}
	
	public static int getSize(long number){
		int count = 1;
		while(number > 9){
			number = number / 10;
			count++;
		}
		return count;
	}
	
	public static long getPrefix(long number, int k){
		if(k == 1){
			while(number > 9){
				number = number / 10;
			}
			return number;
		}else{
			while(number > 99){
				number = number / 10;
			}
			return number;
		}
	}
	
	public static boolean prefixMatched(long number, int d){
		if(d <= 9){
			while(number > 9){
				number = number / 10;
			}
			if(number == d){
				return true;
			}else{
				return false;
			}
		}else{
			while(number > 99){
				number = number / 10;
			}
			if(number == d){
				return true;
			}else{
				return false;
			}
		}
	}

}
