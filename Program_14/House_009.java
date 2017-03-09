/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_14;

/**
 * @author LiuYu
 *
 */
public class House_009 implements Cloneable, Comparable{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House_009(int id, double area){
		this.id = id;
		this.area = area;
		whenBuilt = new java.util.Date();
	}
	
	public int getId(){
		return id;
	}
	
	public double getArea(){
		return area;
	}
	
	public java.util.Date getWhenBuilt(){
		return whenBuilt;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public int compareTo(Object o){
		if(this.area > ((House_009)o).area){
			return 1;
		}else if(area < ((House_009)o).area){
			return -1;
		}else{
			return 0;
		}
	}

}
