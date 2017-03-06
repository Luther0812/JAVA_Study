/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_012 {
	public static void main(String[] args){
		MyRectangle2D r1 = new MyRectangle2D(2, 3, 5.5, 4.9);
		System.out.println("The area is "+ r1.getArea());
		System.out.println("The perimeter is "+ r1.getPerimeter());
		System.out.println(r1.contains(3, 3));
		System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));
	}

}

class MyRectangle2D{
	private double x;
	private double y;
	private double width;
	private double height;
	
	public MyRectangle2D(){
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.height = 1;
	}
	
	public MyRectangle2D(double x, double y, double width, double height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getArea(){
		return this.width * this.height;
	}
	
	public double getPerimeter(){
		return 2 * (this.width + this.height);
	}
	
	public boolean contains(double x, double y){
		double a = Math.abs(x - this.x);
		double b = Math.abs(y - this.y);
		if(a < (this.width / 2) && b < (this.height / 2)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean contains(MyRectangle2D r){
		double a = Math.abs(r.x - this.x);
		double b = Math.abs(r.y - this.y);
		if(a < (this.width / 2) && b < (this.height / 2)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean overlaps(MyRectangle2D r){
		double a = Math.abs(r.x - this.x);
		double b = Math.abs(r.y - this.y);
		double t1 = Math.abs(r.width / 2 - this.width / 2);
		double t2 = Math.abs(r.height / 2 - this.height / 2);
		if(a > t1 && b > t2 && a < (this.width / 2 + r.width / 2) && b < (this.height / 2 + r.height / 2)){
			return true;
		}else{
			return false;
		}
	}
}
