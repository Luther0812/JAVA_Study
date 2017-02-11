/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_04;

/**
 * @author LiuYu
 *
 */
public class FutureTuition_009 {
	public static void main(String[] args){
		double tuition = 10000;
		int year = 1;
		while(tuition < 20000){
			tuition = tuition * 1.07;
			year++;
		}
		
		System.out.println("Tuition will be doubled in " + year + " years");
	}

}
