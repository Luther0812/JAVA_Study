/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
public class UseBMIClass_003 {
	public static void main(String[] args){
		BMI_004 bmi1 = new BMI_004("John Doe", 18, 145, 70);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI_004 bmi2 = new BMI_004("Peter Kine", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
