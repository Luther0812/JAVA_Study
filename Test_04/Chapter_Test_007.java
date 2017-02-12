/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_007 {
	public static void main(String[] args){
		double tuitionStart = 10000;
		double tuitionEnd;
		double sum = 0;
		for (int i = 1; i <= 14; i++){
			tuitionEnd = tuitionStart * 1.05;
			tuitionStart = tuitionEnd;
			if(i >= 11 ){
				sum = sum + tuitionEnd;
			}
		}
		System.out.print("The tuition is " + sum);
	}

}
