/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_27;

/**
 * @author up
 *
 */
import java.util.*;

public class KnightTourModel {
	private UnweightedGraph<Integer> graph;
	
	public KnightTourModel(){
		ArrayList<AbstractGraph.Edge> edges = getEdges();
		
		graph = new UnweightedGraph<Integer>(edges, 64);
	}
	
	public List<Integer> getHamiltonianPath(int v){
		return graph.getHamiltonianPath(v);
	}
	
	public static ArrayList<AbstractGraph.Edge> getEdges(){
		ArrayList<AbstractGraph.Edge> edges = new ArrayList<AbstractGraph.Edge>();
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				int  u = i * 8 + j;
				
				if(i - 1 >= 0 && j - 2 >= 0){
					int v1 = (i - 1) * 8 + (j - 2);
					edges.add(new AbstractGraph.Edge(u, v1));
				}
				
				if(i - 2 >= 0 && j - 1 >= 0){
					int v2 = (i - 2) * 8 + (j - 1);
					edges.add(new AbstractGraph.Edge(u, v2));
				}
				
				if(i - 2 >= 0 && j + 1 <= 7){
					int v3 = (i - 2) * 8 + (j + 1);
					edges.add(new AbstractGraph.Edge(u, v3));
				}
				
				if(i - 1 >= 0 && j + 2 <= 7){
					int v4 = (i - 1) * 8 + (j + 2);
					edges.add(new AbstractGraph.Edge(u, v4));
				}
				
				if(i + 1 <= 7 && j + 2 <= 7){
					int v5 = (i + 1) * 8 + (j + 2);
					edges.add(new AbstractGraph.Edge(u, v5));
				}
				
				if(i + 2 <= 7 && j + 1 <= 7){
					int v6 = (i + 2) * 8 + (j + 1);
					edges.add(new AbstractGraph.Edge(u, v6));
				}
				
				if(i + 2 <= 7 && j - 1 >= 0){
					int v7 = (i + 2) * 8 + (j - 1);
					edges.add(new AbstractGraph.Edge(u, v7));
				}
				
				if(i + 1 <= 7 && j - 2 >= 0){
					int v8 = (i + 1) * 8 + (j - 2);
					edges.add(new AbstractGraph.Edge(u, v8));
				}
			}
		}
		
		return edges;
	}

}
