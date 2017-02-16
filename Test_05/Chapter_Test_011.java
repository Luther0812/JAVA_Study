/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_011 {
	public static void main(String[] args){
		int amount = 10000;
		System.out.printf("%-10s%-10s%-10s\n", "SalesAmount", "", "Commission");
		for(int i = 0; i <= 18; i++){
			double commission = computeCommission(amount + 5000 * i);
			System.out.printf("%-10s%-10s%-10s\n", (amount + 5000 * i), "", commission);
		}
	}
	
	public static double computeCommission(double salesAmount){
		double Amount = 0;
		if(salesAmount <= 5000){
			Amount = Amount + salesAmount * 0.08;
		}else if(salesAmount <= 10000){
			Amount = Amount + (salesAmount - 5000) * 0.1 + 5000 * 0.08;
		}else{
			Amount = Amount + (salesAmount - 10000) * 0.12 + 5000 * 0.08 + 5000 * 0.1;
		}
		
		return Amount;
	}

}
