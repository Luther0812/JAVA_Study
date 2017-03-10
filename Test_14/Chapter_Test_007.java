/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_007 {
	public static void main(String[] args){
		try{
			Octagon_007 o1 = new Octagon_007(1);
			Octagon_007 o2 = (Octagon_007)o1.clone();
			System.out.print(o1.compareTo(o2));
		}catch(CloneNotSupportedException ex){
			System.out.println(ex);
		}
		
	}

}

abstract class GeometricObject_007 {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject_007(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject_007(String color, boolean filled){
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

}

class Octagon_007 extends GeometricObject_007 implements Comparable, Cloneable{
	private double side;
	
	public Octagon_007(){
		
	}
	
	public Octagon_007(double side){
		this.side = side;
	}
	
	public Octagon_007(double side, String color, boolean filled){
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public int compareTo(Object o){
		if(this.getArea() > ((Octagon_007)o).getArea()){
			return 1;
		}else if(this.getArea() < ((Octagon_007)o).getArea()){
			return -1;
		}else{
			return 0;
		}
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(double side){
		this.side = side;
	}
	
	public double getArea(){
		return (2 + 4.0 / Math.sqrt(2)) * side * side;
	}
}
