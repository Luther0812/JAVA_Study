/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class Circle2_007 {
	double radius;
	static int numberOfObjects = 0;
	Circle2_007(){
		radius = 1.0;
		numberOfObjects ++;
	}
	
	Circle2_007(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}

}
