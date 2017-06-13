/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_25;

/**
 * @author up
 *
 */
import Program_24.Heap;

public class MyPriorityQueue<E extends Comparable> {
	private Heap<E> heap = new Heap<E>();
	
	public void enqueue(E newObject){
		heap.add(newObject);
	}
	
	public E dequeue(){
		return heap.remove();
	}
	
	public int getSize(){
		return heap.getSize();
	}

}
