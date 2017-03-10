/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_005 {
	public static void main(String[] args){
		Circle_005 c1 = new Circle_005(1);
		Circle_005 c2 = new Circle_005(1);
		System.out.println(c1.equals(c2));
		
	}

}

abstract class GeometricObject_005 {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject_005(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject_005(String color, boolean filled){
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
	
	public boolean getFilled(){
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
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

}

class Circle_005 extends GeometricObject_005 implements Comparable{
	private double radius;
	
	public Circle_005(){
		
	}
	
	public Circle_005(double radius){
		this.radius = radius;
	}
	
	public Circle_005(double radius, String color, boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((Circle_005)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Circle_005)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public boolean equals(Object o){
		if(this.getRadius() == ((Circle_005)o).getRadius()){
			return true;
		}else{
			return false;
		}
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
