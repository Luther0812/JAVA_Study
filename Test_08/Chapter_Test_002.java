/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_002 {
	public static void main(String[] args){
		Stock s = new Stock("Java", "Sun Microsystems Inc");
		s.previousClosingPrice = 4.5;
		s.currentPrice = 4.35;
		System.out.println("The change is " + s.getChangePercent());
	}

}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}
	
	public double getChangePercent(){
		double percent = currentPrice / previousClosingPrice - 1;
		return percent;
	}
}
