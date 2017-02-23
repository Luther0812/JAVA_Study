/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author up
 *
 */
import java.util.Scanner;

public class Chapter_Test_021 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of balls to drop: ");
		int balls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int slot = input.nextInt();
		
		int[] slots = new int[slot];
		for(int i = 1; i <= balls; i++){
			for(int j = 1; j <= slot; j++){
				int place = (int)(Math.random() * 2);
				if(place == 0){
					System.out.print("L");
				}else{
					System.out.print("R");
					slots[i]++;
				}
			}
			System.out.println();
		}
		int max = max(slots);
//		for(int i = 0; i < max; i++){
//			for(int j = 0; j < slot; j++){
//				if(slots[j] == max - i){
//					System.out.print("0");
//					slots[j]--;
//				}else{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		for(int i = 0;i < max;i++){  
            for(int j = 0;j < slot;j++){  
                if(slots[j] == max - i){  
                    System.out.print('0');  
                    slots[j]--;  
                }  
                else  
                    System.out.print(' ');  
            }  
            System.out.println();  
        }
		
	}
	
	public static int max(int[] slots){
		int max = slots[0];
		for(int i = 0; i < slots.length; i++){
			if(slots[i] > max){
				max = slots[i];
			}
		}
		return max;
	}

}
