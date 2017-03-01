/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_08;

/**
 * @author up
 *
 */
public class Chapter_Test_008 {
	public static void main(String[] args){
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("yellow");
		f1.setOn(true);
		
		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setColor("blue");
		f2.setOn(false);
		
		f1.t();
		f2.t();
	}

}

class Fan{
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	Fan(){
		
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int newSpeed){
		speed = newSpeed;
	}
	
	public boolean getOn(){
		return on;
	}
	
	public void setOn(boolean newOn){
		on = newOn;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double newRadius){
		radius = newRadius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public void t(){
		if(on == true){
			System.out.println("Tht fan is " + speed + " " + color + " " + radius);;
		}else{
			System.out.println("Tht fan is off");
		}
	}
}
