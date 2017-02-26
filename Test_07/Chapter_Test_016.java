/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_016 {
	public static void main(String[] args){
		int[][] m = {
				{4, 2},
				{1, 7},
				{4, 5},
				{1, 2},
				{1, 1},
				{4, 1}
		};
		
		sort(m);
		
	}
	
	public static void sort(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 1 + i; j < m.length; j++){
				if(m[j][0] < m[i][0]){
					int t = m[i][0];
					m[i][0] = m[j][0];
					m[j][0] = t;
				}
			}
		}
		for(int i = 0; i < m.length; i++){
			for(int j = 1 + i; j < m.length; j++){
				if(m[j][1] < m[i][1] && m[j][0] == m[i][0]){
					int t = m[i][1];
					m[i][1] = m[j][1];
					m[j][1] = t;
				}
			}
		}
		for(int i = 0; i < m.length; i++){
			System.out.println("(" + m[i][0] + ", " + m[i][1] + ")");
		}
	}

}
