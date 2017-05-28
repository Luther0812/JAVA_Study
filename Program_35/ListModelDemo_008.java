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

public class ListModelDemo_008 extends JApplet{
	private DefaultListModel listModel = new DefaultListModel();
	private JList jlst = new JList(listModel);
	private JButton jbtAdd = new JButton("Add new item");
	private JButton jbtRemove = new JButton("Remove selected item");
	
	public ListModelDemo_008(){
		listModel.addElement("Item1");
		listModel.addElement("Item2");
		listModel.addElement("Item3");
		listModel.addElement("Item4");
		listModel.addElement("Item5");
		listModel.addElement("Item6");
		
		JPanel panel = new JPanel();
		panel.add(jbtAdd);
		panel.add(jbtRemove);
		
		jbtAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String newItem = JOptionPane.showInputDialog("Enter a new item");
				
				if(newItem != null){
					listModel.addElement(newItem);
				}else{
					listModel.add(jlst.getSelectedIndex(), newItem);
				}
			}
		});
		
		jbtRemove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				listModel.remove(jlst.getSelectedIndex());
			}
		});
	}

}
