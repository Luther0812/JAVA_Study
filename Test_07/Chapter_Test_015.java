/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_07;

/**
 * @author LiuYu
 *
 */
public class Chapter_Test_015 {
	public static void main(String[] args){
		double[][] set1 = {
				{1, 1},
				{2, 2},
				{3, 3},
				{4, 4}
		};
		double[][] set2 = {
				{0, 1},
				{1, 2},
				{4, 5},
				{5, 6}
		};
		double[][] set3 = {
				{0, 1},
				{1, 2},
				{4, 5},
				{4.5, 4}
		};
		
		double k = (set1[1][1] - set1[0][1]) / (set1[1][0] - set1[0][0]);
		int num = 0;
		for(int i = 0; i < set1.length; i++){
			for(int j = 1 + i; j < set1.length; j++){
				double t = (set1[j][1] - set1[i][1]) / (set1[j][0] - set1[i][0]);
				if(t != k){
					num++;
				}
			}
		}
		if(num != 0){
			System.out.println("The points are not in a line");
		}else{
			System.out.println("The points are in a line");
		}
	}

}
