/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_35;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MVCDemo_004 extends JApplet{
	private JButton jbtController = new JButton("Show Controller");
	private JButton jbtView = new JButton("Show View");
	private CircleModel_001 model = new CircleModel_001();
	
	public void MVCDemo_004(){
		setLayout(new FlowLayout());
		add(jbtController);
		add(jbtView);
		
		jbtController.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame();
				CircleController_003 controller = new CircleController_003();
				controller.setModel(model);
				frame.add(controller);
				frame.setSize(200, 200);
				frame.setLocation(200, 200);
				frame.setVisible(true);
			}
		});
		
		jbtView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame frame = new JFrame("View");
				CircleView_002 view = new CircleView_002();
				view.setModel(model);
				frame.add(view);
				frame.setSize(500, 200);
				frame.setLocation(200, 200);
				frame.setVisible(true);
			}
		});
	}

}
