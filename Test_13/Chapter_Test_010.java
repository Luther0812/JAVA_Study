/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
public class Chapter_Test_010 {
	public static void main(String[] args){
		try{
			method();
		}catch(OutOfMemoryError ex){
			System.out.println(ex);
		}
	}
	
	public static void method(){
		throw new OutOfMemoryError("OutOfMemoryError");
	}

}
