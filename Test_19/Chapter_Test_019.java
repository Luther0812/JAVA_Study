/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_19;

/**
 * @author LiuYu
 *
 */
import java.io.*;

public class Chapter_Test_019 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("test.dat");
		RandomAccessFile input = new RandomAccessFile(file, "r");
		double length = input.length();
		int count = 0;
		try{
			while(count < length){
				int t = input.readInt();
				String str = getHexBits(t);
				System.out.println(str);
				count++;
			}
		}catch(EOFException ex){
			System.out.println("End");
		}
	}
	
	public static String getHexBits(int value){
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
			int length = result.length();
			if(length % 8 == 0){
				String h = Hex(result);
				return h;
			}else{
				int t = (length / 8 + 1) * 8;
				while(t > result.length()){
					result = "0" + result;
				}
				String h = Hex(result);
				return h;
			}
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
			int length = result.length();
			if(length % 8 == 0){
				String h = Hex(result);
				return h;
			}else{
				int t = (length / 8 + 1) * 8;
				while(t > result.length()){
					result = "0" + result;
				}
				String h = Hex(result);
				return h;
			}
		}
	}
	
	public static String Hex(String str){
		int length = str.length();
		int count = length / 8;
		String result = "";
		for(int i = 0; i < count; i++){
			String s1 = "";
			String s2 = "";
			for(int j = 0; j < 8; j++){
				if(j < 4){
					s1 = str.charAt(length - 1 - 8 * i -j) + s1;
				}else{
					s2 = str.charAt(length - 1 - 8 * i -j) + s2;
				}
			}
			String temp1 = stringToHex(s1);
			String temp2 = stringToHex(s2);
			result = temp2 + temp1 + " " + result;
		}
		return result;
		
	}
	
	public static String stringToHex(String str){
		int temp = 0;
		for(int i = 0; i < str.length(); i++){
			temp += (str.charAt(3 - i) - '0') * Math.pow(2, i);
		}
		if(temp < 10){
			return temp + "";
		}else{
			switch (temp){
			case 10:
				return "A";
			case 11:
				return "B";
			case 12:
				return "C";
			case 13:
				return "D";
			case 14:
				return "E";
			case 15:
				return "F";
			default:
				return "";
			}
		}
	}

}
