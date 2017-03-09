/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author up
 *
 */
public class Circle_002 {
	public static void main(String[] args){
		GeometricObject_001 c = new Circle(1);
		System.out.println("The area is " + c.getArea());
	}

}

class Circle extends GeometricObject_001{
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled){
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
