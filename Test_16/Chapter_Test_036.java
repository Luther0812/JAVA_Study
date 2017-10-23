/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author up
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class Chapter_Test_036 extends JFrame{
	private NewJLabel_036 j1 = new NewJLabel_036("H");
	private NewJLabel_036 j2 = new NewJLabel_036("H");
	private NewJLabel_036 j3 = new NewJLabel_036("H");
	private NewJLabel_036 j4 = new NewJLabel_036("H");
	private NewJLabel_036 j5 = new NewJLabel_036("H");
	private NewJLabel_036 j6 = new NewJLabel_036("H");
	private NewJLabel_036 j7 = new NewJLabel_036("H");
	private NewJLabel_036 j8 = new NewJLabel_036("H");
	private NewJLabel_036 j9 = new NewJLabel_036("H");
	
	public static void main(String[] args){
		Chapter_Test_036 frame = new Chapter_Test_036();
		frame.setTitle("Chapter_Test_036");
		frame.setSize(300, 240);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public Chapter_Test_036(){
		setLayout(new GridLayout(3, 3, 1, 1));
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		add(j7);
		add(j8);
		add(j9);
	}
	
	class NewJLabel_036 extends JLabel{
		private String text;
		private int count = 0;
		
		public NewJLabel_036(String s){
			super(s, CENTER);
			setFont(new java.awt.Font("Dialog", 1, 30));
			setBorder(BorderFactory.createLineBorder(Color.RED));
			addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					count++;
					if(e.getButton() == MouseEvent.BUTTON1){
						if(count % 2 == 0){
							setText("H");
						}else{
							setText("T");
						}
					}
				}
			});
		}
		
	}

}
