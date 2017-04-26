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

public class TextAreaDemo_007 extends JFrame{
	private DescriptionPanel_006 descriptionPanel = new DescriptionPanel_006();
	
	public static void main(String[] args){
		TextAreaDemo_007 frame = new TextAreaDemo_007();
		frame.setTitle("TextAreaDemo_007");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public TextAreaDemo_007(){
		descriptionPanel.setTitle("Canada");
		String description = "The maple Leaf flag \n\n" + 
		"The Canadian National Flag was adopted by the Canadian";
		descriptionPanel.setDescription(description);
		descriptionPanel.setImageIcon(new ImageIcon("image/ca/gif"));
		
		setLayout(new BorderLayout());
		add(descriptionPanel, BorderLayout.CENTER);
	}

}
