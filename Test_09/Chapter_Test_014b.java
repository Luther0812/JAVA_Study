/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
public class Chapter_Test_014b {
	public static void main(String[] args){
		StringBuilder s = new StringBuilder(args[0]);
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			if(i % 2 == 0){
				result = result + Integer.valueOf(s.charAt(i) - '0');
			}
		}
		System.out.println("The totla is " + result);
	}

}
