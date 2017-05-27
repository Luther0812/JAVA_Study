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
import java.awt.event.*;

public class PopupMenuDemo_002 extends JApplet{
	private JPopupMenu jPopupMenu1 = new JPopupMenu();
	private JMenuItem jmiNew = new JMenuItem("New", new ImageIcon(getClass().getResource("image/new.gif")));
	private JMenuItem jmiOpen = new JMenuItem("Open", new ImageIcon(getClass().getResource("image/open.gif")));
	private JMenuItem jmiPrint = new JMenuItem("Print", new ImageIcon(getClass().getResource("image/print.gif")));
	
	private JMenuItem jmiExit = new JMenuItem("Exit");
	private JTextArea jTextArea1 = new JTextArea();
	
	public PopupMenuDemo_002(){
		jPopupMenu1.add(jmiNew);
		jPopupMenu1.add(jmiOpen);
		jPopupMenu1.addSeparator();
		jPopupMenu1.add(jmiPrint);
		jPopupMenu1.addSeparator();
		jPopupMenu1.add(jmiExit);
		
		add(new JScrollPane(jTextArea1), BorderLayout.CENTER);
		
		jmiNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Process New");
			}
		});
		jmiOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Process Open");
			}
		});
		jmiPrint.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Process Print");
			}
		});
		jmiExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		jTextArea1.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				showPopup(e);
			}
			
			public void mouseReleased(MouseEvent e){
				showPopup(e);
			}
		});
	}
	
	private void showPopup(java.awt.event.MouseEvent evt){
		if(evt.isPopupTrigger()){
			jPopupMenu1.show(evt.getComponent(), evt.getX(), evt.getY());
		}
	}

}
