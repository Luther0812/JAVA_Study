/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_34;

/**
 * @author up
 *
 */
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEditor_008 extends JApplet{
	private ImageIcon openImageIcon = new ImageIcon(getClass().getResource("image/open.gif"));
	private ImageIcon saveImageIcon = new ImageIcon(getClass().getResource("image/save.gif"));
	
	private JMenuItem jmiOpen = new JMenuItem("Open", openImageIcon);
	private JMenuItem jmiSave = new JMenuItem("Save", saveImageIcon);
	private JMenuItem jmiClear = new JMenuItem("Clear");
	private JMenuItem jmiExit = new JMenuItem("Exit");
	private JMenuItem jmiForeground = new JMenuItem("Foreground");
	private JMenuItem jmiBackground = new JMenuItem("Background");
	
	private JButton jbtOpen = new JButton(openImageIcon);
	private JButton jbtSave = new JButton(saveImageIcon);
	private JLabel jlblStatus = new JLabel();
	
	private JFileChooser jFileChooser1 = new JFileChooser(new File("."));
	
	private JTextArea jta = new JTextArea();
	
	public TextEditor_008(){
		JMenu jMenu1 = new JMenu("File");
		jMenu1.add(jmiOpen);
		jMenu1.add(jmiSave);
		jMenu1.add(jmiClear);
		jMenu1.addSeparator();
		jMenu1.add(jmiExit);
		
		JMenu jMenu2 = new JMenu("Edit");
		jMenu2.add(jmiForeground);
		jMenu2.add(jmiBackground);
		
		JMenuBar jMenuBar1 = new JMenuBar();
		jMenuBar1.add(jMenu1);
		jMenuBar1.add(jMenu2);
		
		setJMenuBar(jMenuBar1);
		
		JToolBar jToolBar1 = new JToolBar();
		jToolBar1.add(jbtOpen);
		jToolBar1.add(jbtSave);
		
		jmiOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				open();
			}
		});
		jmiSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				save();
			}
		});
		jmiClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jta.setText(null);
			}
		});
		jmiExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		jmiForeground.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Color selectedColor = JColorChooser.showDialog(null, "Chose Foreground Color", jta.getForeground());
				
				if(selectedColor != null){
					jta.setForeground(selectedColor);
				}
			}
		});
		
		jmiBackground.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Color selectedColor = JColorChooser.showDialog(null, "Chose Background Color", jta.getForeground());
				
				if(selectedColor != null){
					jta.setBackground(selectedColor);
				}
			}
		});
		
		jbtOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				open();
			}
		});
		
		jbtSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				save();
			}
		});
		
		add(jToolBar1, BorderLayout.NORTH);
		add(jlblStatus, BorderLayout.SOUTH);
		add(new JScrollPane(jta), BorderLayout.CENTER);
	}
	
	private void open(){
		if(jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
			open(jFileChooser1.getSelectedFile());
		}
	}
	
	private void open(File file){
		try{
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
			byte[] b = new byte[in.available()];
			in.read(b, 0, b.length);
			jta.append(new String(b, 0, b.length));
			in.close();
			
			jlblStatus.setToolTipText(file.getName() + " Opened ");
		}catch(IOException ex){
			jlblStatus.setText("Error opening " + file.getName());
		}
	}
	
	private void save(){
		if(jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
			save(jFileChooser1.getSelectedFile());
		}
	}
	
	private void save(File file){
		try{
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
			byte[] b = (jta.getText()).getBytes();
			out.write(b, 0, b.length);
			out.close();
			
			jlblStatus.setText(file.getName() + " Saved ");
		}catch(IOException ex){
			jlblStatus.setText("Error saving " + file.getName());
		}
	}

}
