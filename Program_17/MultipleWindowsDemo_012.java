/**Language:Java Standard Edition
 * Author:Luther
 */
package Program_17;

/**
 * @author up
 *
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultipleWindowsDemo_012 extends JFrame{
	private JTextArea jta;
	private JButton jbtShowHistogram = new JButton("Show Histogram");
	private Histogram_013 histogram = new Histogram_013();
	
	private JFrame histogramFrame = new JFrame();
	
	public MultipleWindowsDemo_012(){
		JScrollPane scrollPane = new JScrollPane(jta = new JTextArea());
		scrollPane.setPreferredSize(new Dimension(300, 200));
		jta.setWrapStyleWord(true);
		jta.setLineWrap(true);
		
		add(scrollPane, BorderLayout.CENTER);
		add(jbtShowHistogram, BorderLayout.SOUTH);
		
		jbtShowHistogram.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int[] count = countLetters();
				histogram.showHistogram(count);
				histogramFrame.setVisible(true);
			}
		});
		
		histogramFrame.add(histogram);
		histogramFrame.pack();
		histogramFrame.setTitle("Histogram");
	}
	
	private int[] countLetters(){
		int[] count = new int[26];
		
		String text = jta.getText();
		
		for(int i = 0; i < text.length(); i++){
			char character = text.charAt(i);
			
			if((character >= 'A') && (character <= 'Z')){
				count[character - 'A']++;
			}else if((character >= 'a') && (character <= 'z')){
				count[character - 'a']++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args){
		MultipleWindowsDemo_012 frame = new MultipleWindowsDemo_012();
		frame.setTitle("MultipleWindowsDemo_012");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
