/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_35;

/**
 * @author up
 *
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CircleController_003 extends JPanel{
	private CircleModel_001 model;
	private JTextField jtfRadius = new JTextField();
	private JComboBox jcboFilled = new JComboBox(new Boolean[]{new Boolean(false), new Boolean(true)});
	
	public CircleController_003(){
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 1));
		panel1.add(new JLabel("Radius"));
		panel1.add(new JLabel("Filled"));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2, 1));
		panel2.add(jtfRadius);
		panel2.add(jcboFilled);
		
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.WEST);
		add(panel2, BorderLayout.CENTER);
		
		jtfRadius.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(model == null){
					return;
				}
				model.setRadius(new Double(jtfRadius.getText()).doubleValue());
			}
		});
		
		jcboFilled.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(model == null){
					return;
				}
				model.setFilled(((Boolean)jcboFilled.getSelectedItem()).booleanValue());
			}
		});
	}
	
	public void setModel(CircleModel_001 newModel){
		model = newModel;
	}
	
	public CircleModel_001 getModel(){
		return model;
	}

}
