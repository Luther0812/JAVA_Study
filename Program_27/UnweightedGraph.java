/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_27;

/**
 * @author up
 *
 */
import java.util.*;

public class UnweightedGraph<V> extends AbstractGraph<V> {
	public UnweightedGraph(int[][] edges, V[] vertices){
		super(edges, vertices);
	}
	
	public UnweightedGraph(List<Edge> edges, List<V> vertices){
		super(edges, vertices);
	}
	
	public UnweightedGraph(List<Edge> edges, int numberOfVertices){
		super(edges, numberOfVertices);
	}
	
	public UnweightedGraph(int[][] edges, int numberOfVertices){
		super(edges, numberOfVertices);
	}

	public List<Integer> getHamiltonianPath(V vertex) {
		return null;
	}

}
