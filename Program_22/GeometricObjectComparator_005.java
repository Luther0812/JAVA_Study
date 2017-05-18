/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_22;

/**
 * @author up
 *
 */
import java.util.*;

public class GeometricObjectComparator_005 implements Comparator<GeometricObject>, java.io.Serializable{
	public int compare(GeometricObject o1, GeometricObject o2){
		double area1 = o1.getArea();
		double area2 = o2.getArea();
		
		if(area1 < area2){
			return -1;
		}else if(area1 == area2){
			return 0;
		}else{
			return 1;
		}
	}

}

abstract class GeometricObject {
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled){
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
