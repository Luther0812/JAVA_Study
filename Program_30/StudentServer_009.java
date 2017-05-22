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

public class StudentServer_009 {
	private ObjectOutputStream outputToFile;
	private ObjectInputStream inputFromClient;
	
	public static void main(String[] args){
		new StudentServer_009();
	}
	
	public StudentServer_009(){
		try{
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started");
			
			outputToFile = new ObjectOutputStream(new FileOutputStream("Student.dat", true));
			
			while(true){
				Socket socket = serverSocket.accept();
				
				inputFromClient = new ObjectInputStream(socket.getInputStream());
				
				Object object = inputFromClient.readObject();
				
				outputToFile.writeObject(object);
				System.out.println("A new student object is stored");
			}
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			try{
				inputFromClient.close();
				outputToFile.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

}
