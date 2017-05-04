/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class TestRationalMatrix_013 {
	public static void main(String[] args){
		Rational[][] m1 = new Rational[3][3];
		Rational[][] m2 = new Rational[3][3];
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[0].length; j++){
				m1[i][j] = new Rational(i + 1, j + 5);
				m2[i][j] = new Rational(i + 1, j + 6);
			}
		}
		
		RationalMatrix_011 rationalMatrix = new RationalMatrix_011();
		System.out.println("\nm1 + m2 is ");
		GenericMatrix_009.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '+');
		
		System.out.println("\nm1 * m2 is ");
		GenericMatrix_009.printResult(m1, m2, rationalMatrix.addMatrix(m1, m2), '8');
	}

}
