/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;

public class DescriptionPanel_006 extends JPanel{
	private JLabel jlblImageTitle = new JLabel();
	
	private JTextArea jtaDescription = new JTextArea();
	
	public DescriptionPanel_006(){
		jlblImageTitle.setHorizontalAlignment(JLabel.CENTER);
		jlblImageTitle.setHorizontalTextPosition(JLabel.CENTER);
		jlblImageTitle.setVerticalTextPosition(JLabel.BOTTOM);
		
		jtaDescription.setLineWrap(true);
		jtaDescription.setWrapStyleWord(true);
		jtaDescription.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(jtaDescription);
		
		setLayout(new BorderLayout(5, 5));
		add(scrollPane, BorderLayout.CENTER);
		add(jlblImageTitle, BorderLayout.WEST);
	}
	
	public void setTitle(String title){
		jlblImageTitle.setText(title);
	}
	
	public void setImageIcon(ImageIcon icon){
		jlblImageTitle.setIcon(icon);
	}
	
	public void setDescription(String text){
		jtaDescription.setText(text);
	}

}
