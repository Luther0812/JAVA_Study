/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_007 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Entera string: ");
		String s = input.nextLine();
		for(int i = 0; i < s.length(); i++){
			if(!Character.isLetter(s.charAt(i))){
				System.out.print(s.charAt(i));
			}else{
				char c = Character.toUpperCase(s.charAt(i));
				int t = getNumber(c);
				System.out.print(t);
			}
		}
	}
	
	public static int getNumber(char uppercaseLetter){
		switch (uppercaseLetter){
		case 'A':
			return 2;
		case 'B':
			return 2;
		case 'C':
			return 2;
		case 'D':
			return 3;
		case 'E':
			return 3;
		case 'F':
			return 3;
		case 'G':
			return 4;
		case 'H':
			return 4;
		case 'I':
			return 4;
		case 'J':
			return 5;
		case 'K':
			return 5;
		case 'L':
			return 5;
		case 'M':
			return 6;
		case 'N':
			return 6;
		case 'O':
			return 6;
		case 'P':
			return 7;
		case 'R':
			return 7;
		case 'Q':
			return 7;
		case 'S':
			return 7;
		case 'T':
			return 8;
		case 'U':
			return 8;
		case 'V':
			return 8;
		case 'W':
			return 9;
		case 'X':
			return 9;
		case 'Y':
			return 9;
		case 'Z':
			return 9;
		default:
			return 0;
		}
	}

}
