/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_18;

/**
 * @author up
 *
 */
import javax.swing.*;

public class DisplayImageWithURL_011 extends JApplet{
	public DisplayImageWithURL_011(){
		java.net.URL url = this.getClass().getResource("image/us.gif");
		add(new JLabel(new ImageIcon(url)));
	}

}
