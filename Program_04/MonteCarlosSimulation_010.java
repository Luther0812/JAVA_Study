/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_04;

/**
 * @author LiuYu
 *
 */
public class MonteCarlosSimulation_010 {
	public static void main(String[] args){
		final int NUMBER_OF_TRIALS = 10000000;
		int numberOfHints = 0;
		
		for(int i = 0; i < NUMBER_OF_TRIALS; i++){
			double x = Math.random() * 2.0 - 1;
			double y = Math.random() * 2.0 - 1;
			if(x * x + y * y <= 1){
				numberOfHints++;
			}
		}
		
		double pi = 4.0 * numberOfHints / NUMBER_OF_TRIALS;
		System.out.println("PI is " + pi);
	}

}
