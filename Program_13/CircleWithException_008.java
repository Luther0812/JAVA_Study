/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
public class CircleWithException_008 {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithException_008(){
		this(1.0);
	}
	
	public CircleWithException_008(double newRadius){
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException{
		if(newRadius >= 0){
			radius = newRadius;
		}else{
			throw new IllegalArgumentException("Radius can not be negative");
		}
	}
	
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	public double findArea(){
		return radius * radius * Math.PI;
	}

}
