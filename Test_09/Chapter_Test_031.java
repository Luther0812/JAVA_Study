/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_031 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		String[] words = {"write", "that", "this", "luther", "liuyu", "good", "bad", "better"};
		String flag = "Y";
		while(flag.toUpperCase().equals("Y")){
			String word = words[(int)(Math.random() * words.length)];
			String guess = "";
			StringBuilder temp = new StringBuilder();
			for(int i = 0; i < word.length(); i++){
				temp.append("*");
			}
			boolean[] list = new boolean[26];
			while(!temp.toString().equals(word)){
				System.out.print("(Guess) Enter a letter in word " + temp.toString() + " > ");
				String s = input.nextLine();
				if(list[s.charAt(0) - 'a']){
					System.out.println(s + " is already in the word");
					continue;
				}else{
					list[s.charAt(0) - 'a'] = true;
				}
				
				for(int i = 0; i < word.length(); i++){
					if(String.valueOf(word.charAt(i)).equals(s)){
						temp.replace(i, i + 1, s);
					}
				}
				count++;
			}
			System.out.println("The word is " + word + ". you missed " + (count - word.length()) + " time");
			System.out.println("Do you want to guess for another word? Enter y or n> ");
			flag = input.nextLine();
		}
	}

}
