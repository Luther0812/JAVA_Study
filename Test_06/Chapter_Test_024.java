/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_024 {
	public static void main(String[] args){
		int count = 0;
		String[] Spades = new String[1];
		String[] Clubs = new String[1];
		String[] Hearts = new String[1];
		String[] Diamonds = new String[1];
		
		while(true){
			int clour = (int)(Math.random() * 4);
			int number = (int)(Math.random() * 13) + 1;
			count++;
			
			switch (clour){
			case 0:
				Spades[0] = Integer.toString(number);
				break;
			case 1:
				Clubs[0] = Integer.toString(number);
				break;
			case 2:
				Hearts[0] = Integer.toString(number);
				break;
			case 3:
				Diamonds[0] = Integer.toString(number);
				break;
			}
			
			if(Spades[0] != null && Clubs[0] != null && Hearts[0] != null && Diamonds[0] != null){
				System.out.println(Spades[0] + " of Spades");
				System.out.println(Clubs[0] + " of Clubs");
				System.out.println(Hearts[0] + " of Hearts");
				System.out.println(Diamonds[0] + " of Diamonds");
				System.out.println("Numbers of picks: " + count);
				break;
			}
		}
	}

}
