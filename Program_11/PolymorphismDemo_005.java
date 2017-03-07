/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_11;

/**
 * @author LiuYu
 *
 */
public class PolymorphismDemo_005 {
	public static void main(String[] args){
		displayObject(new Circle4_002(1, "red", false));
		displayObject(new Rectangle1_003(1, 1, "black", true));
	}
	
	public static void displayObject(GeometricObject1_001 object){
		System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
	}

}
