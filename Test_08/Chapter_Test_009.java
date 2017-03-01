/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_009 {
	public static void main(String[] args){
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("r1's perimeter and area are: " + r1.getPerimeter() + " " + r1.getArea());
		System.out.println("r2's perimeter and area are: " + r2.getPerimeter() + " " + r2.getArea());
		System.out.println("r3's perimeter and area are: " + r3.getPerimeter() + " " + r3.getArea());
	}

}

class RegularPolygon{
	private int n = 3;
	private double side = 0;
	private double x = 0;
	private double y = 0;
	
	RegularPolygon(){
		
	}
	
	RegularPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
	}
	
	RegularPolygon(int newN, double newSide, double newX, double newY){
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	public int getN(){
		return n;
	}
	
	public void setN(int newN){
		n = newN;
	}
	
	public double getSide(){
		return side;
	}
	
	public void setSide(int newSide){
		side = newSide;
	}
	
	public double getX(){
		return x;
	}
	
	public void setX(int newX){
		x = newX;
	}
	
	public double getY(){
		return y;
	}
	
	public void setY(int newY){
		y = newY;
	}
	
	public double getPerimeter(){
		return side * n;
	}
	
	public double getArea(){
		return (n * side * side) / (4 * Math.tan((Math.PI / n)));
	}
}
