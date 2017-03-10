/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		GeometricObject_008[] list = {new Circle_008(1), new Circle_008(2), new Rectangle_008(1, 2), new Rectangle_008(2, 3)};
		System.out.println("The area is " + sumArea(list));
	}
	
	public static double sumArea(GeometricObject_008[] a){
		double result = 0;
		for(int i = 0; i < a.length; i++){
			result += a[i].getArea();
		}
		return result;
	}

}

abstract class GeometricObject_008 {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject_008(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject_008(String color, boolean filled){
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

class Rectangle_008 extends GeometricObject_008 implements Comparable{
	private double width;
	private double height;
	
	public Rectangle_008(){
		
	}
	
	public Rectangle_008(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle_008(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((Rectangle_008)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Rectangle_008)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public boolean equals(Object o){
		if(this.getArea() == ((Rectangle_008)o).getArea()){
			return true;
		}else{
			return false;
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

class Circle_008 extends GeometricObject_008 implements Comparable{
	private double radius;
	
	public Circle_008(){
		
	}
	
	public Circle_008(double radius){
		this.radius = radius;
	}
	
	public Circle_008(double radius, String color, boolean filled){
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
