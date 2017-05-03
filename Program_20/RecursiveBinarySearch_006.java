/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_20;

/**
 * @author up
 *
 */
public class RecursiveBinarySearch_006 {
	public static int RecursiveBinarySearch_006(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		return RecursiveBinarySearch_006(list, key, low, high);
	}
	
	public static int RecursiveBinarySearch_006(int[] list, int key, int low, int high){
		if(low > high){
			return - low - 1;
		}
		
		int mid = (low + high) / 2;
		if(key < list[mid]){
			return RecursiveBinarySearch_006(list, key, low, mid - 1);
		}else if(key == list[mid]){
			return mid;
		}else{
			return RecursiveBinarySearch_006(list, key, mid + 1, high);
		}
	}

}
