/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_29;

/**
 * @author up
 *
 */
import javax.swing.*;

public class FlashingText_002 extends JApplet implements Runnable{
	private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);
	
	public FlashingText_002(){
		add(jlblText);
		new Thread(this).start();
	}
	
	public void run(){
		try{
			while(true){
				if(jlblText.getText() == null){
					jlblText.setText("Welcome");
				}else{
					jlblText.setText(null);
				}
				
				Thread.sleep(200);
			}
		}catch(InterruptedException ex){
			
		}
	}

}
