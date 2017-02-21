/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_029 {
	public static void main(String[] args){
		while(true){
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			if((num1 + num2) == 2 || (num1 + num2) == 3 || (num1 + num2) == 12){
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("You lose");
				break;
			}else if((num1 + num2) == 7 || (num1 + num2) == 11){
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("You win");
				break;
			}else{
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("Point is " + (num1 + num2));
				while(true){
					int lastTotal = num1 + num2;
					num1 = (int)(Math.random() * 6) + 1;
					num2 = (int)(Math.random() * 6) + 1;
					
					if(!other(num1, num2, lastTotal)){
						break;
					}
				}
				break;
			}
		}
	}
	
	public static boolean other(int num1, int num2, int lastTotal){
		if((num1 + num2) == 7 || (num1 + num2) == lastTotal){
			if((num1 + num2) == 7){
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("You lose");
			}else{
				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.println("You win");
			}
			return false;
		}else{
			System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println("Point is " + (num1 + num2));
			return true;
		}
	}

}
