/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class WildCardDemo1_006 {
	public static void main(String[] args){
		GenericStack_001<Integer> intStack = new GenericStack_001<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		
		System.out.print("The max number is " + max(intStack));
	}
	
	public static double max(GenericStack_001<? extends Number> stack){
		double max = stack.pop().doubleValue();
		
		while(!stack.isEmpty()){
			double value = stack.pop().doubleValue();
			if(value > max){
				max = value;
			}
		}
		
		return max;
	}

}
