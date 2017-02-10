/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_03;

/**
 * @author up
 *
 */
public class Chapter_Test_024 {
	public static void main(String[] args){
		int numberCard = (int)(Math.random() * 12) + 1;
		int colorCard = (int)(Math.random() * 3) + 1;
		
		String number = "";
		String color = "";
		
		switch (numberCard){
		case 1:
			number = "Ace";
			break;
		case 2:
			number = "2";
			break;
		case 3:
			number = "3";
			break;
		case 4:
			number = "4";
			break;
		case 5:
			number = "5";
			break;
		case 6:
			number = "6";
			break;
		case 7:
			number = "7";
			break;
		case 8:
			number = "8";
			break;
		case 9:
			number = "9";
			break;
		case 10:
			number = "10";
			break;
		case 11:
			number = "Jack";
			break;
		case 12:
			number = "Queen";
			break;
		case 13:
			number = "King";
			break;
		}
		
		switch (colorCard){
		case 1:
			color = "Clubs";
			break;
		case 2:
			color = "Diamond";
			break;
		case 3:
			color = "Heart";
			break;
		case 4:
			color = "Spades";
			break;
		}
		
		System.out.println("The card you picked is " + number + " of " + color);
	}

}
