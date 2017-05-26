/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_33;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowLayout_008 extends JApplet{
	private String flowLayoutDesc = "FlowLayout arranges components according to their preferredSize in a left-to-right flow, much like lines of text in a paragraph.";
	private String gridLayoutDesc = "GridLayout arranges ...";
	private String boxLayoutDesc = "BoxLayout arranges ...";
	
	private JRadioButton jrbFlowLayout = new JRadioButton("FlowLayout");
	private JRadioButton jrbGridLayout = new JRadioButton("GridLayout", true);
	private JRadioButton jrbBoxLayout = new JRadioButton("BoxLayout");
	
	private JPanel jpComponents = new JPanel();
	private JTextArea jtfDescription = new JTextArea();
	
	private FlowLayout flowLayout = new FlowLayout();
	private GridLayout gridLayout = new GridLayout(2, 2, 3, 3);
	private BoxLayout boxLayout = new BoxLayout(jpComponents, BoxLayout.X_AXIS);
	
	public ShowLayout_008(){
		Box jpChooseLayout = Box.createVerticalBox();
		jpChooseLayout.add(jrbFlowLayout);
		jpChooseLayout.add(jrbGridLayout);
		jpChooseLayout.add(jrbBoxLayout);
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(jrbFlowLayout);
		btg.add(jrbGridLayout);
		btg.add(jrbBoxLayout);
		
		jtfDescription.setLineWrap(true);
		jtfDescription.setWrapStyleWord(true);
		
		jpComponents.add(new JButton("Button 1"));
		jpComponents.add(new JButton("Button 2"));
		jpComponents.add(new JButton("Button 3"));
		jpComponents.add(new JButton("Button 4"));
		
		
		JSplitPane jSplitPane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, jpComponents, new JScrollPane(jtfDescription));
		JSplitPane jSplitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jpChooseLayout, jSplitPane2);
		
		jpComponents.setLayout(flowLayout);
		jpComponents.revalidate();
		jtfDescription.setText(flowLayoutDesc);
		
		add(jSplitPane1, BorderLayout.CENTER);
		
		jrbFlowLayout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jpComponents.setLayout(flowLayout);
				jtfDescription.setText(flowLayoutDesc);
				jpComponents.revalidate();
			}
		});
		jrbBoxLayout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jpComponents.setLayout(boxLayout);
				jtfDescription.setText(boxLayoutDesc);
				jpComponents.revalidate();
			}
		});
		jrbGridLayout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jpComponents.setLayout(gridLayout);
				jtfDescription.setText(gridLayoutDesc);
				jpComponents.revalidate();
			}
		});
	}

}
