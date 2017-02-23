/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_013 {
	public static void main(String[] args){
		int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int number = getRandom(test);
		System.out.println(number);
	}
	
	public static int getRandom(int... test){
		int count = 0;
		int num = 0;
		while(count < test.length){
			num = (int)(Math.random() * 54) + 1;
			for(int u: test){
				if(u == num){
					break;
				}else{
					count++;
				}
			}
		}
		return num;
	}

}
