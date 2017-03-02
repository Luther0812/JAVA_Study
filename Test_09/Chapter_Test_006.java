/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_006 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		System.out.println("The letter counts: " + countLetters(s));
	}
	
	public static int countLetters(String str){
		int num = 0;
		for(int i = 0; i < str.length(); i++){
			if(Character.isLetter(str.charAt(i))){
				num++;
			}
		}
		return num;
	}

}
