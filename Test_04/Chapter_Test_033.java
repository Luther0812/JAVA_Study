/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_033 {
	public static void main(String[] args){
		for(int i = 1; i <= 10000; i++){
			int divisorTotal = 1;
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					divisorTotal = divisorTotal + j;
				}
			}
			if(divisorTotal == i){
				System.out.print(i + "  ");
			}
		}
	}

}
