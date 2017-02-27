/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class Circle1_002 {
	public static void main(String[] args){
		Circle1_002 circle1 = new Circle1_002();
		System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
		
		Circle1_002 circle2 = new Circle1_002(25);
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
		
		Circle1_002 circle3 = new Circle1_002(125);
		System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
		
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
	}
	double radius;
	
	Circle1_002(){
		radius = 1.0;
	}
	
	Circle1_002(double newRadius){
		radius = newRadius;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}

}
