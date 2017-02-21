/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_020 {
	public static void main(String[] args){
		System.out.printf("%-6s%10s%-6s%10s%-6s\n", "jiaodu", "", "Sin", "", "Cos");
		int count = 360;
		for(double i = 0; i <= count;){
			double sin = Math.sin(Math.toRadians(i));
			double cos = Math.cos(Math.toRadians(i));
			System.out.printf("%-6.0f%10s%-6.4f%10s%-6.4f\n", i, "", sin, "", cos);
			i = i + 10;
		}
	}

}
