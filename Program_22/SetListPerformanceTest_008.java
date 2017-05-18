/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_22;

/**
 * @author up
 *
 */
import java.util.*;

public class SetListPerformanceTest_008 {
	public static void main(String[] args){
		Collection<Integer> set1 = new HashSet<Integer>();
		System.out.println("Time for hash set is " + getTestTime(set1, 500000) + " milliseconds");
		
		Collection<Integer> set2 = new LinkedHashSet<Integer>();
		System.out.println("Time for linked hash set is " + getTestTime(set2, 500000) + " milliseconds");
		
		Collection<Integer> set3 = new TreeSet<Integer>();
		System.out.println("Time for tree set is " + getTestTime(set3, 500000) + " milliseconds");
		
		Collection<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Time for array list is " + getTestTime(list1, 60000) + " milliseconds");
		
		Collection<Integer> list2 = new LinkedList<Integer>();
		System.out.println("Time for linked list is " + getTestTime(list2, 60000) + " milliseconds");
	}
	
	public static long getTestTime(Collection<Integer> c, int size){
		long startTime = System.currentTimeMillis();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < size; i++){
			list.add(i);
		}
		
		Collections.shuffle(list);
		
		for(int element: list){
			c.add(element);
		}
		
		Collections.shuffle(list);
		
		for(int element: list){
			c.remove(element);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
