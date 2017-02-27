/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class TestCircle3_010 {
	public static void main(String[] args){
		Circle3_009 myCircle = new Circle3_009(5.0);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is " + Circle3_009.getNumberOfObjects());
	}

}
