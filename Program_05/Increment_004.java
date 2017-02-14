/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_05;

/**
 * @author LiuYu
 *
 */
public class Increment_004 {
	public static void main(String[] args){
		int x = 1;
		System.out.println("Before the call, x is " + x);
		increment(x);
		System.out.println("after the call, x is " + x);
	}
	
	public static void increment(int n){
		n++;
		System.out.println("n inside the method is " + n);
	}

}
