/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_032 {
	public static void main(String[] args){
		int winCount = 0;
		for(int i = 1; i <= 10000; i++){
			while(true){
				int num1 = (int)(Math.random() * 6) + 1;
				int num2 = (int)(Math.random() * 6) + 1;
				if((num1 + num2) == 2 || (num1 + num2) == 3 || (num1 + num2) == 12){
//					System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//					System.out.println("You lose");
					break;
				}else if((num1 + num2) == 7 || (num1 + num2) == 11){
//					System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//					System.out.println("You win");
					winCount++;
					break;
				}else{
//					System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//					System.out.println("Point is " + (num1 + num2));
					while(true){
						int lastTotal = num1 + num2;
						num1 = (int)(Math.random() * 6) + 1;
						num2 = (int)(Math.random() * 6) + 1;
						
						if(!other(num1, num2, lastTotal, winCount)){
							break;
						}
					}
					break;
				}
			}
		}
		
		System.out.println("The game you have won " + winCount + " times");
	}
	
	public static boolean other(int num1, int num2, int lastTotal, int winCount){
		if((num1 + num2) == 7 || (num1 + num2) == lastTotal){
			if((num1 + num2) == 7){
//				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//				System.out.println("You lose");
			}else{
//				System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//				System.out.println("You win");
				winCount++;
			}
			return false;
		}else{
//			System.out.println("You rolled " + num1 + " + " + num2 + " = " + (num1 + num2));
//			System.out.println("Point is " + (num1 + num2));
			return true;
		}
	}

}
