/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_009 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		StringBuilder s = new StringBuilder(input.nextLine());
		System.out.println(s + "'s binary is " + binaryToHex(s));
	}
	
	public static String binaryToHex(StringBuilder s){
		StringBuilder num = new StringBuilder();
		while(s.length() % 4 != 0){
			s.insert(0, '0');
		}
		for(int i = s.length() - 1; i >= 3;){
			char c = hex(s.charAt(i), s.charAt(i - 1), s.charAt(i - 2), s.charAt(i - 3));
			num.insert(0, c);
			i = i - 4;
		}
		System.out.println(num);
		return num.toString();
	}
	
	public static char hex(char a, char b, char c, char d){
		int temp = (a - '0') * 1 + (b - '0') * 2 + (c - '0') * 4 + (d - '0') * 8;
		switch (temp){
		case 10:
			return 'A';
		case 11:
			return 'B';
		case 12:
			return 'C';
		case 13:
			return 'D';
		case 14:
			return 'E';
		case 15:
			return 'F';
		default:
			return (char)(temp + '0');
		}
	}

}
