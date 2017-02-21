/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_023 {
	public static void main(String[] args){
		int count = 100;
		for(int i = 1; i <= count; i++){
			char temp = getRandomUpperCaseLetter();
			System.out.print(temp + " ");
			if(i % 10 == 0){
				System.out.println();
			}
		}
		
		for(int i = 1; i <= count; i++){
			char temp = getRandomDigitCharacter();
			System.out.print(temp + " ");
			if(i % 10 == 0){
				System.out.println();
			}
		}
	}
	
	public static char getRandomUpperCaseLetter(){
		return getRandomCharacter('A', 'Z');
	}
	
	public static char getRandomDigitCharacter(){
		return getRandomCharacter('0', '9');
	}
	
	public static char getRandomCharacter(char ch1, char ch2){
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

}
