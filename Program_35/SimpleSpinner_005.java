/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_35;

/**
 * @author up
 *
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.BorderLayout;

public class SimpleSpinner_005 extends JApplet{
	private JSpinner spinner = new JSpinner();
	
	private JLabel label = new JLabel("", JLabel.CENTER);
	
	public SimpleSpinner_005(){
		add(spinner, BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		
		spinner.addChangeListener(new ChangeListener(){
			public void stateChanged(javax.swing.event.ChangeEvent e){
				label.setText("Previos value: " + spinner.getPreviousValue() + " Currnet value: " + spinner.getValue() + " Next value: " + spinner.getNextValue());
			}
		});
	}

}
