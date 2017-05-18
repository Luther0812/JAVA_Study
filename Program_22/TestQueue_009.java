/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_22;

/**
 * @author up
 *
 */
import java.util.*;

public class TestQueue_009 {
	public static void main(String[] args){
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");
		
		while(queue.size() > 0){
			System.out.print(queue.remove() + " ");
		}
	}

}
