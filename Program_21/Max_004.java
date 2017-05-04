/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class Max_004 {
	public static Comparable max(Comparable o1, Comparable o2){
		if(o1.compareTo(o2) > 0){
			return o1;
		}else{
			return o2;
		}
	}

}
