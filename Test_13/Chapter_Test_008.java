/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_13;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_008 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		
		try{
			String hex = input.nextLine();
			for(int i = 0; i < hex.length(); i++){
				char t = hex.charAt(i);
				if(!((t - '0') >= 0 && (t - '0') <= 15)){
					throw new HexFormatException();
				}
			}
			System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}catch(HexFormatException ex){
			System.out.println(ex);
		}
	}
	
	public static int hexToDecimal(String hex){
		int decimalValue = 0;
		for(int i = 0; i < hex.length(); i++){
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch){
		if(ch >= 'A' && ch <= 'F'){
			return 10 + ch - 'A';
		}else{
			return ch - '0';
		}
	}

}

class HexFormatException extends Exception{
	public HexFormatException(){
		super("Wrong Hex");
	}
}
