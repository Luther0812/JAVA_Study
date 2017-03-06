/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
import java.awt.geom.*;

public class Chapter_Test_013 {
	public static void main(String[] args){
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5 ,2), new MyPoint(4.2 ,3), new MyPoint(5 ,3.5));
		System.out.println("The area is " + t1.getArea());
		System.out.println("The perimeter is " + t1.getPerimeter());
		System.out.println(t1.contains(new MyPoint(3, 3)));
		System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
	}

}

class Triangle2D{
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;
	
	public Triangle2D(){
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double getArea(){
		double n1 = MyPoint.distance(p1, p2);
		double n2 = MyPoint.distance(p1, p3);
		double n3 = MyPoint.distance(p2, p3);
		
		double s = (n1 + n2 + n3) / 2;
		double temp = s * (s - n1) * (s - n2) * (s - n3);
		double area = Math.pow(temp, 0.5);
		return area;
	}
	
	public double getPerimeter(){
		double n1 = MyPoint.distance(p1, p2);
		double n2 = MyPoint.distance(p1, p3);
		double n3 = MyPoint.distance(p2, p3);
		return n1 + n2 + n3;
	}
	
	public boolean contains(MyPoint p){
		Line2D.Double l1 = new Line2D.Double(p.getX(), p.getY(), this.p1.getX(), this.p1.getY());
		Line2D.Double l2 = new Line2D.Double(p.getX(), p.getY(), this.p2.getX(), this.p2.getY());
		Line2D.Double l3 = new Line2D.Double(p.getX(), p.getY(), this.p3.getX(), this.p3.getY());
		
		Line2D.Double n1 = new Line2D.Double(this.p2.getX(), this.p2.getY(), this.p1.getX(), this.p1.getY());
		Line2D.Double n2 = new Line2D.Double(this.p3.getX(), this.p3.getY(), this.p2.getX(), this.p2.getY());
		Line2D.Double n3 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY());
		
		if(!l1.intersectsLine(n2) && !l2.intersectsLine(n3) && !l3.intersectsLine(n1)){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean contains(Triangle2D t){
		boolean p1 = this.contains(t.p1);
		boolean p2 = this.contains(t.p3);
		boolean p3 = this.contains(t.p3);
		if(p1 && p2 && p3){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean overlaps(Triangle2D t){
		Line2D.Double n1 = new Line2D.Double(this.p2.getX(), this.p2.getY(), this.p1.getX(), this.p1.getY());
		Line2D.Double n2 = new Line2D.Double(this.p3.getX(), this.p3.getY(), this.p2.getX(), this.p2.getY());
		Line2D.Double n3 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY());
		
		Line2D.Double l1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
		Line2D.Double l2 = new Line2D.Double(t.p3.getX(), t.p3.getY(), t.p2.getX(), t.p2.getY());
		Line2D.Double l3 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
		boolean o1 = ((l1.intersectsLine(n1)) && (l1.intersectsLine(n2)));
		boolean o2 = ((l1.intersectsLine(n3)) && (l1.intersectsLine(n2)));
		boolean o3 = ((l1.intersectsLine(n1)) && (l1.intersectsLine(n3)));
		boolean o = (o1 || o2 || o3);
		boolean m1 = ((l2.intersectsLine(n1)) && (l2.intersectsLine(n2)));
		boolean m2 = ((l2.intersectsLine(n3)) && (l2.intersectsLine(n2)));
		boolean m3 = ((l2.intersectsLine(n1)) && (l2.intersectsLine(n3)));
		boolean m = (m1 || m2 || m3);
		boolean e1 = ((l3.intersectsLine(n1)) && (l3.intersectsLine(n2)));
		boolean e2 = ((l3.intersectsLine(n3)) && (l3.intersectsLine(n2)));
		boolean e3 = ((l3.intersectsLine(n1)) && (l3.intersectsLine(n3)));
		boolean e = (e1 || e2 || e3);
		boolean k = (o || m || e);
		if(k){
			return true;
		}else{
			return false;
		}
	}
	
}
