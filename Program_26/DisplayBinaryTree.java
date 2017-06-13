/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_26;

/**
 * @author up
 *
 */
import javax.swing.*;

public class DisplayBinaryTree extends JApplet {
	public DisplayBinaryTree(){
		add(new TreeControl(new BinaryTree<Integer>()));
	}

}
