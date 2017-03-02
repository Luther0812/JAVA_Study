/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_004 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string and a char: ");
		String s = input.nextLine();
		char a = (input.nextLine()).charAt(0);
		System.out.println("The " + a + " appears " + count(s, a) + " times");
	}
	
	public static int count(String str, char a){
		int num = 0;
		for(int i = 0; i < str.length(); i++){
			if(a == str.charAt(i)){
				num++;
			}
		}
		return num;
	}

}
