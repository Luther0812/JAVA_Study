/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_009 {
	public static void main(String[] args){
		int count = 10;
		double foot = 1;
		double meter = 20;
		System.out.printf("%-6s%8s%-6s%12s%-6s%8s%-6s\n","Ó¢³ß", " ", "Ã×", " ", "Ã×", " ", "Ó¢³ß");
		for(int i = 0; i < 10; i++){
			double footToMeter = footToMeter((foot + i));
			double meterToFoot = meterToFoot(meter + 5 * i);
			System.out.printf("%-6s%8s%-6s%12s%-6s%8s%-6s\n",(foot + i), " ", footToMeter, " ", (meter + 5 * i), " ", meterToFoot);
		}
	}
	
	public static double footToMeter(double foot){
		double meter = 0.305 * foot;
		return meter;
	}
	
	public static double meterToFoot(double meter){
		double foot = meter / 0.305;
		return foot;
	}

}
