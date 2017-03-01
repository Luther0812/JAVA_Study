/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_013 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		System.out.print("Enter the array: ");
		double[][] list = new double[rows][columns];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				list[i][j] = input.nextDouble();
			}
		}
		Location result = locateLargest(list);
		System.out.println("The location of the largest element is " + result.maxValue + " at (" + result.row + ", " + result.column + ")");
		
	}
	
	public static Location locateLargest(double[][] list){
		Location a = new Location();
		a.maxValue = list[a.row][a.column];
		for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				if(a.maxValue < list[i][j]){
					a.row = i;
					a.column = j;
					a.maxValue = list[i][j];
				}
			}
		}
		
		return a;
	}

}

class Location{
	public int row;
	public int column;
	public double maxValue;
	
	Location(){
		row = 0;
		column = 0;
	}
}
