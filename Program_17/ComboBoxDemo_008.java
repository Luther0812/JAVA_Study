/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxDemo_008 extends JFrame{
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kindom", "United States of America"};
	
	private ImageIcon[] flagImages = {
			new ImageIcon("image/ca.gif"),
			new ImageIcon("image/china.gif"),
			new ImageIcon("image/denmark.gif"),
			new ImageIcon("image/fr.gif"),
			new ImageIcon("image/germany.gif"),
			new ImageIcon("image/india.gif"),
			new ImageIcon("image/norway.gif"),
			new ImageIcon("image/uk.gif"),
			new ImageIcon("image/us.gif")
	};
	
	private String[] flagDescription = new String[9];
	
	private DescriptionPanel_006 descriptionPanel = new DescriptionPanel_006();
	
	private JComboBox jcbo = new JComboBox(flagTitles);
	
	public static void main(String[] args){
		ComboBoxDemo_008 frame = new ComboBoxDemo_008();
		frame.pack();
		frame.setTitle("ComboBoxDemo_008");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public ComboBoxDemo_008(){
		flagDescription[0] = "Canada\n\ntest";
		flagDescription[1] = "China\n\ntest";
		flagDescription[2] = "Denmark\n\ntest";
		flagDescription[3] = "France\n\ntest";
		flagDescription[4] = "Germany\n\ntest";
		flagDescription[5] = "India\n\ntest";
		flagDescription[6] = "Germary\n\ntest";
		flagDescription[7] = "UK\n\ntest";
		flagDescription[8] = "US\n\ntest";
		
		setDisplay(0);
		
		add(jcbo, BorderLayout.NORTH);
		add(descriptionPanel, BorderLayout.CENTER);
		
		jcbo.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				setDisplay(jcbo.getSelectedIndex());
			}
		});
	}
	
	public void setDisplay(int index){
		descriptionPanel.setTitle(flagTitles[index]);
		descriptionPanel.setImageIcon(flagImages[index]);
		descriptionPanel.setDescription(flagDescription[index]);
	}

}
