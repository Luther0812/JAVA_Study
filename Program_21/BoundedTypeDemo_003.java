/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class BoundedTypeDemo_003 {
	public static void main(String[] args){
		Rectangle1_003 rectangle = new Rectangle1_003(2, 2);
		Circle4_002 circle = new Circle4_002(2);
		
		System.out.println("Same area? " + BoundedTypeDemo_003.<GeometricObject1_001>equalArea(rectangle, circle));
	}
	
	public static <E extends GeometricObject1_001> boolean equalArea(E object1, E object2){
		return ((Rectangle1_003) object1).getArea() == ((Circle4_002) object2).getArea();
	}

}

class Circle4_002 extends GeometricObject1_001{
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

class Rectangle1_003 extends GeometricObject1_001{
	private double width;
	private double height;
	
	public Rectangle1_003(){
		
	}
	
	public Rectangle1_003(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle1_003(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth(){
		return width;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * (width + height);
	}

}

class GeometricObject1_001 {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject1_001(){
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject1_001(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public String toString(){
		return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

}