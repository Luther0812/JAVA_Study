/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_16;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Chapter_Test_004 extends JFrame{
	private JTextField t1 = new JTextField(5);
	private JTextField t2 = new JTextField(5);
	private JTextField t3 = new JTextField(10);
	
	private JButton b1 = new JButton("Add");
	private JButton b2 = new JButton("Subtract");
	private JButton b3 = new JButton("Multiply");
	private JButton b4 = new JButton("Divide");
	
	public Chapter_Test_004(){
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Number 1"));
		p1.add(t1);
		p1.add(new JLabel("Number 2"));
		p1.add(t2);
		p1.add(new JLabel("Result"));
		t3.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t3);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		
		ActionListener_004 listener = new ActionListener_004();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		
		p1.setBorder(new LineBorder(Color.BLACK, 2));
		p2.setBorder(new LineBorder(Color.BLUE, 2));
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args){
		Chapter_Test_004 frame = new Chapter_Test_004();
		frame.setTitle("Chapter_Test_004");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class ActionListener_004 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == b1){
				double result = Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText());
				t3.setText(String.format("%.2f", result));
			}else if(e.getSource() == b2){
				double result = Double.parseDouble(t1.getText()) - Double.parseDouble(t2.getText());
				t3.setText(String.format("%.2f", result));
			}else if(e.getSource() == b3){
				double result = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
				t3.setText(String.format("%.2f", result));
			}else if(e.getSource() == b4){
				double result = Double.parseDouble(t1.getText()) / Double.parseDouble(t2.getText());
				t3.setText(String.format("%.2f", result));
			}
		}
	}

}
