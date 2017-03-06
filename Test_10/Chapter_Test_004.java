/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author up
 *
 */
public class Chapter_Test_004 {
	public static void main(String[] args){
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println("The distance is " + MyPoint.distance(p1, p2));
	}

}

class MyPoint{
	private double x;
	private double y;
	
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public static double distance(MyPoint a, MyPoint b){
		double result = Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2);
		result = Math.sqrt(result);
		return result;
	}
	
	public static double distance(double x1, double y1, double x2, double y2){
		double temp = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
		double result = Math.sqrt(temp);
		return result;
	}
}
