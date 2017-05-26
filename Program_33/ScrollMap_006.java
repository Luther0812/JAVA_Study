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
import javax.swing.border.*;

public class ScrollMap_006 extends JApplet{
	private JLabel lblIndianaMap = new JLabel(new ImageIcon(getClass().getResource("image/indianaMap.gif")));
	private JLabel lblOhioMap = new JLabel(new ImageIcon(getClass().getResource("image/ohioMap.gif")));
	
	private JScrollPane jspMap = new JScrollPane(lblIndianaMap);
	
	public ScrollMap_006(){
		JComboBox jcboMap = new JComboBox(new String[]{"Indiana", "Ohio"});
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(jcboMap);
		p.setBorder(new TitledBorder("Select a map to display"));
		
		jspMap.setColumnHeaderView(new JLabel(new ImageIcon(getClass().getResource("image/horizontalRuler.gif"))));
		jspMap.setRowHeaderView(new JLabel(new ImageIcon(getClass().getResource("image/verticalRuler.gif"))));
		jspMap.setCorner(JScrollPane.UPPER_LEFT_CORNER, new CornerPanel(JScrollPane.UPPER_LEFT_CORNER));
		jspMap.setCorner(JScrollPane.UPPER_RIGHT_CORNER, new CornerPanel(JScrollPane.UPPER_RIGHT_CORNER));
		jspMap.setCorner(JScrollPane.LOWER_LEFT_CORNER, new CornerPanel(JScrollPane.LOWER_LEFT_CORNER));
		jspMap.setCorner(JScrollPane.LOWER_RIGHT_CORNER, new CornerPanel(JScrollPane.LOWER_RIGHT_CORNER));
		
		add(jspMap, BorderLayout.CENTER);
		add(p, BorderLayout.NORTH);
		
		jcboMap.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				String selectedItem = (String)e.getItem();
				if(selectedItem.equals("Indiana")){
					jspMap.setViewportView(lblIndianaMap);
				}else if(selectedItem.equals("Ohio")){
					jspMap.setViewportView(lblOhioMap);
				}
				
				jspMap.revalidate();
			}
		});
	}

}

class CornerPanel extends JPanel{
	private String location;
	public CornerPanel(String location){
		this.location = location;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(location == "UPPER_LEFT_CORNER"){
			g.drawLine(0, getHeight(), getWidth(), 0);
		}else if(location == "UPPER_RIGHT_CORNER"){
			g.drawLine(0, 0, getWidth(), getHeight());
		}else if(location == "LOWER_LEFT_CORNER"){
			g.drawLine(0, getHeight(), getWidth(), 0);
		}else if(location == "LOWER_RIGHT_CORNER"){
			g.drawLine(0, 0, getWidth(), getHeight());
		}
	}
}
