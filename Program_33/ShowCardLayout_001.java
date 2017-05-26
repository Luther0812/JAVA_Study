/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_33;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowCardLayout_001 extends JApplet{
	private CardLayout cardLayout = new CardLayout(20, 10);
	private JPanel cardPanel = new JPanel(cardLayout);
	
	private JButton jbtFirst, jbtNext, jbtPrevious, jbtLast;
	private JComboBox jcboImage;
	private final int NUM_OF_FLAGS = 6;
	
	public ShowCardLayout_001(){
		cardPanel.setBorder(new javax.swing.border.LineBorder(Color.red));
		
		for(int i = 0; i < NUM_OF_FLAGS; i++){
			JLabel label = new JLabel(new ImageIcon("image/flag" + i + ".gif"));
			cardPanel.add(label, String.valueOf(i));
		}
		
		JPanel p = new JPanel();
		p.add(jbtFirst = new JButton("First"));
		p.add(jbtNext = new JButton("Next"));
		p.add(jbtPrevious = new JButton("Previous"));
		p.add(jbtLast = new JButton("Last"));
		p.add(new JLabel("Image"));
		p.add(jcboImage = new JComboBox());
		
		for(int i = 1; i <= NUM_OF_FLAGS; i++){
			jcboImage.addItem(String.valueOf(i));
		}
		
		add(cardPanel, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		jbtFirst.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cardLayout.first(cardPanel);
			}
		});
		jbtNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cardLayout.next(cardPanel);
			}
		});
		jbtPrevious.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cardLayout.previous(cardPanel);
			}
		});
		jbtLast.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				cardLayout.last(cardPanel);
			}
		});
		jcboImage.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				cardLayout.show(cardPanel, (String)e.getItem());
			}
		});
	}

}
