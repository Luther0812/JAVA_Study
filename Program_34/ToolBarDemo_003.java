/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;

public class ToolBarDemo_003 extends JApplet{
	private JButton jbtNew = new JButton(new ImageIcon(getClass().getResource("image/new.gif")));
	private JButton jbtOpen = new JButton(new ImageIcon(getClass().getResource("image/open.gif")));
	private JButton jbtPrint = new JButton(new ImageIcon(getClass().getResource("image/print.gif")));
	
	public ToolBarDemo_003(){
		JToolBar jToolBar1 = new JToolBar("My Toolbar");
		jToolBar1.setFloatable(true);
		jToolBar1.add(jbtNew);
		jToolBar1.add(jbtOpen);
		jToolBar1.add(jbtPrint);
		
		jbtNew.setToolTipText("New");
		jbtOpen.setToolTipText("Open");
		jbtPrint.setToolTipText("Print");
		
		jbtNew.setBorderPainted(false);
		jbtOpen.setBorderPainted(false);
		jbtPrint.setBorderPainted(false);
		
		add(jToolBar1, BorderLayout.NORTH);
	}

}
