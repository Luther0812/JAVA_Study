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

public class Chapter_Test_005 extends JFrame{
	private JTextField t1 = new JTextField();
	private JTextField t2 = new JTextField();
	private JTextField t3 = new JTextField();
	private JTextField t4 = new JTextField();
	
	private JButton b1 = new JButton("Calculator");
	
	public Chapter_Test_005(){
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 2));
		p1.add(new JLabel("Investment Amount"));
		t1.setBorder(new LineBorder(Color.CYAN, 1));
		t1.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t1);
		p1.add(new JLabel("Year"));
		t2.setBorder(new LineBorder(Color.CYAN, 1));
		t2.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t2);
		p1.add(new JLabel("Annual Interest Rate"));
		t3.setBorder(new LineBorder(Color.CYAN, 1));
		t3.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t3);
		p1.add(new JLabel("Future Value"));
		t4.setHorizontalAlignment(JTextField.RIGHT);
		p1.add(t4);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.add(b1);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		ActionListener_005 listener = new ActionListener_005();
		b1.addActionListener(listener);
	}
	
	class ActionListener_005 implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result = Double.parseDouble(t1.getText()) * Math.pow((1 + (Double.parseDouble(t3.getText()) / 1200)), (12 * Double.parseDouble(t2.getText())));
			t4.setText(String.format("%.2f", result));
		}
	}
	
	public static void main(String[] args){
		Chapter_Test_005 frame = new Chapter_Test_005();
		frame.setTitle("Chapter_Test_005");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
