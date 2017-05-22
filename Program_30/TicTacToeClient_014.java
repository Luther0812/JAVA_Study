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
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.io.*;
import java.net.*;

public class TicTacToeClient_014 extends JApplet implements Runnable, TicTacToeConstants_012{
	private boolean myTurn = false;
	private char myToken = ' ';
	private char otherToken = ' ';
	private Cell [][] cell = new Cell[3][3];
	private JLabel jlblTitle = new JLabel();
	private JLabel jlblStatus = new JLabel();
	private int rowSelected;
	private int columnSelected;
	private DataInputStream fromServer;
	private DataOutputStream toServer;
	private boolean continueToPlay = true;
	private boolean waiting = true;
	private boolean isStandAlone = false;
	private String host = "localhost";
	
	public void init(){
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 3, 0, 0));
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				p.add(cell[i][j] = new Cell(i, j));
			}
		}
		p.setBorder(new LineBorder(Color.BLACK, 1));
		jlblTitle.setHorizontalAlignment(JLabel.CENTER);
		jlblTitle.setFont(new Font("SansSerif", Font.BOLD, 16));
		jlblTitle.setBorder(new LineBorder(Color.black, 1));
		jlblStatus.setBorder(new LineBorder(Color.black, 1));
		
		add(jlblTitle, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		add(jlblStatus, BorderLayout.SOUTH);
		
		connectToServer();
	}
	
	private void connectToServer(){
		try{
			Socket socket;
			if(isStandAlone){
				socket = new Socket(host, 8000);
			}else{
				socket = new Socket(getCodeBase().getHost(), 8000);
			}
			
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
		}catch(Exception ex){
			System.err.println(ex);
		}
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void run(){
		try{
			int player = fromServer.readInt();
			if(player == PLAYER1){
				myToken = 'X';
				otherToken = 'O';
				jlblTitle.setText("Player 1 with token 'X'");
				jlblStatus.setText("Waiting for player 2 to join");
				
				fromServer.readInt();
				jlblStatus.setText("Player 2 has joined. I start first");
				myTurn = true;
			}else if(player == PLAYER2){
				myToken = 'O';
				otherToken = 'X';
				jlblTitle.setText("Player 2 with token 'O'");
				jlblStatus.setText("Waiting for player 1 to join");
			}
			
			while(continueToPlay){
				if(player == PLAYER1){
					waitForPlayerAction();
					sendMove();
					receiveInfoFromServer();
				}else if(player == PLAYER2){
					receiveInfoFromServer();
					waitForPlayerAction();
					sendMove();
				}
			}
		}catch(Exception ex){
			
		}
	}
	
	private void waitForPlayerAction() throws InterruptedException{
		while(waiting){
			Thread.sleep(100);
		}
		waiting = true;
	}
	
	private void sendMove() throws IOException{
		toServer.writeInt(rowSelected);
		toServer.writeInt(columnSelected);
	}
	
	private void receiveInfoFromServer() throws IOException{
		int status = fromServer.readInt();
		
		if(status == PLAYER1_WON){
			continueToPlay = false;
			if(myToken == 'X'){
				jlblStatus.setText("I won! (X)");
			}else if(myToken == 'O'){
					jlblStatus.setText("Player 1(X) has Won");
					receiveMove();
			}
		}else if(status == PLAYER2_WON){
			continueToPlay = false;
			if(myToken == 'O'){
				jlblStatus.setText("I won! (O)");
			}else if(myToken == 'X'){
					jlblStatus.setText("Player 2(O) has Won");
					receiveMove();
			}
		}else if(status == DRAW){
			continueToPlay = false;
			jlblStatus.setText("Game is over, no winner!");
			
			if(myToken == 'O'){
				receiveMove();
			}
		}else{
			receiveMove();
			jlblStatus.setText("My turn");
			myTurn = true;
		}
	}
	
	public void receiveMove() throws IOException{
		int row = fromServer.readInt();
		int column = fromServer.readInt();
		cell[row][column].setToken(otherToken);
	}
	
	public class Cell extends JPanel{
		private int row;
		private int column;
		
		private char token = ' ';
		
		public Cell(int row, int column){
			this.row = row;
			this.column = column;
			setBorder(new LineBorder(Color.black, 1));
			addMouseListener(new ClickListener());
		}
		
		public char getToken(){
			return token;
		}
		
		public void setToken(char c){
			token = c;
			repaint();
		}
		
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			if(token == 'X'){
				g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
				g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
			}else if(token == 'O'){
				g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
			}
		}
		
		private class ClickListener extends MouseAdapter{
			public void mouseClicked(MouseEvent e){
				if((token == ' ') && myTurn){
					setToken(myToken);
					myTurn = false;
					rowSelected = row;
					columnSelected = column;
					jlblStatus.setText("Waiting for the other player to move");
					waiting = false;
				}
			}
		}
	}

}
