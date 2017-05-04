/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class GenericMethodDemo_002 {
	public static void main(String[] args){
		Integer[] integers = {1, 2, 3, 4, 5};
		String[] strings = {"London", "Paris", "New York", "Austin"};
		
		GenericMethodDemo_002.<Integer>print(integers);
		GenericMethodDemo_002.<String>print(strings);
	}
	
	public static <E> void print(E[] list){
		for(int i = 0; i < list.length; i++){
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
