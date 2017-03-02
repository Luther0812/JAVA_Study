/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
public class Chapter_Test_014a {
	public static void main(String[] args){
		int result = 0;
		for(int i = 0; i < args.length; i++){
			result = result + Integer.valueOf(args[i]);
		}
		System.out.println("The total is " + result);
	}

}
