/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author up
 *
 */
public class Chapter_Test_012 {
	public static void main(String[] args){
		int n = 0, m = 0;
		int[] arr = new int[10];
		while(n < 10){
			if(m % 2 == 0 || m % 3 == 0){
				String str = Integer.toString(m);
				String param = "50";
				Pattern p = Pattern.compile(param);
				Matcher aa = p.matcher(str);
				if(aa.find()){
					System.out.println(m);
					n++;
					m++;
				}else{
					m++;
				}
			}else{
				m++;
			}
		}
	}

}
