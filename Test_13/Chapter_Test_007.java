/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		try{
			System.out.print("Enter a string: ");
			String s = input.nextLine();
			for(int i = 0; i < s.length(); i++){
				char t = s.charAt(i);
				if(t == '0' || t== '1'){
					
				}else{
					throw new NumberFormatException("Wrong");
				}
			}
			System.out.println(s + "'s binary is " + binaryToDecimal(s));
		}catch(NumberFormatException ex){
			System.out.println(ex);
		}
	}
	
	public static int binaryToDecimal(String s){
		int num = 0;
		int t = 0;
		for(int i = s.length() - 1; i >= 0; i--){
			num = num + (int)((s.charAt(i) - '0') * Math.pow(2, t));
			t++;
		}
		return num;
	}

}
