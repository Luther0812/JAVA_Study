/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_018 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.dat");
		RandomAccessFile input = new RandomAccessFile(file, "r");
		double length = input.length();
		int count = 0;
		try{
			while(count < length){
				int t = input.readInt();
				String str = getBits(t);
				System.out.println(str);
				count++;
			}
		}catch(EOFException ex){
			System.out.println("End");
		}
	}
	
	public static String getBits(int value){
		int number = value;
		String result = "";
		if(number > 0){
			int numberCount = 0;
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
				numberCount++;
			}
			result = String.valueOf(number) + result;
			for(int t = 1; t <= (15 - numberCount); t++){
				result = "0" + result;
			}
			return result;
		}else{
			number = Math.abs(number);
			int numberCount = 0;
			while(Math.abs(number) >= 2){
				int temp = number % 2;
				String t = String.valueOf(temp);
				result = t + result;
				number = number / 2;
				numberCount++;
			}
			result = String.valueOf(number) + result;
			for(int t = 1; t <= (14 - numberCount); t++){
				result = "0" + result;
			}
			result = "1" + result;
			return result;
		}
	}

}
