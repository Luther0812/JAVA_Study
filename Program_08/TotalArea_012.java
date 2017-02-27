/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_08;

/**
 * @author up
 *
 */
public class TotalArea_012 {
	public static void main(String[] args){
		Circle3_009[] circleArray;
		circleArray = createCircleArray();
		printCircleArray(circleArray);
	}
	public static Circle3_009[] createCircleArray(){
		Circle3_009[] circleArray = new Circle3_009[5];
		for(int i = 0; i < circleArray.length; i++){
			circleArray[i] = new Circle3_009(Math.random() * 100);
		}
		return circleArray;
	}
	
	public static void printCircleArray(Circle3_009[] circleArray){
		System.out.printf("%-30s%-15s\n", "Radius", "Area");
		for(int i = 0; i < circleArray.length; i++){
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
		}
		System.out.println("------------------------------------------------------");
		System.out.printf("%-30s%-15f\n", "The total area of circles is", sum(circleArray));
	}
	
	public static double sum(Circle3_009[] circleArray){
		double sum = 0;
		for(int i = 0; i < circleArray.length; i++){
			sum += circleArray[i].getArea();
		}
		return sum;
	}

}
