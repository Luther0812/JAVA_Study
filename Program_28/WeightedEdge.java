package Program_28;
/**Language:Java Standard Edition
 * Author:Luther
 */

/**
 * @author up
 *
 */
import Program_27.AbstractGraph;

public class WeightedEdge extends AbstractGraph.Edge implements Comparable<WeightedEdge> {
	public int weight;
	
	public WeightedEdge(int u, int v, int weight){
		super(u, v);
		this.weight = weight;
	}
	
	public int CompareTo(WeightedEdge edge){
		if(weight > edge.weight){
			return 1;
		}else if(weight == edge.weight){
			return 0;
		}else{
			return -1;
		}
	}

	public int compareTo(WeightedEdge o) {
		return 0;
	}

}
