/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author up
 *
 */
public class Chapter_Test_006 {
	public static void main(String[] args){
		int number = 120;
		StackOfIntegers s = new StackOfIntegers();	
		int num = 2;
		boolean flag = false;
		while(num <= number){
			for(int i = 2; i < num; i++){
				if(num % i == 0){
					flag = true;
					break;
				}
			}
			if(flag != true){
				s.push(num);
			}
			flag = false;
			num++;
		}
		while(s.getSize() != 0){
			System.out.print(s.pop() + " ");
		}
	}

}
