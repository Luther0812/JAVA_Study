/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_18;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BallControl_008 extends JPanel{
	private Ball_007 ball = new Ball_007();
	private JButton jbtSuspend = new JButton("Suspend");
	private JButton jbtResume = new JButton("Resume");
	private JScrollBar jsbDelay = new JScrollBar();
	
	public BallControl_008(){
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		
		ball.setBorder(new javax.swing.border.LineBorder(Color.red));
		jsbDelay.setOrientation(JScrollBar.HORIZONTAL);
		ball.setDelay(jsbDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jsbDelay, BorderLayout.NORTH);
		add(ball, BorderLayout.CENTER);
		add(panel, BorderLayout.SOUTH);
		
		jbtSuspend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ball.suspend();
			}
		});
		
		jbtResume.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ball.resume();
			}
		});
		
		jsbDelay.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				ball.setDelay(jsbDelay.getMaximum() - e.getValue());
			}
		});
	}

}
