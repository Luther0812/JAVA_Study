/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo_009 extends JFrame{
	final int NUMBER_OF_FLAGS = 9;
	private String[] flagTitles = {"Canada", "China", "Denmark", "France", "Germany", "India", "Norway", "United Kindom", "United States of America"};
	private JList jlst = new JList(flagTitles);
	private ImageIcon[] imageIcons = {
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
	private JLabel[] jlblImageViewer = new JLabel[NUMBER_OF_FLAGS];
	
	public static void main(String[] args){
		ListDemo_009 frame = new ListDemo_009();
		frame.setTitle("ListDemo_009");
		frame.setSize(650, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public ListDemo_009(){
		JPanel p = new JPanel(new GridLayout(3, 3, 5, 3));
		
		for(int i = 0; i < NUMBER_OF_FLAGS; i++){
			p.add(jlblImageViewer[i] = new JLabel());
			jlblImageViewer[i].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		add(p, BorderLayout.CENTER);
		add(new JScrollPane(jlst), BorderLayout.WEST);
		
		jlst.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				int[] indices = jlst.getSelectedIndices();
				
				int i;
				
				for(i = 0; i < indices.length; i++){
					jlblImageViewer[i].setIcon(imageIcons[indices[i]]);
				}
				
				for(; i < NUMBER_OF_FLAGS; i++){
					jlblImageViewer[i].setIcon(null);
				}
			}
		});
	}

}
