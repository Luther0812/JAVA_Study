/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import java.util.Scanner;

public class Chapter_Test_035 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a genome string: ");
		String gene = input.nextLine();
		String[] G = getGene(gene);
		for(String u: G){
			if(u != null){
				System.out.println(u);
			}
		}
	}
	
	public static String[] getGene(String gene){
		String[] temp = new String[(int)(gene.length() / 3)];
		int num = 0;
		for(int i = 0; i < gene.length() - 2; i++){
			if(gene.substring(i, (i + 3)).equals("ATG")){
				for(int j = i + 1; j <= gene.length() - 3; j++){
					if(gene.substring(j, (j + 3)).equals("TAG") || gene.substring(j, (j + 3)).equals("TAA") || gene.substring(j, (j + 3)).equals("TGA")){
						if(j - i != 1){
							temp[num] = gene.substring(i + 3, j);
							num++;
							i = j + 3;
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i < temp.length; i++){
			String t = temp[i];
			if(t != null){
				StringBuilder a = new StringBuilder(t);
				for(int j = 0; j < t.length() - 2; j++){
					if(t.substring(j, j + 3).equals("ATG") || t.substring(j, j + 3).equals("ATG") || t.substring(j, j + 3).equals("ATG")){
						a.delete(j, j + 3);
					}
				}
				temp[i] = a.toString();
			}
		}
		return temp;
	}

}
