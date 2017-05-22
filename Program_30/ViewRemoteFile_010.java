/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_30;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ViewRemoteFile_010 extends JApplet{
	private JButton jbtView = new JButton("View");
	private JTextField jtfURL = new JTextField(12);
	private JTextArea jtaFile = new JTextArea();
	private JLabel jlblStatus = new JLabel();
	
	public void init(){
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(new JLabel("FileName"), BorderLayout.WEST);
		p1.add(jtfURL, BorderLayout.CENTER);
		p1.add(jbtView, BorderLayout.EAST);
		
		setLayout(new BorderLayout());
		add(new JScrollPane(jtaFile), BorderLayout.CENTER);
		add(p1, BorderLayout.NORTH);
		add(jlblStatus, BorderLayout.SOUTH);
		
		jbtView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				showFile();
			}
		});
	}
	
	public void showFile(){
		java.util.Scanner input = null;
		URL url = null;
		
		try{
			url = new URL(jtfURL.getText().trim());
			input = new java.util.Scanner(url.openStream());
			while(input.hasNext()){
				jtaFile.append(input.nextLine() + "\n");
			}
			jlblStatus.setText("File loaded successfully");
		}catch(MalformedURLException ex){
			jlblStatus.setText("URL " + url + " not found.");
		}catch(IOException e){
			jlblStatus.setText(e.getMessage());
		}finally{
			if(input != null){
				input.close();
			}
		}
	}

}
