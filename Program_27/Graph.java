/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_27;

/**
 * @author up
 *
 */
public interface Graph<V> {
	public int getSize();
	
	public java.util.List<V> getVertices();
	
	public V getVertex(int index);
	
	public int getIndex(V v);
	
	public java.util.List<Integer> getNeighbors(int index);
	
	public int getDegree(int v);
	
	public int[][] getAdjacencyMatrix();
	
	public void printAdjacencyMatrix();
	
	public void printEdges();
	
	public AbstractGraph<V>.Tree dfs(int v);
	
	public AbstractGraph<V>.Tree bfs(int v);
	
	public java.util.List<Integer> getHamiltonianPath(V vertex);
	
	public java.util.List<Integer> getHamiltonianPath(int index);

}
