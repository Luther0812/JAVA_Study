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
import java.awt.*;

public class ListCellRendererDemo_010 extends JApplet{
	private final static int NUMBER_OF_NATIONS = 7;
	private String[] nations = new String[]{"Denmark", "Germany", "China", "India", "Norway", "UK", "US"};
	private ImageIcon[] icons = new ImageIcon[NUMBER_OF_NATIONS];
	private ImageIcon[] bigIcons = new ImageIcon[NUMBER_OF_NATIONS];
	
	private DefaultListModel listModel = new DefaultListModel();
	private JList jlstNations = new JList(listModel);
	private ListCellRenderer renderer = new MyListCellRenderer_009();
	private JSplitPane jSplitPanel = new JSplitPane();
	private JLabel jlblImage = new JLabel("", JLabel.CENTER);
	
	public ListCellRendererDemo_010(){
		for(int i = 0; i < NUMBER_OF_NATIONS; i++){
			icons[i] = new ImageIcon(getClass().getResource("image/flagIcon" + i + ".gif"));
			listModel.addElement(new Object[]{icons[i], nations[i]});
			bigIcons[i] = new ImageIcon(getClass().getResource("image/flag" + i + ".gif"));
		}
		
		jlstNations.setCellRenderer(renderer);
		jlstNations.setPreferredSize(new Dimension(200, 200));
		jSplitPanel.setLeftComponent(new JScrollPane(jlstNations));
		jSplitPanel.setRightComponent(jlblImage);
		jlstNations.setSelectedIndex(0);
		jlblImage.setIcon(bigIcons[0]);
		add(jSplitPanel, BorderLayout.CENTER);
		
		jlstNations.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				jlblImage.setIcon(bigIcons[jlstNations.getSelectedIndex()]);
			}
		});
	}

}
