/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_026 {
	public static void main(String[] args){
		for(int i = 10000; i <= 100000;){
			double E = 0;
			double tempE = 0;
			for(int j = 1; j <= i; j++){
				double temp = 1;
				for(int t = 1; t <= j; t++){
					temp = temp * t;
				}
				double X = (double)(1.0 / temp);
				tempE = tempE + X;
			}
			E = 1 + tempE;
			System.out.println("The E is " + E);
			i = i + 10000;
		}
	}

}
