/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_11;

/**
 * @author LiuYu
 *
 */
public class CastingDemo_007 {
	public static void main(String[] args){
		Object object1 = new Circle4_002(1);
		Object object2 = new Rectangle1_003(1, 1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object object){
		if(object instanceof Circle4_002){
			System.out.println("The circle area is " + ((Circle4_002)object).getArea());
			System.out.println("The circle diameter is " + ((Circle4_002)object).getDiameter());
		}else if(object instanceof Rectangle1_003){
			System.out.println("The rectangle area is " + ((Rectangle1_003)object).getArea());
		}
	}

}
