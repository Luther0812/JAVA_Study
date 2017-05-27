/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuDemo_001 extends JApplet{
	private JTextField jtfNum1, jtfNum2, jtfResult;
	private JButton jbtAdd, jbtSub, jbtMul, jbtDiv;
	private JMenuItem jmiAdd, jmiSub, jmiMul, jmiDiv, jmiClose;
	
	public MenuDemo_001(){
		JMenuBar jmb = new JMenuBar();
		setJMenuBar(jmb);
		
		JMenu operationMenu = new JMenu("Operation");
		operationMenu.setMnemonic('O');
		jmb.add(operationMenu);
		
		JMenu exitMenu = new JMenu("Exit");
		exitMenu.setMnemonic('E');
		jmb.add(exitMenu);
		
		operationMenu.add(jmiAdd = new JMenuItem("Add", 'A'));
		operationMenu.add(jmiSub = new JMenuItem("Subtract", 'S'));
		operationMenu.add(jmiMul = new JMenuItem("Multiply", 'M'));
		operationMenu.add(jmiDiv = new JMenuItem("Divide", 'D'));
		exitMenu.add(jmiClose = new JMenuItem("Close", 'C'));
		
		jmiAdd.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		jmiSub.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		jmiMul.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
		jmiDiv.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		
		JPanel p1 = new JPanel(new FlowLayout());
		p1.add(new JLabel("Number 1"));
		p1.add(jtfNum1 = new JTextField(3));
		p1.add(new JLabel("Number 2"));
		p1.add(jtfNum2 = new JTextField(3));
		p1.add(new JLabel("Result"));
		p1.add(jtfResult = new JTextField(4));
		jtfResult.setEditable(false);
		
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(jbtAdd = new JButton("Add"));
		p2.add(jbtSub = new JButton("Subtract"));
		p2.add(jbtMul = new JButton("Multiply"));
		p2.add(jbtDiv = new JButton("Divide"));
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		jbtAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('+');
			}
		});
		jbtSub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('-');
			}
		});
		jbtMul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('*');
			}
		});
		jbtDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('/');
			}
		});
		jmiAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('+');
			}
		});
		jmiSub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('-');
			}
		});
		jmiMul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('*');
			}
		});
		jmiDiv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculate('/');
			}
		});
		jmiClose.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
	}
	
	private void calculate(char operator){
		int num1 = (Integer.parseInt(jtfNum1.getText().trim()));
		int num2 = (Integer.parseInt(jtfNum2.getText().trim()));
		int result = 0;
		
		switch(operator){
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		}
		
		jtfResult.setText(String.valueOf(result));
	}

}
