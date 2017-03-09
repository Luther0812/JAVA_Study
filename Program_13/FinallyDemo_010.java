/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_13;

/**
 * @author up
 *
 */
public class FinallyDemo_010 {
	public static void main(String[] args){
		java.io.PrintWriter output = null;
		try{
			output = new java.io.PrintWriter("text.txt");
			output.println("Welcome to Java");
		}catch(java.io.IOException ex){
			ex.printStackTrace();
		}finally{
			if(output != null){
				output.close();
			}
		}
		
		System.out.println("End of program");
	}

}
