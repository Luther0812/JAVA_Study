/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class Circle3_009 {
	private double radius = 1;
	private static int numberOfObjects = 0;
	public Circle3_009(){
		numberOfObjects++;
	}
	public Circle3_009(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double newRadius){
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	public double getArea(){
		return radius * radius * Math.PI;
	}

}
