/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_029 {
	public static void main(String[] args){
		int[] cards = new int[52];
		for(int i = 0; i < cards.length; i++){
			cards[i] = ((i + 1) % 13);
			if(cards[i] == 0){
				cards[i] = 13;
			}
		}
		
		sum24(cards);
	}
	
	public static void sum24(int[] cards){
		int count = 0;
		int sum = 0;
		while(sum != 24){
			count++;
			int n1 = (int)(Math.random() * 52);
			int n2 = (int)(Math.random() * 52);
			int n3 = (int)(Math.random() * 52);
			int n4 = (int)(Math.random() * 52);
			
			sum = cards[n1] + cards[n2] + cards[n3] + cards[n4];
		}
		System.out.print("The times you have tried is "+ count);
	}

}
