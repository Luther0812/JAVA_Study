/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_21;

/**
 * @author up
 *
 */
public class GenericStack_001<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
	
	public int getSize(){
		return list.size();
	}
	
	public E peek(){
		return list.get(getSize() - 1);
	}
	
	public void push(E o){
		list.add(o);
	}
	
	public E pop(){
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public static void main(String[] args){
		GenericStack_001<String> stack1 = new GenericStack_001<String>();
		stack1.push("London");
		stack1.push("Paris");
		stack1.push("Berlin");
		
		GenericStack_001<Integer> stack2 = new GenericStack_001<Integer>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
	}

}
