/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_002 {
	public static void main(String[] args){
		ComparableCircle c1 = new ComparableCircle(1);
		ComparableCircle c2 = new ComparableCircle(2);
		int t;
		if(c1.compareTo(c2) > 0){
			t = 1;
		}else if(c1.compareTo(c2) < 0){
			t = -1;
		}else{
			t = 0;
		}
		System.out.println(t);
	}

}

abstract class GeometicObject_002{
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometicObject_002(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometicObject_002(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public abstract double getArea();
	
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
	
}

class Circle_002 extends GeometicObject_002{
	private double radius;
	
	public Circle_002(){
		
	}
	
	public Circle_002(double radius){
		this.radius = radius;
	}
	
	public Circle_002(double radius, String color, boolean filled){
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

class ComparableCircle extends Circle_002 implements Comparable{
	public ComparableCircle(){
		super();
	}
	
	public ComparableCircle(double radius){
		super(radius);
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((ComparableCircle)o).getArea()){
			return 1;
		}else if(this.getArea() < ((ComparableCircle)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}
}
