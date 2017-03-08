/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_11;

/**
 * @author up
 *
 */
public class Chapter_Test_004 {
	public static void main(String[] args){
		MyStack s = new MyStack();
		s.add("liuyu0");
		s.add("liuyu1");
		s.add("liuyu2");
		s.add("liuyu3");
		s.add("liuyu4");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}

class MyStack extends java.util.ArrayList{
	private int size;
	
	public MyStack(){
		
	}
	
	public int getSize(){
		return this.size();
	}
	
	public void push(Object s){
		this.add(s);
	}
	
	public Object pop(){
		Object o = this.get(this.size() - 1);
		this.remove(this.size() - 1);
		return o;
	}
}
