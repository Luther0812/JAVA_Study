/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_05;

/**
 * @author up
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		int count = 10;
		double celsius = 40;
		double fahrenheit = 120;
		System.out.printf("%-6s%8s%-6s%12s%-6s%8s%-6s\n","摄氏度", " ", "华氏度", " ", "华氏度", " ", "摄氏度");
		for(int i = 0; i < 10; i++){
			double celsiusToFahrenheit = celsiusToFahrenheit((celsius - i));
			double fahrenheitToCelsius = fahrenheitToCelsius((fahrenheit - 10 * i));
			System.out.printf("%-6s%8s%-6s%12s%-6s%8s%-6s\n",(celsius - i), " ", celsiusToFahrenheit, " ", (fahrenheit - 10 * i), " ", fahrenheitToCelsius);
		}
	}
	
	public static double celsiusToFahrenheit(double celsius){
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit){
		double celsius = ((fahrenheit - 32) * 5) / 9.0;
		return celsius;
	}

}
