/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_001 {
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		System.out.println("The Rectangle r1's width is " + r1.width + " and r1's height is " + r1.height + 
				" and r1's area is " + r1.getArea() + " and r1's perimeter is " + r1.getPerimeter());
		
		System.out.println("The Rectangle r2's width is " + r2.width + " and r2's height is " + r2.height + 
				" and r2's area is " + r2.getArea() + " and r2's perimeter is " + r2.getPerimeter());
	}

}

class Rectangle{
	public double width;
	public double height;
	
	Rectangle(){
		width = 1;
		height = 1;
	}
	
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter(){
		return 2 * (width + height);
	}
}
