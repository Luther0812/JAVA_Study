/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_25;

/**
 * @author up
 *
 */
public class TestStackQueue {
	public static void main(String[] args){
		GenericStack<String> stack = new GenericStack<String>();
		
		stack.push("Tom");
		System.out.println("(1) " + stack);
		
		stack.push("John");
		System.out.println("(2) " + stack);
		
		stack.push("George");
		stack.push("Michael");
		System.out.println("(3) " + stack);
		
		System.out.println("(4) " + stack.pop());
		System.out.println("(5) " + stack.pop());
		System.out.println("(6) " + stack);
		
		GenericQueue<String> queue = new GenericQueue<String>();
		
		queue.enqueue("Tom");
		System.out.println("(7) " + queue);
		
		queue.enqueue("John");
		System.out.println("(8) " + queue);
		
		queue.enqueue("George");
		queue.enqueue("Michael");
		System.out.println("(9) " + queue);
		
		System.out.println("(10) " + queue.dequeue());
		System.out.println("(11) " + queue.dequeue());
		System.out.println("(12) " + queue);
	}

}
