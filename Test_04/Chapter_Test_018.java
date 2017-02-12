/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_04;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_018 {
	public static void main(String[] args){
		for(int i1 = 1; i1 <= 6; i1++){
			for(int j1 = 1; j1 <= i1; j1++){
				System.out.print(j1 + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("---------------------------------------");
		
		for(int i2 = 1; i2 <= 6; i2++){
			for(int j2 = 1; j2 <= (7 - i2); j2++){
				System.out.print(j2 + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("---------------------------------------");
		
		for(int i3 = 1; i3 <= 6; i3++){
			for(int j3 = 1; j3 <= (7 - i3); j3++){
				System.out.print("  ");
			}
			int t = i3;
			for(; t >= 1; t--){
				System.out.print(t + " ");
			}
			System.out.print("\n");
		}
		
		System.out.println("---------------------------------------");
		
		for(int i4 = 1; i4 <= 6; i4++){
			for(int t4 = 1; t4 < i4; t4++){
				System.out.print("  ");
			}
			for(int j4 = 1; j4 <= (7 - i4); j4++){
				System.out.print(j4 + " ");
			}
			System.out.print("\n");
		}
		
	}

}
