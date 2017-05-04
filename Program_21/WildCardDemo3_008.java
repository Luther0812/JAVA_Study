/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class WildCardDemo3_008 {
	public static void main(String[] args){
		GenericStack_001<String> stack1 = new GenericStack_001<String>();
		GenericStack_001<Object> stack2 = new GenericStack_001<Object>();
		stack2.push("Java");
		stack2.push(2);
		stack1.push("Sun");
		add(stack1, stack2);
		WildCardDemo2_007.print(stack2);
	}
	
	public static <E> void add(GenericStack_001<E> stack1, GenericStack_001<? super E> stack2){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
	}

}
