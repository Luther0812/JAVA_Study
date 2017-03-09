/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
public class TestCircleWithException_009 {
	public static void main(String[] args){
		try{
			CircleWithException_008 c1 = new CircleWithException_008(5);
			CircleWithException_008 c2 = new CircleWithException_008(-5);
			CircleWithException_008 c3 = new CircleWithException_008(0);
		}catch(IllegalArgumentException ex){
			System.out.println(ex);
		}
		System.out.println("Number of objects created: " + CircleWithException_008.getNumberOfObjects());
	}

}
