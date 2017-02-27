/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class TestPassObject_011 {
	public static void main(String[] args){
		Circle3_009 myCircle = new Circle3_009(1);
		int n = 5;
		printAreas(myCircle, n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	public static void printAreas(Circle3_009 c, int times){
		System.out.println("Radius \t\tArea");
		while(times >= 1){
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}

}
