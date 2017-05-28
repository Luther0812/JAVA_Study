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

public class ComboBoxCellRendererDemo_011 extends JApplet{
	private final static int NUMBER_OF_NATIONS = 7;
	private String[] nations = new String[]{"Denmark", "Germany", "China", "India", "Norway", "UK", "US"};
	private ImageIcon[] icons = new ImageIcon[NUMBER_OF_NATIONS];
	private ImageIcon[] bigIcons = new ImageIcon[NUMBER_OF_NATIONS];
	
	private DefaultComboBoxModel model = new DefaultComboBoxModel();
	private JComboBox jcboCountries = new JComboBox(model);
	
	private MyListCellRenderer_009 renderer = new MyListCellRenderer_009();
	
	private JLabel jlblImage = new JLabel("", JLabel.CENTER);
	
	public ComboBoxCellRendererDemo_011(){
		for(int i = 0; i < NUMBER_OF_NATIONS; i++){
			icons[i] = new ImageIcon(getClass().getResource("image/flagIcon" + i + ".gif"));
			model.addElement(new Object[]{icons[i], nations[i]});
			bigIcons[i] = new ImageIcon(getClass().getResource("image/flag" + i + ".gif"));
		}
		
		jcboCountries.setRenderer(renderer);
		jlblImage.setIcon(bigIcons[0]);
		add(jcboCountries, java.awt.BorderLayout.NORTH);
		add(jlblImage, java.awt.BorderLayout.CENTER);
		
		jcboCountries.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jlblImage.setIcon(bigIcons[jcboCountries.getSelectedIndex()]);
			}
		});
	}

}
