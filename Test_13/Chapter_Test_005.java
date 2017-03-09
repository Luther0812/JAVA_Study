/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
public class Chapter_Test_005 {
	public static void main(String[] args){
		try{
			Triangle t = new Triangle(1, 2, 3, "Yellow", true);
		}catch(IllegalTriangleException ex){
			ex.getMessage();
			System.out.println(ex.getStackTrace());
		}
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
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException{
		if((side1 + side2) > side3 && (side3 + side2) > side1 && (side1 + side3) > side2){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			setColor(color);
			setFilled(filled);
		}else{
			throw new IllegalTriangleException("Wrong side");
		}
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

class IllegalTriangleException extends Exception{
	public IllegalTriangleException(){
		super("Wrong");
	}
	
	public IllegalTriangleException(String temp){
		System.out.println(temp);
	}
}
