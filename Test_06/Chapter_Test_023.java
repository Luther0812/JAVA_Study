/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_06;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_023 {
	public static void main(String[] args){
		boolean[] closet = new boolean[100];
		for(int i = 0; i < closet.length; i++){
			closet[i] = false;
		}
		
		for(int i = 1; i <= closet.length; i++){
			int j = i;
			while(j <= closet.length){
				if(closet[j - 1] == true){
					closet[j - 1] = false;
				}else{
					closet[j - 1] = true;
				}
				j = j + i;
			}
		}		
		for(boolean u: closet){
			System.out.print(u + " ");
		}
	}

}
