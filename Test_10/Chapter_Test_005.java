/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_005 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		StackOfIntegers s = new StackOfIntegers();	
		int num = 2;
		while(num <= number){
			if(number % num == 0){
				s.push(num);
				number = number / num;
			}else{
				num++;
			}
			
		}
		while(s.getSize() != 0){
			System.out.print(s.pop() + " ");
		}
	}

}

class StackOfIntegers{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	public StackOfIntegers(){
		this(DEFAULT_CAPACITY);
	}
	
	public StackOfIntegers(int capacity){
		elements = new int[capacity];
	}
	
	public void push(int value){
		if(size >= elements.length){
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = value;
	}
	
	public int pop(){
		return elements[--size];
	}
	
	public int peek(){
		return elements[size - 1];
	}
	
	public boolean empty(){
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}
}
