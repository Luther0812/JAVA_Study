/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
public class Chapter_Test_020 {
	public static void main(String[] args){
		int[] list = new int[8];
		for(int i = 0; i < list.length; i++){
			list[i] = i;
		}
		
		boolean isValid = true;
		while(isValid){
			isValid = false;
			for(int i = 0; i < list.length; i++){
				int index = (int)(Math.random() * 8);
				if(index != i){
					int temp = list[i];
					list[i] = list[index];
					list[index] = temp;
				}
			}
			
			for(int i = 0; i < list.length; i++){
				for(int j = i + 1; j < list.length; j++){
					if(j - i == Math.abs(list[j] - list[i])){
						isValid = true;
						break;
					}
				}
			}
		}
		for(int u: list){
			System.out.print(u);
		}
	}

}
