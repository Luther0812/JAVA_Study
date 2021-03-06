/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_011 {
	public static void main(String[] args){
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("The area is " + c1.getArea());
		System.out.println("The perimeter is " + c1.getPerimeter());
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}

class Circle2D{
	private double x;
	private double y;
	private double radius;
	
	public Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter(){
		return Math.PI * 2 * radius;
	}
	
	public boolean contains(double x, double y){
		double temp = Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2);
		temp = Math.sqrt(temp);
		if(temp < this.radius){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean contains(Circle2D circle){
		double temp = Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2);
		temp = Math.sqrt(temp);
		if(temp < Math.abs(this.radius - circle.radius)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean overlaps(Circle2D circle){
		double temp = Math.pow((circle.x - this.x), 2) + Math.pow((circle.y - this.y), 2);
		temp = Math.sqrt(temp);
		if((temp > Math.abs(this.radius - circle.radius)) && (temp < Math.abs(this.radius + circle.radius))){
			return true;
		}else{
			return false;
		}
	}
}
