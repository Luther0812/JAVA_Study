/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_30;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import javax.swing.event.*;
import java.io.*;

public class WebBrowser_011 extends JApplet{
	private JEditorPane jep = new JEditorPane();
	private JLabel jlblURL = new JLabel("URL");
	private JTextField jtfURL = new JTextField();
	
	public void init(){
		JPanel jpURL = new JPanel();
		jpURL.setLayout(new BorderLayout());
		jpURL.add(jlblURL, BorderLayout.WEST);
		jpURL.add(jtfURL, BorderLayout.CENTER);
		
		add(new JScrollPane(jep), BorderLayout.CENTER);
		add(jpURL, BorderLayout.NORTH);
		
		jep.setEditable(false);
		
		jep.addHyperlinkListener(new HyperlinkListener(){
			public void hyperlinkUpdate(HyperlinkEvent e){
				try{
					jep.setPage(e.getURL());
				}catch(IOException ex){
					System.out.println(ex);
				}
			}
		});
		
		jtfURL.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{
					URL url = new URL(jtfURL.getText().trim());
					jep.setPage(url);
				}catch(IOException ex){
					System.out.println(ex);
				}
			}
		});
	}

}
