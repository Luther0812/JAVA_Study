/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_019 {
	public static void main(String[] args) throws Exception{
		java.io.File file = new java.io.File("data.txt");
		if(file.exists()){
			System.out.println("The file already exists");
			System.exit(0);
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		for(int i = 0; i < 100; i++){
			int temp = (int)(Math.random() * 100);
			output.print(temp);
			output.print(" ");
		}
		output.close();
		
		Scanner input = new Scanner(file);
		int[] list = new int[100];
		int t = 0;
		while(input.hasNext()){
			String s = input.next();
			list[t] = Integer.valueOf(s);
			t++;
		}
		for(int i = 0; i < list.length; i++){
			for(int j = i + 1; j < list.length; j++){
				if(list[i] > list[j]){
					int k = list[i];
					list[i] = list[j];
					list[j] = k;
				}
			}
		}
		for(int u: list){
			System.out.print(u + " ");
		}
	}

}
