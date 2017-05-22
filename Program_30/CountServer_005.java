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

public class CountServer_005 {
	private RandomAccessFile raf;
	private int count;
	
	public static void main(String[] args){
		new CountServer_005();
	}
	
	public CountServer_005(){
		try{
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started");
			
			raf = new RandomAccessFile("count.dat", "rw");
			
			if(raf.length() == 0){
				count = 0;
			}else{
				count = raf.readInt();
			}
			
			while(true){
				Socket socket = serverSocket.accept();
				
				DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
				
				count++;
				outputToClient.writeInt(count);
				
				raf.seek(0);
				raf.writeInt(count);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}

}
