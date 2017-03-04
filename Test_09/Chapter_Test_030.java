/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_030 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String num = input.nextLine();
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
	
	public static boolean isValid(String number){
		int sumOfDoubleEvenPlace = sumOfDoubleEvenPlace(Long.valueOf(number));
		int sumOfOddPlace = sumOfOddPlace(Long.valueOf(number));
		int sum = sumOfDoubleEvenPlace + sumOfOddPlace;
		int numberOfNumber = number.length();
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
	
	public static long getPrefix(String number, int k){
		int t = Integer.valueOf(number);
		if(k == 1){
			while(t > 9){
				t = t / 10;
			}
			return t;
		}else{
			while(t > 99){
				t = t / 10;
			}
			return t;
		}
	}
	
	public static boolean prefixMatched(String number, int d){
		int t = Integer.valueOf(number);
		if(d <= 9){
			while(t > 9){
				t = t / 10;
			}
			if(t == d){
				return true;
			}else{
				return false;
			}
		}else{
			while(t > 99){
				t = t / 10;
			}
			if(t == d){
				return true;
			}else{
				return false;
			}
		}
	}

}
