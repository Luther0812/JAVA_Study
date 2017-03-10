/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_003 {
	public static void main(String[] args){
		GeometicObject_003[] list = {new Square(1, 2), new Square(2, 3), new Square(3, 4), new Square(4, 5), new Square(5, 6)};
		for(int i = 0; i < list.length; i++){
			if(list[i] instanceof Colorable){
				System.out.println(((Square)list[i]).howToColor());
			}
		}
		
	}

}

abstract class GeometicObject_003{
	private String color = "White";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometicObject_003(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometicObject_003(String color, boolean filled){
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

class Square extends GeometicObject_003 implements Colorable{
	private double width;
	private double height;
	
	public Square(){
		super();
	}
	
	public Square(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	
	public String howToColor(){
		return "Color all four";
	}
}
