/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_003 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a pin number: ");
		String pin = input.nextLine();
		if(pin.length() < 8){
			System.out.println("Invalid Password");
		}else if(!isDigitOrAlph(pin)){
			System.out.println("Invalid Password");
		}else if(!isMoreTwoDigits(pin)){
			System.out.println("Invalid Password");
		}else{
			System.out.println("Valid Password");
		}
	}
	
	public static boolean isDigitOrAlph(String s){
		for(int i = 0; i < s.length(); i++){
			if(!Character.isLetterOrDigit(s.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isMoreTwoDigits(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				count++;
			}
		}
		if(count >= 2){
			return true;
		}else{
			return false;
		}
	}

}
