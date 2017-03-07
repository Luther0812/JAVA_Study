/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_11;

/**
 * @author LiuYu
 *
 */
public class Circle4_002 extends GeometricObject1_001{
	private double radius;
	
	public Circle4_002(){
		
	}
	
	public Circle4_002(double radius){
		this.radius = radius;
	}
	
	public Circle4_002(double radius, String color, boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	public void printCircle(){
		System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}

}
