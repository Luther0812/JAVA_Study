/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

/**
 * @author up
 *
 */
public class Chapter_Test_004 {
	public static void main(String[] args){
		try{
			House h1 = new House(1, 1750.50);
			House h2 = (House)h1.clone();
			h2.setWhenBuilt();
			System.out.println(h1.getWhenBuilt());
			System.out.println(h2.getWhenBuilt());
			System.out.println(h1 == h2);
		}catch(CloneNotSupportedException ex){
			System.out.println(ex);
		}
	}

}

class House implements Cloneable, Comparable{
	private int id;
	private double area;
	private java.util.Date whenBuilt;
	
	public House(int id, double area){
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
	
	public void setWhenBuilt(){
		this.whenBuilt.setTime(1000);
	}
	
	public Object clone() throws CloneNotSupportedException{
		House o = (House)super.clone();
		o.whenBuilt = (java.util.Date) this.getWhenBuilt().clone();
		return o;
	}
	
	public int compareTo(Object o){
		if(this.area > ((House)o).area){
			return 1;
		}else if(area < ((House)o).area){
			return -1;
		}else{
			return 0;
		}
	}

}
