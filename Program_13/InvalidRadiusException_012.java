/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
public class InvalidRadiusException_012 extends Exception{
	private double radius;
	
	public InvalidRadiusException_012(double radius){
		super("Invalid radius " + radius);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}

}
