/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_12;

/**
 * @author LiuYu
 *
 */
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ShowFlowLayout_003 {
	public static void main(String[] args){
		ShowFlowLayout frame = new ShowFlowLayout();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ShowFlowLayout extends JFrame{
	public ShowFlowLayout(){
		FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setHgap(10);
		flowLayout.setVgap(20);
		setLayout(flowLayout);
		
		add(new JLabel("First Name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
}
