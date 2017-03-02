/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_001 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String ssn = input.nextLine();
		int count = 0;
		if(ssn.length() != 11){
			System.out.println("Invalid SSN");
			System.exit(0);
		}else{
			while(count < ssn.length()){
				if(count != 3 && count != 6){
					if(!Character.isDigit(ssn.charAt(count))){
						System.out.println("Invalid SSN");
						System.exit(0);
					}
				}else{
					if(ssn.charAt(count) != '-'){
						System.out.println("Invalid SSN");
						System.exit(0);
					}
				}
				count++;
			}
		}
		System.out.println("Valid SSN");
	}

}
