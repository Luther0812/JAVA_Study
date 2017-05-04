/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class WildCardDemo2_007 {
	public static void main(String[] args){
		GenericStack_001<Integer> intStack = new GenericStack_001<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		
		print(intStack);
	}
	
	public static void print(GenericStack_001<?> stack){
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}

}
