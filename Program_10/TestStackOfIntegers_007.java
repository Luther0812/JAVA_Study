/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_10;

/**
 * @author LiuYu
 *
 */
public class TestStackOfIntegers_007 {
	public static void main(String[] args){
		StackOfIntegers_008 stack = new StackOfIntegers_008();
		for(int i = 0; i < 10; i++){
			stack.push(i);
		}
		while(!stack.empty()){
			System.out.print(stack.pop() + " ");
		}
	}

}
