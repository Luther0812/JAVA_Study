/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class TestIntegerMatrix_012 {
	public static void main(String[] args){
		Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
		Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
		
		IntegerMatrix_010 integerMatrix = new IntegerMatrix_010();
		
		System.out.println("\nm1 + m2 is ");
		GenericMatrix_009.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
		
		System.out.println("\nm1 * m2 is ");
		GenericMatrix_009.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
	}

}
