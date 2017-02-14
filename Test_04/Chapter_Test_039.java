/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_039 {
	public static void main(String[] args){
		double minAmount = 0.01;
		double Amount = 0;
		while(Amount <= 30000){
			Amount = 5000;
			if(minAmount <= 5000){
				Amount = Amount + minAmount * 0.08;
			}else if(minAmount <= 10000){
				Amount = Amount + (minAmount - 5000) * 0.1 + 5000 * 0.08;
			}else{
				Amount = Amount + (minAmount - 10000) * 0.12 + 5000 * 0.08 + 5000 * 0.1;
			}
			minAmount = minAmount + 0.01;
		}
		System.out.print("The min amount is " + minAmount);
	}

}
