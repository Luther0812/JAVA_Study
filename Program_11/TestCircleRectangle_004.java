/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_11;

/**
 * @author LiuYu
 *
 */
public class TestCircleRectangle_004 {
	public static void main(String[] args){
		Circle4_002 circle = new Circle4_002(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle1_003 rectangle = new Rectangle1_003(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}

}
