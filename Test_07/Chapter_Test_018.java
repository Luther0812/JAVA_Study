/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_018 {
	public static void main(String[] args){
		int[][] m = {
				{1, 2},
				{3, 4},
				{5, 6},
				{7, 8},
				{9, 10}
		};
		
		shuffle(m);
	}
	
	public static void shuffle(int[][] m){
		int num = m.length;
		int a = 0;
		int b = 0;
		while(a == b){
			a = (int)(Math.random() * num);
			b = (int)(Math.random() * num);
		}
		int[][] t = new int[1][2];
		t[0][0] = m[a][0];
		t[0][1] = m[a][1];
		m[a][0] = m[b][0];
		m[a][1] = m[b][1];
		m[b][0] = t[0][0];
		m[b][1] = t[0][1];
		for(int i = 0; i < m.length; i++){
			System.out.println("(" + m[i][0] + ", " + m[i][1] + ")");
		}
	}

}
