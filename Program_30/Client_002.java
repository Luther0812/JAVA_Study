/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_30;

/**
 * @author up
 *
 */
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client_002 extends JFrame{
	private JTextField jtf = new JTextField();
	
	private JTextArea jta = new JTextArea();
	
	private DataOutputStream toServer;
	private DataInputStream fromServer;
	
	public static void main(String[] args){
		new Client_002();
	}
	
	public Client_002(){
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(new JLabel("Enter radius"), BorderLayout.WEST);
		p.add(jtf, BorderLayout.CENTER);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		
		setLayout(new BorderLayout());
		add(p, BorderLayout.NORTH);
		add(new JScrollPane(jta), BorderLayout.CENTER);
		
		jtf.addActionListener(new TextFieldListener());
		
		setTitle("Client_002");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		try{
			Socket socket = new Socket("localhost", 8000);
			
			fromServer = new DataInputStream(socket.getInputStream());
			
			toServer = new DataOutputStream(socket.getOutputStream());
		}catch(IOException ex){
			jta.append(ex.toString() + '\n');
		}
	}
	
	private class TextFieldListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				double radius = Double.parseDouble(jtf.getText().trim());
				
				toServer.writeDouble(radius);
				toServer.flush();
				
				double area = fromServer.readDouble();
				
				jta.append("Radius is " + radius + "\n");
				jta.append("Area received from the server is " + area + "\n");
			}catch(IOException ex){
				System.err.println(ex);
			}
		}
	}

}
