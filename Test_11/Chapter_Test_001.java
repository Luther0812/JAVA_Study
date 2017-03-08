/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

/**
 * @author up
 *
 */
public class Chapter_Test_001 {
	public static void main(String[] args){
		Triangle t = new Triangle(1, 1.5, 1, "yellow", true);
		System.out.println("The area is " + t.getArea());
		System.out.println("The perimeter is " + t.getPerimeter());
		System.out.println(t.toString());
	}

}

class GeometricObject{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
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
		return "Created on " + dateCreated + "\ncolor" + color + " and filled: " + filled;
	}
}

class Triangle extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle(){
		
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide1(){
		return side1;
	}
	
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	public double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double temp = s * (s - side1) * (s - side2) * (s - side3);
		double area = Math.pow(temp, 0.5);
		return area;
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		return super.toString();
	}
}
