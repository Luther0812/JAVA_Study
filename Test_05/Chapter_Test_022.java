/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_022 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double number = input.nextDouble();
		double lastGuess = 1;
		double nextGuess = nextGuess(number, lastGuess);
		while(Math.abs(nextGuess - lastGuess) >= 0.0001){
			lastGuess = nextGuess;
			nextGuess = nextGuess(number, lastGuess);
		}
		System.out.println("The result is " + nextGuess);
	}
	
	public static double nextGuess(double number, double guess){
		double result = (guess + (number / guess)) / 2;
		return result;
	}

}
