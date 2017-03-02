/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author up
 *
 */
public class Chapter_Test_015 {
	public static void main(String[] args){
		int num = 0;
		for(int i = 0; i < args[0].length(); i++){
			if(Character.isUpperCase(args[0].charAt(i))){
				num++;
			}
		}
		System.out.println("The letter appears " + num);
	}

}
