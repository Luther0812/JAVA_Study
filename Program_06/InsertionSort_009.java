/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_06;

/**
 * @author up
 *
 */
public class InsertionSort_009 {
	public static void main(String[] args){
		double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
		insertionSort(list);
		for(double u: list){
			System.out.println(u);
		}
	}
	
	public static void insertionSort(double[] list){
		for(int i = 1; i < list.length; i++){
			double currentElement = list[i];
			int k;
			for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
				list[k + 1] = list[k];
			}
			
			list[k + 1] = currentElement;
		}
	}

}
