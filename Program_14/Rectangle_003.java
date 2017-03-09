/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author up
 *
 */
public class Rectangle_003 {
	public static void main(String[] args){
		GeometricObject_001 r = new Rectangle(1, 2);
		System.out.println(r.getArea());
	}

}

class Rectangle extends GeometricObject_001{
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
