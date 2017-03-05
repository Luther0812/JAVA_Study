/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_10;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_003 {
	public static void main(String[] args){
		MyInteger n1 = new MyInteger(6);
		boolean b1 = n1.isEven();
		boolean b2 = MyInteger.isEven(10);
		char[] c = {'1', '2', '3'};
		System.out.println(MyInteger.parseInt(c));
		String s = "123";
		System.out.println(MyInteger.parseInt(s));
	}

}

class MyInteger{
	private int value;
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		if(this.value % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isOdd(){
		if(this.value % 2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public boolean isPrime(){
		for(int i = 2; i < this.value; i++){
			if(this.value % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int number){
		if(number % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(int number){
		if(number % 2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isPrime(int number){
		for(int i = 2; i < number; i++){
			if(number % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger i){
		int number = i.value;
		if(number % 2 == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger i){
		int number = i.value;
		if(number % 2 == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean isPrime(MyInteger i){
		int number = i.value;
		for(int j = 2; j < number; j++){
			if(number % j == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int number){
		if(number == this.value){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean equals(MyInteger i){
		if(i.value == this.value){
			return true;
		}else{
			return false;
		}
	}
	
	public static int parseInt(char[] c){
		int result = 0;
		for(int i = 0; i < c.length; i++){
			result = (c[i] - '0') + result * 10;
		}
		return result;
	}
	
	public static int parseInt(String s){
		int result = 0;
		for(int i = 0; i < s.length(); i++){
			result = (s.charAt(i) - '0') + result * 10;
		}
		return result;
	}
}
