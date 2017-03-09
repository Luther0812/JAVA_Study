/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_001 {
	public static void main(String[] args){
		GeometicObject c = new Circle(1);
		GeometicObject r = new Rectangle(1, 2);
		System.out.println(GeometicObject.max(c, r));
	}

}

abstract class GeometicObject implements Comparable{
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometicObject(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometicObject(String color, boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public static Comparable max(Comparable c1, Comparable c2){
		if(((Circle)c1).getArea() > ((Rectangle)c2).getArea()){
			return c1;
		}else{
			return c2;
		}
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
	
}

class Circle extends GeometicObject{
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
	
	public int compareTo(Object o){
		if(this.getArea() > ((Circle)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Circle)o).getArea()){
			return -1;
		}else{
			return 0;
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

class Rectangle extends GeometicObject{
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
	
	public int compareTo(Object o){
		if(this.getArea() > ((Rectangle)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Rectangle)o).getArea()){
			return -1;
		}else{
			return 0;
		}
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
