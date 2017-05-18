/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_22;

/**
 * @author up
 *
 */
import java.util.*;

public class TestTreeSetWithComparator_006 {
	public static void main(String[] args){
		Set<GeometricObject> set = new TreeSet<GeometricObject>(new GeometricObjectComparator_005());
		
		set.add(new Rectangle(4, 5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectangle(4, 1));
		
		System.out.println("A sorted set of geometric objects");
		for(GeometricObject element: set){
			System.out.println("area = " + element.getArea());
		}
	}

}

class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height, String color, boolean filled){
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

class Circle extends GeometricObject{
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