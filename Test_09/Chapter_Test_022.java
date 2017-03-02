/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_09;

/**
 * @author LiuYu
 *
 */
import javax.swing.JOptionPane;

public class Chapter_Test_022 {
	public static void main(String[] args){
		String[][] area = {
				{"Alabama AL", "Montgomery"},
				{"Alaska AK", "Juneau"},
				{"Arizona AZ", "Phoenix"},
				{"Arkansas AR", "Little rock"},
				{"California CA", "Sacramento"},
				{"Colorado CO", "Denver"},
				{"Connecticut CT", "Hartford"},
				{"Delaware DE", "Dover"},
				{"Florida FL", "Tallahassee"},
				{"Georgia GA", "Atlanta"},
				{"Hawaii HI", "Honolulu"},
				{"Idaho ID", "Boise"},
				{"Illinois IL", "Springfield"},
				{"Indiana IN", "Indianapolis"},
				{"Iowa IA", "Des Moines"},
				{"Kansas KS", "Topeka"},
				{"Kentucky KY", "Frankfort"},
				{"Louisiana LA", "Baton Rouge"},
				{"Maine ME", "Augusta"},
				{"Maryland MD", "Annapolis"},
				{"Massachusetts MA", "Boston"},
				{"Michigan MI", "Lansing"},
				{"Minnesota MN", "St. Paul"},
				{"Mississippi MS", "Jackson"},
				{"Missouri MO", "Jefferson City"},
				{"Montana MT", "Helena"},
				{"Nebraska NE", "Lincoln"},
				{"Nevada NV", "Carson City"},
				{"New Hampshire NH", "Concord"},
				{"New Jersey NJ", "Trenton"},
				{"New Mexico NM", "Santa Fe"},
				{"New York NY", "Albany"},
				{"North Carolina NC", "Raleigh"},
				{"North Dakota ND", "Bismarck"},
				{"Ohio OH", "Columbus"},
				{"Oklahoma OK", "Oklahoma City"},
				{"Oregon OR", "Salem"},
				{"Pennsylvania PA", "Harrisburg"},
				{"Rhode Island RL", "Providence"},
				{"South Carolina SC", "Columbia"},
				{"South Dakota SD ", "Pierre"},
				{"Tennessee TN", "Nashville"},
				{"Texas TX", "Austin"},
				{"Utah UT", "Salt Lake City"},
				{"Vermont VT", "Montpelier"},
				{"Virginia VA", "Richmond"},
				{"Washington WA", "Olympia"},
				{"West Virginia WV ", "Charleston"},
				{"Wisconsin WI", "Madison"},
				{"Wyoming WY", "Cheyenne"},
		};
		int count = 0;
		for(int i = 0; i < 10; i++){
			int t = (int)(Math.random() * 50);
			String capital = JOptionPane.showInputDialog("Enter the capital of " + area[t][0]);
			if(capital == area[t][1]){
				JOptionPane.showMessageDialog(null, "Your answer is correct");
				count++;
			}else{
				JOptionPane.showMessageDialog(null, "Your answer is not correct");
			}
		}
		JOptionPane.showMessageDialog(null, "The correct you have answered is " + count);
		
	}

}
