/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author up
 *
 */
public class Chapter_Test_027 {
	public static void main(String[] args){
		int count = 0;
		for(int year = 2001; year <= 2100; year++){
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
				System.out.print(year + " ");
				count++;
				if(count % 10 == 0){
					System.out.print("\n");
				}
			}
		}
	}

}
