/**Language:Java Standard Edition
 * Author:Luther
 */
package Test_15;

/**
 * @author LiuYu
 *
 */
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.io.*;

public class Chapter_Test_027 extends JFrame{
	public static void main(String[] args) throws IOException{
		try{
			Chapter_Test_027 frame = new Chapter_Test_027();
			frame.setTitle("Chapter_Test_027");
			frame.setSize(300, 400);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		}catch(Exception ex){
			System.out.println("main");
		}
	}
	
	public Chapter_Test_027() throws Exception{
		int[][] list;
		try{
			File file = new File("data.txt");
			Scanner input = new Scanner(file);
			int t = Integer.valueOf(input.nextLine());
			list = new int[t][t + 1];
			while(input.hasNext()){
				for(int i = 0; i < list.length; i++){
					String temp = input.nextLine();
					String[] text = new String[t + 1];
					text = temp.split(" ");
					for(int j = 0; j < text.length; j++){
						list[i][j] = Integer.valueOf(text[j]);
					}
				}
			}
			input.close();
			add(new NewPanel_027(list));
		}catch(Exception ex){
			System.out.println(ex);
		}
	}

}

class NewPanel_027 extends JPanel{
	private int[][] list;
	
	public NewPanel_027(){
		
	}
	
	public NewPanel_027(int[][] list){
		this.list = list;
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		int radius = (int)(Math.min(width, height) * 0.02);
		
		for(int i = 0; i < list.length; i++){
			g.fillOval(list[i][0], list[i][1], radius, radius);
		}
		
		for(int i = 0; i < list.length; i++){
			for(int j = 2; j < list[i].length; j++){
				if(list[i][j] != 0){
					g.drawLine(list[i][0], list[i][1], list[list[i][j]][0], list[list[i][j]][1]);
				}
			}
		}
	}
}
