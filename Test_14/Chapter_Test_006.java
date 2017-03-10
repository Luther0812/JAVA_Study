/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_006 {
	public static void main(String[] args){
		Rectangle_006 r1 = new Rectangle_006(1, 2);
		Rectangle_006 r2 = new Rectangle_006(0.5, 4);
		System.out.println(r1.equals(r2));
		
	}

}

abstract class GeometricObject_006 {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject_006(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject_006(String color, boolean filled){
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

class Rectangle_006 extends GeometricObject_006 implements Comparable{
	private double width;
	private double height;
	
	public Rectangle_006(){
		
	}
	
	public Rectangle_006(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public Rectangle_006(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((Rectangle_006)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Rectangle_006)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public boolean equals(Object o){
		if(this.getArea() == ((Rectangle_006)o).getArea()){
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
