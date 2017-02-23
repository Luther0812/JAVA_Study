/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_016 {
	public static void main(String[] args){
		int[] numbers = new int[100000000];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random() * 100000000) + 1;
		}
		int index = (int)(Math.random() * 100000000) + 1;
		int key = numbers[index];
		System.out.println(key);
		
		long startTime1 = System.currentTimeMillis();
		int temp1 = linearSearch(numbers, key);
		long endTime1 = System.currentTimeMillis();
		long executionTime1 = endTime1 - startTime1;
		
		long startTime2 = System.currentTimeMillis();
		int temp2 = binarySearch(numbers, key);
		long endTime2 = System.currentTimeMillis();
		long executionTime2 = endTime2 - startTime2;
		
		System.out.println("The first method time is " + executionTime1);
		System.out.println("The second method time is " + executionTime2);
	}
	
	public static int linearSearch(int[] list, int key){
		for(int i = 0; i < list.length; i++){
			if(key == list[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		while(high >= low){
			int mid = (low + high) / 2;
			if(key < list[mid]){
				high = mid - 1;
			}else if(key == list[mid]){
				return mid;
			}else{
				low = mid + 1;
			}
		}
		return - low - 1;
	}


}
