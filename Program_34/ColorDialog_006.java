/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorDialog_006 extends JDialog{
	private int redValue, greenValue, blueValue;
	private Color color = null;
	
	private JSlider jslRed = new JSlider(0, 128);
	private JSlider jslGreen = new JSlider(0, 128);
	private JSlider jslBlue = new JSlider(0, 128);
	
	private JButton jbtOK = new JButton("OK");
	private JButton jbtCancel = new JButton("Cancel");
	
	private JPanel jpSelectedColor = new JPanel();
	
	public ColorDialog_006(){
		this(null, true);
	}
	
	public ColorDialog_006(java.awt.Frame parent, boolean modal){
		super(parent, modal);
		setTitle("Choose Color");
		
		JPanel jpButtons = new JPanel();
		jpButtons.add(jbtOK);
		jpButtons.add(jbtCancel);
		
		JPanel jpLabels = new JPanel();
		jpLabels.setLayout(new GridLayout(3, 0));
		jpLabels.add(new JLabel("Red"));
		jpLabels.add(new JLabel("Green"));
		jpLabels.add(new JLabel("Blue"));
		
		JPanel jpSliders = new JPanel();
		jpSliders.setLayout(new GridLayout(3, 0));
		jpSliders.add(jslRed);
		jpSliders.add(jslGreen);
		jpSliders.add(jslBlue);
		
		JPanel jpSelectColor = new JPanel();
		jpSelectColor.setLayout(new BorderLayout());
		jpSelectColor.setBorder(BorderFactory.createTitledBorder("Select Color"));
		jpSelectColor.add(jpLabels, BorderLayout.SOUTH);
		jpSelectColor.add(jpSliders, BorderLayout.CENTER);
		
		JPanel jpColor = new JPanel();
		jpColor.setLayout(new BorderLayout());
		jpColor.add(jpSelectColor, BorderLayout.SOUTH);
		jpColor.add(jpSelectedColor, BorderLayout.CENTER);
		
		add(jpButtons, BorderLayout.SOUTH);
		add(jpColor, BorderLayout.CENTER);
		pack();
		
		jbtOK.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
			}
		});
		jbtCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				color = null;
				setVisible(false);
			}
		});
		
		jslRed.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				redValue = jslRed.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
		jslGreen.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				greenValue = jslRed.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
		jslBlue.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e){
				blueValue = jslRed.getValue();
				color = new Color(redValue, greenValue, blueValue);
				jpSelectedColor.setBackground(color);
			}
		});
	}
	
	public Dimension getPreferredSize(){
		return new java.awt.Dimension(200, 200);
	}
	
	public Color getColor(){
		return color;
	}

}
