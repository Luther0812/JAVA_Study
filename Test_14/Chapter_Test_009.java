/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_009 {
	public static void main(String[] args){
		String[] stringArray = {"a","b","c","d","e","f","g","h","i","j"};
		Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
		java.util.Date[] dateArray = {
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date(),
				new java.util.Date()};
		
		String stringMax = (String)max(stringArray);
		int intMax = (Integer)max(intArray);
		java.util.Date dateMax = (java.util.Date)max(dateArray);
		System.out.println(stringMax);
		System.out.println(intMax);
		System.out.println(dateMax);
	}
	
	public static Object max(Comparable[] list){
		Object o = list[0];
		int index = 0;
		for(int i = 1; i < list.length; i++){
			if(list[i].compareTo(o) != -1){
				o = list[i];
				index = i;
			}
		}
		
		return o;
	}

}


