/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class Max1_005 {
	public static <E extends Comparable<E>> E max(E o1, E o2){
		if(o1.compareTo(o2) > 0){
			return o1;
		}else{
			return o2;
		}
	}

}
