/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_022 {
	public static void main(String[] args){
		int start = 001234567;
//		System.out.println(start);
		int end = 076543210;
		int count = 0;
		for(int i = start; i <= end; i++){
			boolean isValid = isValid(i);
			if(isValid){
				if(++count % 7 == 0){
					System.out.println(Integer.toOctalString(i) + ": " + isValid);
				}else{
					System.out.print(Integer.toOctalString(i) + ": " + isValid + " ");
				}
			}
		}
		System.out.println("count = " + count);
		
	}
	
	public static boolean isValid(int number){
		String num = Integer.toOctalString(number);
		int size = num.length();
		if(size == 7){
			num = '0' + num;
			size++;
		}
		for(int i = 1; i < size; i++){
			for(int j = i - 1; j >= 0; j--){
				if(num.charAt(i) == num.charAt(j)){
					return false;
				}
				if(i - j == Math.abs(num.charAt(i) - num.charAt(j))){
					return false;
				}
			}
		}
		return true;
	}

}
